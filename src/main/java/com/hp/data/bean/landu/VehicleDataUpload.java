package com.hp.data.bean.landu;

import com.hp.data.util.DataTool;

import java.io.*;
import java.nio.ByteBuffer;

/**
 * 车辆检测数据主动上传
 * Created by zxZhang on 2015/12/1.
 */
public class VehicleDataUpload extends LanDuMsgHead{
    public static final int BUFFER_SIZE = 1024;

    private int orderWord;//命令字，short 0x1601=5633
    private String remoteMachineID;//远程诊断仪串号（设备号）
    private long tripID;// DWORD
    private String VID;
    private String VIN;
    private String gainDataTime;//YYYY-MM-DD hh:mm:ss
    private byte dataAttrubute;//数据属性标识 0x01：发动机点火时 0x02：发动机运行中 0x03：发动机熄火时 0x04：发动机熄火后 0x05：车辆不能检测
    // 数据内容
    //发动机点火时
    private String fireVoltage;//点火电压值
    //定位信息
    private String speed;//车数
    private String currentDriveDistance;//当前行程行驶距离
    private String longitude;//经度 字符串无结束符
    private String latitude;//纬度 字符串无结束符
    private String direct;//方向 字符串无结束符
    private String positionTime;//定位时间
    private String positionMethod;//定位方式
    //发动机运行中
    private int parameterNumber;//参数数量
    private int[] dataID;//数据ID
    private String[] dataIDContent;//ID数据内容
    //发动机熄火时
    //本行程数据小计
    private int engineRunTime;//本次发动机运行时间
    private int driveGap;//本次行驶距离 Long
    private int averageOil;//本次平均油耗
    private int totalDriveGap;//累计行驶里程 Long
    private int totalAverageOil;//累计平均油耗
    //本行程车速分组统计
    private byte dataGroupNumber;//数据组数
    private byte[] installSpeed;//设置速度值
    private int[] totalTime;//时间小计
    private int[] totalGap;//距离小计 Long
    //驾驶习惯统计
    private int quickUpSpeed;//本次急加速次数
    private int quickDownSpeed;//本次急减速次数
    private int quickTurnNumber;//本次急转向次数
    private int overSpeedTime;//本次时速超速时间 Long
    private byte maxSpeed;//最高车速
    //定位信息，与上面相同
    //发动机熄火后
    private String batteryVoltage;//蓄电池电压值
    //车辆不能检测,无数据内容上传

    public DataTool dataTool = new DataTool();

