package com.hp.data;

import com.hp.data.bean.tbox.RegisterReq;
import com.hp.data.bean.tbox.RegisterResp;
import com.hp.data.convert.PackageEntityManager;
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
    public void testTBOX_RegisterReq() {
        String byteString="23 23 00 4D 01 55 D2 0F E7 13 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 55 BE E2 58 00 00 00 00 00 00 00 00 00 00 00 00 00 00 31 32 33 34 35 36 37 38 39 31 39 39 39 31 32 33 34 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 5D ";
        standardTest(byteString,RegisterReq.class);
    }
    @Test
    public void testTBOX_RegisterResp() {
        String byteString="23 23 00 0B 01 55 D2 0F E7 13 02 55 BE E2 58 00 25 ";
        standardTest(byteString,RegisterResp.class);
    }

    /**
     * 标准测试方法
     * 首先将传入字符串解析成传入的数据包实体类，然后打印该实体类，然后再将这个实体类解析成ByteBuffer，最后判断该ByteBuffer是否和传入的byte字符串一致
     * @param byteString    16进制字符串
     * @param dataEntityClass   数据包实体类类型
     * @param <T>   数据包实体类泛型
     */
    private <T> void standardTest(String byteString,Class<T> dataEntityClass){
        ByteBuffer bb=PackageEntityManager.getByteBuffer(byteString);
        //读
        DataPackage dp=conversionTBox.generate(bb);
        T bean=dp.loadBean(dataEntityClass);
        String key = dp.getKey();
        PackageEntityManager.printEntity(bean);
        //写
        DataPackage dpw=new DataPackage(key);
        dpw.fillBean(bean);
        ByteBuffer bbw=conversionTBox.generate(dpw);
        String byteStr=PackageEntityManager.getByteString(bbw);
        System.out.println(byteStr);
        System.out.println(byteString);
        Assert.assertTrue(byteStr.equals(byteString));
    }
}