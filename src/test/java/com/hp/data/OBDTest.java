package com.hp.data;

import com.hp.data.bean.obd.Req1603;
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
public class OBDTest {
    @Autowired
    private Conversion conversionOBD;
    @Before
    public void setUp() {}

    @After
    public void tearDown() {}

    @Test
    public void testRead() {
        ByteBuffer bb= ByteBuffer.allocate(1024);
        String byteString="AA 55 00 4B FF B4 00 05 16 03 49 4E 43 41 52 30 30 30 30 30 33 00 00 00 00 3D 37 00 4C 53 56 46 56 36 31 38 33 44 32 32 30 30 39 33 32 00 56 31 2E 35 30 2E 30 30 00 56 30 2E 30 30 2E 30 30 00 56 33 2E 31 33 2E 31 35 00 FF 01 0F 22 ";
        String[] command=byteString.split(" ");
        byte[] abc=new byte[command.length];
        for(int i=0;i<command.length;i++){
            abc[i]=Integer.valueOf(command[i],16).byteValue();
        }
        bb.put(abc);
        bb.flip();
        //读
        DataPackage dp=conversionOBD.generate(bb);
        Req1603 bean=dp.loadBean(Req1603.class);
        String key = dp.getKey();
        System.out.println(bean.toString());
        //写
        DataPackage dpw=new DataPackage(key);
        dpw.fillBean(bean);
        ByteBuffer bbw=conversionOBD.generate(dpw);
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