    /**
     * 解码
     */
    public VehicleDataUpload decoded(byte[] data){
        VehicleDataUpload vehicleDataUpload = new VehicleDataUpload();
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        DataInputStream dis = new DataInputStream(bis);
        try{
            vehicleDataUpload.setPackageMark(dis.readUnsignedShort());
            vehicleDataUpload.setPackageLength(dis.readUnsignedShort());
            vehicleDataUpload.setCheckPackageLength(dis.readUnsignedShort());
            vehicleDataUpload.setPackageID(dis.readByte());
            vehicleDataUpload.setVersion(dis.readByte());

            vehicleDataUpload.setOrderWord(dis.readUnsignedShort());
            vehicleDataUpload.setRemoteMachineID(dataTool.readStringZero(dis));
            vehicleDataUpload.setTripID(dis.readInt());
            vehicleDataUpload.setVID(dataTool.readStringZero(dis));
            vehicleDataUpload.setVIN(dataTool.readStringZero(dis));
            vehicleDataUpload.setGainDataTime(dataTool.readStringZero(dis));
            vehicleDataUpload.setDataAttrubute(dis.readByte());
            switch(vehicleDataUpload.getDataAttrubute()){
                case 0x01 ://发动机点火时
                    vehicleDataUpload.setFireVoltage(dataTool.readStringZero(dis));
                    vehicleDataUpload.setSpeed(dataTool.readStringZero(dis));
                    vehicleDataUpload.setCurrentDriveDistance(dataTool.readStringZero(dis));
                    vehicleDataUpload.setLongitude(dataTool.readStringZero(dis));
                    vehicleDataUpload.setLatitude(dataTool.readStringZero(dis));
                    vehicleDataUpload.setDirect(dataTool.readStringZero(dis));
                    vehicleDataUpload.setPositionTime(dataTool.readStringZero(dis));
                    vehicleDataUpload.setPositionMethod(dataTool.readStringZero(dis));
                    break;
                case 0x02 ://发动机运行中
                    vehicleDataUpload.setParameterNumber(dis.readUnsignedShort());
                    int[] ids =new int[vehicleDataUpload.getParameterNumber()];
                    String[] conts =new String[vehicleDataUpload.getParameterNumber()];
                    for(int i=0; i<vehicleDataUpload.getParameterNumber(); i++){
                        ids[i] = dis.readUnsignedShort();
                        conts[i] = dataTool.readStringZero(dis);
                    }
                    vehicleDataUpload.setDataID(ids);
                    vehicleDataUpload.setDataIDContent(conts);
                    break;
                case 0x03 ://发动机熄火时
                    //本行程数据小计
                    vehicleDataUpload.setEngineRunTime(dis.readUnsignedShort());
                    vehicleDataUpload.setDriveGap(dis.readInt());
                    vehicleDataUpload.setAverageOil(dis.readUnsignedShort());
                    vehicleDataUpload.setTotalDriveGap(dis.readInt());
                    vehicleDataUpload.setTotalAverageOil(dis.readUnsignedShort());
                    //车速分组统计
                    vehicleDataUpload.setDataGroupNumber(dis.readByte());
                    byte[] speeds = new byte[vehicleDataUpload.getDataGroupNumber()];
                    int[] times = new int[vehicleDataUpload.getDataGroupNumber()];
                    int[] gaps = new int[vehicleDataUpload.getDataGroupNumber()];
                    for(int i=0;i<vehicleDataUpload.getDataGroupNumber();i++){
                        speeds[i] = dis.readByte();
                        times[i]= dis.readUnsignedShort();
                        gaps[i] = dis.readInt();
                    }
                    vehicleDataUpload.setInstallSpeed(speeds);
                    vehicleDataUpload.setTotalTime(times);
                    vehicleDataUpload.setTotalGap(gaps);
                    //驾驶习惯统计
                    vehicleDataUpload.setQuickUpSpeed(dis.readUnsignedShort());
                    vehicleDataUpload.setQuickDownSpeed(dis.readUnsignedShort());
                    vehicleDataUpload.setQuickTurnNumber(dis.readUnsignedShort());
                    vehicleDataUpload.setOverSpeedTime(dis.readInt());
                    vehicleDataUpload.setMaxSpeed(dis.readByte());
                    //定位信息
                    vehicleDataUpload.setSpeed(dataTool.readStringZero(dis));
                    vehicleDataUpload.setCurrentDriveDistance(dataTool.readStringZero(dis));
                    vehicleDataUpload.setLongitude(dataTool.readStringZero(dis));
                    vehicleDataUpload.setLatitude(dataTool.readStringZero(dis));
                    vehicleDataUpload.setDirect(dataTool.readStringZero(dis));
                    vehicleDataUpload.setPositionTime(dataTool.readStringZero(dis));
                    vehicleDataUpload.setPositionMethod(dataTool.readStringZero(dis));
                    break;
                case 0x04 ://发动机熄火后
                    vehicleDataUpload.setBatteryVoltage(dataTool.readStringZero(dis));
                    break;
                case 0x05 ://车辆不能检测
                    System.out.println("-------->>>车辆不能检测");
                    break;
            }
            vehicleDataUpload.setCheckSum(dis.readUnsignedShort());
        }catch (IOException e){
            e.printStackTrace();
        }
        return vehicleDataUpload;
    }

