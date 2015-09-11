package com.hp.data;

import com.hp.data.bean.tbox.*;
import com.hp.data.util.PackageEntityManager;
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
        //standardTest(byteString,RegisterResp.class);
        RegisterResp resp=new RegisterResp();
        resp.setSendingTime(1234567l);
        resp.setApplicationID((short)19);
        resp.setMessageID((short)2);
        resp.setEventID(123456l);
        resp.setRegisterResult((short)(1));
        DataPackage dp=new DataPackage("8995_19_2");
        dp.fillBean(resp);
        ByteBuffer bb=conversionTBox.generate(dp);
        String str=PackageEntityManager.getByteString(bb);
        System.out.println(str);
        RegisterResp rr=this.conversionTBox.generate(bb).loadBean(RegisterResp.class);
        PackageEntityManager.printEntity(rr);
    }

    @Test
     public void testTBOX_WarningMessage() {
        String byteString="23 23 00 2F 01 55 D2 10 59 24 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 1E 1E 07 06 01 00 01 C4 ";
        standardTest(byteString,WarningMessage.class);
    }
    @Test
    public void testTBOX_RemoteControlCmd() {
        String byteString="23 23 00 0D 01 81 92 EA 54 31 01 00 00 0B 10 00 06 00 8C ";
        standardTest(byteString,RemoteControlCmd.class);
    }
    @Test
    public void testTBOX_RemoteControlAck() {
        String byteString="23 23 00 20 01 55 D2 10 6C 31 02 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0B 10 00 F2 ";
        standardTest(byteString,RemoteControlAck.class);
    }
    @Test
    public void testTBOX_RealTimeReportMes() {
        String byteString="23 23 00 4C 01 55 D2 10 6D 22 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 FE 00 00 00 01 00 03 5A 84 00 00 00 03 00 00 00 00 00 00 00 00 3C 00 32 00 46 00 5A 00 28 28 06 00 00 00 00 00 00 00 00 FE FF 00 00 00 00 00 00 0A AA ";
        standardTest(byteString,RealTimeReportMes.class);
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