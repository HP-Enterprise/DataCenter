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

    ////////////////////////
    @Test
    public void testTBOX_ActiveHandle() {
        String byteString="23 23 00 3D 01 56 04 B7 1E 12 01 31 32 33 34 35 36 37 38 39 30 31 32 33 34 35 00 00 00 00 00 00 00 55 BE E2 58 31 32 33 34 35 36 37 38 39 31 39 39 31 32 33 34 35 36 37 38 39 31 39 39 39 31 32 33 34 88 ";
        standardTest(byteString,ActiveReq.class);
        String byteStr="23 23 00 21 01 56 04 BF DA 12 03 31 32 33 34 35 36 37 38 39 30 31 32 33 34 35 00 00 00 00 00 00 00 55 BE E2 58 00 67 ";
        standardTest(byteStr,ActiveResult.class);

    }
    @Test
    public void  testTBOX_RemoteWakeUpReq() {
        //远程唤醒测试
        String byteString="23 23 00 4C 01 56 04 AD 8C 14 01 31 32 33 34 35 36 37 38 39 30 31 32 33 34 35 00 00 00 00 00 00 00 55 BE E2 58 31 32 33 34 35 36 37 38 39 31 39 39 31 32 33 34 35 36 37 38 39 31 39 39 39 31 32 33 34 30 30 30 30 30 30 30 30 30 30 30 30 30 30 30 47 ";
        standardTest(byteString, RemoteWakeUpReq.class);

    }
    @Test
    public void test_BuildDiaRequest() {
        //电检测试

        DiaRequest hr=new DiaRequest();
        hr.setTestFlag((short) 1);
        hr.setTestFlag((short) 1);
        hr.setSendingTime(1443151834l);
        hr.setApplicationID((short) 17);//>>>
        hr.setMessageID((short) 1);//>>>
        hr.setImei("123456789012345");
        hr.setProtocolVersionNumber((short) 1);
        hr.setVehicleID(new byte[]{(byte) 0, (byte) 0});
        hr.setTripID(1);
        hr.setReserved(0);
        hr.setTestTime(1443151834l);
        hr.setSerialNumber("123456123456");
        hr.setServerCommTest((short) 1);
        hr.setSdTest((short) 1);

        hr.setLedTest((short) 1);
        hr.setResetBatteryMapArrayTest((short) 1);
        hr.setGpsTest((short) 1);
        hr.setGprsTest((short) 1);
        hr.setCanActionTest((short) 1);
        hr.setFarmTest((short) 1);

        hr.setDiaReportDataSize((short) 8);
        hr.setEventID((long) 1444812349);

        DataPackage dpw=new DataPackage("8995_17_1");//>>>
        dpw.fillBean(hr);
        ByteBuffer bbw=conversionTBox.generate(dpw);
        String byteStr=PackageEntityManager.getByteString(bbw);
        System.out.println(byteStr);

        ByteBuffer bb=PackageEntityManager.getByteBuffer(byteStr);
        DataPackage dp=conversionTBox.generate(bb);
        DiaRequest bean=dp.loadBean(DiaRequest.class);
        PackageEntityManager.printEntity(bean);

    }

    @Test
    public void test_HeartbeatReq() {
        //心跳测试
        String byteString="23 23 00 20 01 55 D2 0F E7 26 01 00 00 00 00 00 00 00 00 00 00 11 00 00 00 00 00 00 00 00 00 00 00 55 BE E2 58 29 ";
        standardTest(byteString, HeartbeatReq.class);
        }

    @Test
    public void test_getRemoteControlAck() {
        //测试
        String byteString="23 23 00 21 01 56 05 13 02 31 02 31 32 33 34 35 36 37 38 39 30 31 32 33 34 35 01 00 01 01 00 00 00 55 BE E2 58 00 31 ";
        standardTest(byteString, RemoteControlAck.class);
    }

    @Test
    public void test_handleParmSetAck(){
        String byteString="23 23 00 3B 01 56 24 99 71 52 02 31 32 33 34 35 36 37 38 39 30 31 32 33 34 35 01 00 00 00 01 00 00 56 1E 16 3D 0D 01 02 03 04 05 06 07 08 09 0A 0B 0C 0D 00 00 00 00 00 00 00 00 00 00 00 00 00 AF ";
        standardTest(byteString, PramSetupAck.class);

    }
    @Test
    public void test_RegularReportMes(){
        //测试固定数据保存
        String byteString="23 23 00 3D 01 56 04 BF DA 21 01 31 32 33 34 35 36 37 38 39 30 31 32 33 34 35 01 00 00 00 01 00 00 00 0A 00 0A 0A 00 0A 00 0A 01 00 01 64 31 32 33 34 35 31 32 33 34 35 00 0A 00 00 C0 A8 01 0B 23 28 16 ";
        standardTest(byteString, RegularReportMes.class);
    }
    @Test
    public void test_BuildRealTimeReportMes(){
        RealTimeReportMes hr=new RealTimeReportMes();
        hr.setTestFlag((short) 1);
        hr.setSendingTime(1443151834l);
        hr.setApplicationID((short) 34);//>>>
        hr.setMessageID((short) 1);//>>>
        hr.setImei("123456789012345");
        hr.setProtocolVersionNumber((short) 1);
        hr.setVehicleID(new byte[]{(byte) 0, (byte) 0});
        hr.setTripID(1);
        hr.setReserved(0);

        hr.setIsLocation((short) 1);
        hr.setLatitude(114256398l);
        hr.setLongitude(111l);
        hr.setSpeed(123);
        hr.setHeading(230);
        hr.setFuelOil((short) 10);
        hr.setAvgOil(11);
        hr.setOilLife((short) 15);
        hr.setDriveRange(new byte[]{(byte) 99, (byte) 99, (byte) 90});
        hr.setLeftFrontTirePressure(251);
        hr.setLeftRearTirePressure(252);
        hr.setRightFrontTirePressure(253);
        hr.setRightRearTirePressure(254);
        hr.setWindowInformation((short) 170);
        hr.setVehicleTemperature((short) 65);
        hr.setVehicleOuterTemperature((short) 67);
        hr.setDoorInformation((short) 170);
        hr.setSingleBatteryVoltage(14000);
        hr.setMaximumVoltagePowerBatteryPack((short) 200);
        hr.setMaximumBatteryVoltage(15000);
        hr.setBatteryMonomerMinimumVoltage(14000);
        hr.setEngineCondition((short) 170);
        hr.setEngineSpeed(4000);
        hr.setRapidAcceleration(200);
        hr.setRapidDeceleration(300);
        hr.setSpeeding(30);
        hr.setSignalStrength((short) 10);

        DataPackage dpw=new DataPackage("8995_34_1");//>>>
        dpw.fillBean(hr);
        ByteBuffer bbw=conversionTBox.generate(dpw);
        String byteStr=PackageEntityManager.getByteString(bbw);
        System.out.println(byteStr);

        ByteBuffer bb=PackageEntityManager.getByteBuffer(byteStr);
        DataPackage dp=conversionTBox.generate(bb);
        RealTimeReportMes bean=dp.loadBean(RealTimeReportMes.class);
        PackageEntityManager.printEntity(bean);
    }

    @Test
    public void test_BuildRegularReportMes(){
        RegularReportMes hr=new RegularReportMes();
        hr.setTestFlag((short) 1);
        hr.setSendingTime(1443151834l);
        hr.setApplicationID((short) 33);//>>>
        hr.setMessageID((short) 1);//>>>
        hr.setImei("123456789012345");
        hr.setProtocolVersionNumber((short) 1);
        hr.setVehicleID(new byte[]{(byte) 0, (byte) 0});
        hr.setTripID(1);
        hr.setReserved(0);

        hr.setFrequencyForRealTimeReport(10);
        hr.setFrequencyForWarningReport(10);
        hr.setFrequencyHeartbeat((short) 10);
        hr.setTimeOutForTerminalSearch(10);
        hr.setTimeOutForServerSearch(10);
        hr.setVehicleType((short) 1);
        hr.setVehicleModels(1);
        hr.setMaxSpeed((short) 100);
        hr.setHardwareVersion("12345");
        hr.setSoftwareVersion("12345");
        hr.setFrequencySaveLocalMedia(10);
        hr.setEnterpriseBroadcastAddress(new byte[]{(byte) 0, (byte) 0, (byte) 192, (byte) 168, (byte) 1, (byte) 11});
        hr.setEnterpriseBroadcastPort(9000);


        DataPackage dpw=new DataPackage("8995_33_1");//>>>
        dpw.fillBean(hr);
        ByteBuffer bbw=conversionTBox.generate(dpw);
        String byteStr=PackageEntityManager.getByteString(bbw);
        System.out.println(byteStr);

        ByteBuffer bb=PackageEntityManager.getByteBuffer(byteStr);
        DataPackage dp=conversionTBox.generate(bb);
        RegularReportMes bean=dp.loadBean(RegularReportMes.class);
        PackageEntityManager.printEntity(bean);
    }
    @Test
    public void test_BuildWarningMes(){
        WarningMessage hr=new WarningMessage();
        hr.setTestFlag((short) 1);
        hr.setSendingTime(1443151834l);
        hr.setApplicationID((short) 36);//>>>
        hr.setMessageID((short) 1);//>>>
        hr.setImei("123456789012345");
        hr.setProtocolVersionNumber((short) 1);
        hr.setVehicleID(new byte[]{(byte) 0, (byte) 0});
        hr.setTripID(1);
        hr.setReserved(0);

        hr.setIsLocation((short) 1);
        hr.setLatitude(114256398l);
        hr.setLongitude(111l);
        hr.setSpeed(123);
        hr.setHeading(230);

        hr.setBcm1((byte) 170);
        hr.setEms((byte) 170);
        hr.setTcu((byte) 170);
        hr.setIc((byte) 170);
        hr.setAbs((byte) 170);
        hr.setPdc((byte) 170);
        hr.setBcm2((byte) 170);


        DataPackage dpw=new DataPackage("8995_36_1");//>>>
        dpw.fillBean(hr);
        ByteBuffer bbw=conversionTBox.generate(dpw);
        String byteStr=PackageEntityManager.getByteString(bbw);
        System.out.println(byteStr);

        ByteBuffer bb=PackageEntityManager.getByteBuffer(byteStr);
        DataPackage dp=conversionTBox.generate(bb);
        WarningMessage bean=dp.loadBean(WarningMessage.class);
        PackageEntityManager.printEntity(bean);
    }

    @Test
    public void test_BuildResendMes(){
        DataResendMes hr=new DataResendMes();
        hr.setTestFlag((short) 1);
        hr.setSendingTime(1443151834l);
        hr.setApplicationID((short) 35);//>>>
        hr.setMessageID((short) 1);//>>>
        hr.setImei("123456789012345");
        hr.setProtocolVersionNumber((short) 1);
        hr.setVehicleID(new byte[]{(byte) 0, (byte) 0});
        hr.setTripID(1);
        hr.setReserved(0);

        hr.setIsLocation((short) 1);
        hr.setLatitude(114256398l);
        hr.setLongitude(111l);
        hr.setSpeed(123);
        hr.setHeading(230);
        hr.setFuelOil((short) 10);
        hr.setAvgOil(11);
        hr.setOilLife((short) 15);
        hr.setDriveRange(new byte[]{(byte) 99, (byte) 99, (byte) 90});
        hr.setLeftFrontTirePressure(251);
        hr.setLeftRearTirePressure(252);
        hr.setRightFrontTirePressure(253);
        hr.setRightRearTirePressure(254);
        hr.setWindowInformation((short) 170);
        hr.setVehicleTemperature((short) 65);
        hr.setVehicleOuterTemperature((short) 67);
        hr.setDoorInformation((short) 170);
        hr.setSingleBatteryVoltage(14000);
        hr.setMaximumVoltagePowerBatteryPack((short) 200);
        hr.setMaximumBatteryVoltage(15000);
        hr.setBatteryMonomerMinimumVoltage(14000);
        hr.setEngineCondition((short) 170);
        hr.setEngineSpeed(4000);
        hr.setRapidAcceleration(200);
        hr.setRapidDeceleration(300);
        hr.setSpeeding(30);
        hr.setSignalStrength((short) 10);

        hr.setBcm1((byte) 170);
        hr.setEms((byte) 170);
        hr.setTcu((byte) 170);
        hr.setIc((byte) 170);
        hr.setAbs((byte) 170);
        hr.setPdc((byte) 170);
        hr.setBcm2((byte) 170);

        DataPackage dpw=new DataPackage("8995_35_1");//>>>
        dpw.fillBean(hr);
        ByteBuffer bbw=conversionTBox.generate(dpw);
        String byteStr=PackageEntityManager.getByteString(bbw);
        System.out.println(byteStr);

        ByteBuffer bb=PackageEntityManager.getByteBuffer(byteStr);
        DataPackage dp=conversionTBox.generate(bb);
        DataResendMes bean=dp.loadBean(DataResendMes.class);
        PackageEntityManager.printEntity(bean);
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