    /**
     * 编码
     * @return 16进制字符数组
     */
    public byte[] encoded(){
        ByteBuffer bb = ByteBuffer.allocate(BUFFER_SIZE);
        int countByte = 0;//消息长度
        int addByte = 0;//增加的字节
        //消息头
        bb.putShort((short) 0xAA55);
//        bb.putShort((short) this.getPackageLength());
//        bb.putShort((short) this.getCheckPackageLength());
        bb.putShort((short) 0x3030);
        bb.putShort((short) 0x3030);
        bb.put(this.getPackageID());
        bb.put((byte) 0x05);
        countByte = 2+2+2+1+1;
        //消息内容
        bb.putShort((short) 0x1601);//命令字
        dataTool.writeStringZero(bb, this.getRemoteMachineID(), true);//末尾补了一个字节0
        bb.putInt((int) this.getTripID());
        dataTool.writeStringZero(bb, this.getVID(), true);
        dataTool.writeStringZero(bb, this.getVIN(), true);
        dataTool.writeStringZero(bb, this.getGainDataTime(), true);
        bb.put(this.getDataAttrubute());
        countByte += 2+this.remoteMachineID.length()+4+this.VID.length()+this.VIN.length()+this.gainDataTime.length()+1;
        addByte +=1+1+1+1;
        switch (this.dataAttrubute) {
            case 0x01://发动机点火时
                dataTool.writeStringZero(bb, this.getFireVoltage(), true);
                //定位信息
                String locationMsg = dataTool.buildLocationString(this);
                dataTool.writeStringZero(bb, locationMsg, false);
                countByte += this.fireVoltage.length() + locationMsg.length();
                addByte +=1;
                break;
            case 0x02://发动机运行中
                bb.putShort((short) this.getParameterNumber());
                countByte += 2;
                for (int i = 0; i < this.getParameterNumber(); i++) {
                    bb.putShort((short) this.getDataID()[i]);
                    dataTool.writeStringZero(bb, this.getDataIDContent()[i], true);
                    countByte +=  2 + this.getDataIDContent()[i].length();
                    addByte +=1;
                }
                break;
            case 0x03://发动机熄火时
                bb.putShort((short) this.getEngineRunTime());
                bb.putInt(this.getDriveGap());
                bb.putShort((short) this.getAverageOil());
                bb.putInt(this.getTotalDriveGap());
                bb.putShort((short) this.getTotalAverageOil());
                //车速分组统计
                bb.put(this.getDataGroupNumber());
                countByte +=2 + 4 + 2 + 4 +2+ 1;
                for (int i = 0; i < this.getDataGroupNumber(); i++) {
                    bb.put(this.getInstallSpeed()[i]);
                    bb.putShort((short) this.getTotalTime()[i]);
                    bb.putInt(this.getTotalGap()[i]);
                    countByte += 1 + 2 + 4;
                }
                bb.putShort((short) this.getQuickUpSpeed());
                bb.putShort((short) this.getQuickDownSpeed());
                bb.putShort((short) this.getQuickTurnNumber());
                bb.putInt(this.getOverSpeedTime());
                bb.put(this.getMaxSpeed());
                //定位信息
                String locationMessage = dataTool.buildLocationString(this);
                dataTool.writeStringZero(bb, locationMessage, false);
                countByte +=  2 + 2 + 2 + 4 + 1 + locationMessage.length();
                break;
            case 0x04://发动机熄火后
                dataTool.writeStringZero(bb, this.getBatteryVoltage(), true);
                countByte += this.batteryVoltage.length();
                addByte +=1;
                break;
            case 0x05://车辆不能检测
                System.out.println("-------->>>车辆不能检测");
                break;
        }
        countByte+= 2;
        bb.putShort((short) (countByte + addByte));//checkSum  [pos=118 lim=1024 cap=1024]

        bb.putShort((short) 0xAA55);
        bb.putShort((short) countByte);
        bb.putShort((short) (~countByte));
        bb.flip();//设置compact()的 limit=position:118+6;
        bb.position(countByte + addByte);//设置compact()的 position:118;
        bb.compact();//翻转position至limit长度(:6) 的字节 到 ByteBuffer从0开始的地方（0至5）;
        bb.rewind();//设置有效字节的下线position，为0
        bb.limit(countByte + addByte);//设置有效字节的上限limit，countByte + addByte为有效字节总数
        System.out.println("rewind:" + bb);//[pos=0 lim=118 cap=1024]
        System.out.println("------>>>统计字节个数:" + (countByte+addByte));
        return dataTool.getValidBytesFromByteBuffer(bb);
    }

