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
@SpringApplicationConfiguration(classes = Application.class)
public class TBoxTest {
    @Autowired
    private Conversion conversionTBox;
    @Before
    public void setUp() {}
    @After
    public void tearDown() {}
    @Test
    public void testTBOX_RegisterReq() {
       String byteString="23 23 00 4C 00 56 0A 3C C4 13 01 33 35 32 32 35 35 30 36 30 31 31 36 32 32 39 01 02 03 00 01 00 01 C4 3C 0A 56 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 00 00 01 00 00 00 00 01 60 ";
       standardTest(byteString,RegisterReq.class);

       RegisterReq req=new RegisterReq();
        req.setSendingTime(1444812349l);
        req.setApplicationID((short) 19);
        req.setMessageID((short) 1);
        req.setEventID(1444812349l);
        req.setVin("12345678919991234");
        req.setSerialNumber("123456789199");//12位
        req.setImei("355065053311001");
        req.setProtocolVersionNumber((short) 0);
        req.setTripID(12);
        req.setVehicleID(new byte[]{(byte) 0, (byte) 0});
        req.setReserved(0);
        req.setDbcVersion("00000");
        req.setParamVersion("00000");
        req.setSwVersion("00000");

        DataPackage dp=new DataPackage("8995_19_1");
        dp.fillBean(req);
        ByteBuffer bb=conversionTBox.generate(dp);
        String str=PackageEntityManager.getByteString(bb);
        System.out.println(str);
        RegisterReq rr=this.conversionTBox.generate(bb).loadBean(RegisterReq.class);
        PackageEntityManager.printEntity(rr);
    }
    @Test
    public void testTBOX_RegisterResp() {
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
        String byteString="23 23 00 30 01 55 D2 10 59 24 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 1E 1E 07 06 01 00 01 DB ";
        standardTest(byteString,WarningMessage.class);
    }
    @Test
    public void testTBOX_RemoteControlCmd() {
        String byteString="23 23 00 0D 01 81 92 EA 54 31 01 00 00 0B 10 00 06 00 8C ";
        standardTest(byteString,RemoteControlCmd.class);
    }
    @Test
    public void testTBOX_RemoteControlAck() {
        String byteString="23 23 00 21 01 55 D2 10 6C 31 02 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0B 10 00 F3 ";
        standardTest(byteString,RemoteControlAck.class);
    }
    @Test
    public void testTBOX_RealTimeReportMes() {
        String byteString="23 23 00 4D 01 55 D2 10 6D 22 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 FE 00 00 00 01 00 03 5A 84 00 00 00 03 00 00 00 00 00 00 00 00 3C 00 32 00 46 00 5A 00 28 28 06 00 00 00 00 00 00 00 00 FE FF 00 00 00 00 00 00 0A AB ";
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
        Assert.assertTrue(byteStr.trim().equals(byteString.trim()));
    }
}