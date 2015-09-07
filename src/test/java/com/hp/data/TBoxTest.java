package com.hp.data;

import com.hp.data.bean.tbox.RegisterReq;
import com.hp.data.core.Conversion;
import com.hp.data.core.DataPackage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.nio.ByteBuffer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(locations = "classpath:spring-config.xml")
public class TBoxTest {
    @Autowired
    private Conversion conversionTBox;
    @Before
    public void setUp() {}

    @After
    public void tearDown() {}

    @Test
    public void testRead() {
        ByteBuffer bb= ByteBuffer.allocate(1024);
        String byteString="23 23 00 4D 01 55 D2 0F E7 13 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 55 BE E2 58 00 00 00 00 00 00 00 00 00 00 00 00 00 00 31 32 33 34 35 36 37 38 39 31 39 39 39 31 32 33 34 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 5D ";
        String[] command=byteString.split(" ");
        byte[] abc=new byte[command.length];
        for(int i=0;i<command.length;i++){
            abc[i]=Integer.valueOf(command[i],16).byteValue();
        }
        bb.put(abc);
        bb.flip();
        //读
        DataPackage dp=conversionTBox.generate(bb);
        RegisterReq bean=dp.loadBean(RegisterReq.class);
        String key = dp.getKey();
        System.out.println(bean.toString());
        //写
        DataPackage dpw=new DataPackage(key);
        dpw.fillBean(bean);
        ByteBuffer bbw=conversionTBox.generate(dpw);
        String byteStr=getByteString(bbw);
        System.out.println(byteStr);
        System.out.println(byteString);
        Assert.assertTrue(byteStr.equals(byteString));
    }

    private static String getByteString(ByteBuffer bb){
        bb.flip();
        StringBuilder stringBuffer=new StringBuilder();
        for(int i=0;i<bb.limit();i++){
            String byteStr=Integer.toHexString(bb.get()).toUpperCase();
            if(byteStr.length()==1)byteStr="0"+byteStr;
            if(byteStr.length()!=2)byteStr=byteStr.substring(byteStr.length()-2);
            stringBuffer.append(byteStr).append(" ");
        }
        return stringBuffer.toString();
    }

}