    public int getOrderWord() {
        return orderWord;
    }

    public void setOrderWord(int orderWord) {
        this.orderWord = orderWord;
    }

    public String getRemoteMachineID() {
        return remoteMachineID;
    }

    public void setRemoteMachineID(String remoteMachineID) {
        this.remoteMachineID = remoteMachineID;
    }

    public long getTripID() {
        return tripID;
    }

    public void setTripID(long tripID) {
        this.tripID = tripID;
    }

    public String getVID() {
        return VID;
    }

    public void setVID(String VID) {
        this.VID = VID;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getGainDataTime() {
        return gainDataTime;
    }

    public void setGainDataTime(String gainDataTime) {
        this.gainDataTime = gainDataTime;
    }

    public byte getDataAttrubute() {
        return dataAttrubute;
    }

    public void setDataAttrubute(byte dataAttrubute) {
        this.dataAttrubute = dataAttrubute;
    }

    public String getFireVoltage() {
        return fireVoltage;
    }

    public void setFireVoltage(String fireVoltage) {
        this.fireVoltage = fireVoltage;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getCurrentDriveDistance() {
        return currentDriveDistance;
    }

    public void setCurrentDriveDistance(String currentDriveDistance) {
        this.currentDriveDistance = currentDriveDistance;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public String getPositionTime() {
        return positionTime;
    }

    public void setPositionTime(String positionTime) {
        this.positionTime = positionTime;
    }

    public String getPositionMethod() {
        return positionMethod;
    }

    public void setPositionMethod(String positionMethod) {
        this.positionMethod = positionMethod;
    }

    public int getParameterNumber() {
        return parameterNumber;
    }

    public void setParameterNumber(int parameterNumber) {
        this.parameterNumber = parameterNumber;
    }

    public int[] getDataID() {
        return dataID;
    }

    public void setDataID(int[] dataID) {
        this.dataID = dataID;
    }

    public String[] getDataIDContent() {
        return dataIDContent;
    }

    public void setDataIDContent(String[] dataIDContent) {
        this.dataIDContent = dataIDContent;
    }

    public int getEngineRunTime() {
        return engineRunTime;
    }

    public void setEngineRunTime(int engineRunTime) {
        this.engineRunTime = engineRunTime;
    }

    public int getDriveGap() {
        return driveGap;
    }

    public void setDriveGap(int driveGap) {
        this.driveGap = driveGap;
    }

    public int getAverageOil() {
        return averageOil;
    }

    public void setAverageOil(int averageOil) {
        this.averageOil = averageOil;
    }

    public int getTotalDriveGap() {
        return totalDriveGap;
    }

    public void setTotalDriveGap(int totalDriveGap) {
        this.totalDriveGap = totalDriveGap;
    }

    public int getTotalAverageOil() {
        return totalAverageOil;
    }

    public void setTotalAverageOil(int totalAverageOil) {
        this.totalAverageOil = totalAverageOil;
    }

    public byte getDataGroupNumber() {
        return dataGroupNumber;
    }

    public void setDataGroupNumber(byte dataGroupNumber) {
        this.dataGroupNumber = dataGroupNumber;
    }

    public byte[] getInstallSpeed() {
        return installSpeed;
    }

    public void setInstallSpeed(byte[] installSpeed) {
        this.installSpeed = installSpeed;
    }

    public int[] getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int[] totalTime) {
        this.totalTime = totalTime;
    }

    public int[] getTotalGap() {
        return totalGap;
    }

    public void setTotalGap(int[] totalGap) {
        this.totalGap = totalGap;
    }

    public int getQuickUpSpeed() {
        return quickUpSpeed;
    }

    public void setQuickUpSpeed(int quickUpSpeed) {
        this.quickUpSpeed = quickUpSpeed;
    }

    public int getQuickDownSpeed() {
        return quickDownSpeed;
    }

    public void setQuickDownSpeed(int quickDownSpeed) {
        this.quickDownSpeed = quickDownSpeed;
    }

    public int getQuickTurnNumber() {
        return quickTurnNumber;
    }

    public void setQuickTurnNumber(int quickTurnNumber) {
        this.quickTurnNumber = quickTurnNumber;
    }

    public int getOverSpeedTime() {
        return overSpeedTime;
    }

    public void setOverSpeedTime(int overSpeedTime) {
        this.overSpeedTime = overSpeedTime;
    }

    public byte getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(byte maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBatteryVoltage() {
        return batteryVoltage;
    }

    public void setBatteryVoltage(String batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }

    public void print(){
        System.out.println("LanDuMsg:__________________________" );
        System.out.println("packageMark_"+ this.getPackageMark()
                +" packageLength_"+ this.getPackageLength()
                +" checkPackageLength_"+ this.getCheckPackageLength()
                +" packageID_"+ this.getPackageID()
                +" version_"+ this.getVersion()
                +" checkSum_"+this.getCheckSum());
        System.out.println("LanDuMsgContent:__________________________" );
        System.out.println("orderWord_"+ this.getOrderWord()
                +" remoteMachineID_"+ this.getRemoteMachineID()
                +" tripID_"+ this.getTripID()
                +" VID_"+ this.getVID()
                +" VIN_"+ this.getVIN()
                +" dataAttrubute_"+this.getDataAttrubute()
        );
        switch(this.getDataAttrubute()){
            case 0x01:
                System.out.println("fireVoltage_"+ this.getFireVoltage()
                        +" speed_"+this.getSpeed()
                        +" currentDriveDistance_"+this.getCurrentDriveDistance()
                        +" longitude_"+this.getLongitude()
                        +" latitude_"+this.getLatitude()
                        +" direct_"+this.getDirect()
                        +" positionTime_"+this.getPositionTime()
                        +" positionMethod_"+this.getPositionMethod());
                break;
            case 0x02:
                System.out.print("parameterNumber_" + this.getParameterNumber());
                for(int i=0;i<this.getDataID().length;i++){
                    System.out.print(" dataID_"+i+"_*"+this.getDataID()[i]);
                }
                System.out.println();
                for(int i=0;i<this.getDataID().length;i++){
                    System.out.print(" dataIDContent_"+i+"_*"+this.getDataIDContent()[i]);
                }
                System.out.println();
                break;
            case 0x03:
                System.out.print("engineRunTime_" + this.getEngineRunTime()
                        +" driveGap_"+this.getDriveGap()
                        +" averageOil_"+this.getAverageOil()
                        +" totalDriveGap_"+this.getTotalDriveGap()
                        +" totalAverageOil_"+this.getTotalAverageOil());
                System.out.print("dataGroupNumber_" + this.getDataGroupNumber());
                for(int i=0;i<this.getInstallSpeed().length;i++){
                    System.out.print(" installSpeed_"+i+"_*"+this.getInstallSpeed()[i]);
                }
                System.out.println();
                for(int i=0;i<this.getTotalTime().length;i++){
                    System.out.print(" totalTime_"+i+"_*"+this.getTotalTime()[i]);
                }
                System.out.println();
                for(int i=0;i<this.getTotalGap().length;i++){
                    System.out.print(" totalGap_"+i+"_*"+this.getTotalGap()[i]);
                }
                System.out.println();
                System.out.println("quickUpSpeed_"+this.getQuickUpSpeed()
                        +" quickDownSpeed_"+this.getQuickDownSpeed()
                        +" quickTurnNumber_"+this.getQuickTurnNumber()
                        +" overSpeedTime_"+this.getOverSpeedTime()
                        +" maxSpeed_"+this.getMaxSpeed());
                System.out.println("speed_"+this.getSpeed()
                        +" currentDriveDistance_"+this.getCurrentDriveDistance()
                        +" longitude_"+this.getLongitude()
                        +" latitude_"+this.getLatitude()
                        +" direct_"+this.getDirect()
                        +" positionTime_"+this.getPositionTime()
                        +" positionMethod_"+this.getPositionMethod());
                break;
            case 0x04:
                System.out.println("batteryVoltage_"+ this.getBatteryVoltage());
                break;
            case 0x05:break;
        }
    }
}