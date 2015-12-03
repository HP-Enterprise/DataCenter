package com.hp.data.bean.landu;

import org.apache.log4j.Logger;

import java.io.*;

/**
 * Created by zxZhang on 2015/12/2.
 */
public class LanDuMsgHead {
    private static Logger logger=Logger.getLogger(LanDuMsgHead.class);

    private int packageMark;//数据包标志 0xAA55
    private int packageLength;//数据包长度
    private int checkPackageLength;//数据包长度校验,即数据包长度取反
    private byte packageID;//数据包ID
    private byte version;//协议格式版本 0x05
    private int checkSum;//校验和

    public LanDuMsgHead decoded(byte[] data){
        LanDuMsgHead lanDuMsgHead = new LanDuMsgHead();
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        DataInputStream dis = new DataInputStream(bis);
        try{
            lanDuMsgHead.setPackageMark(dis.readShort());
            lanDuMsgHead.setPackageLength(dis.readShort());
            lanDuMsgHead.setCheckPackageLength(dis.readShort());
            lanDuMsgHead.setPackageID(dis.readByte());
            lanDuMsgHead.setVersion(dis.readByte());
            lanDuMsgHead.setCheckSum(dis.readShort());
            dis.close();
            bis.close();
        }catch (IOException e){
            logger.error("封装LanDuMsgHead" + "");
            e.printStackTrace();
        }
        return new LanDuMsgHead();
    }

    public byte[] encoded(){
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);
        try{
            dos.writeShort(0xAA55);
            dos.writeShort(this.getPackageLength());
            dos.writeShort(this.getCheckPackageLength());
            dos.writeByte(this.getPackageID());
            dos.writeByte(0x05);
            dos.writeShort(this.getCheckSum());
            dos.close();
        } catch (IOException e){
            logger.error("封装LanDdMsgHead消息头二进制数组失败。");
            e.printStackTrace();
        }
        return bos.toByteArray();
    }

    public LanDuMsgHead(){
        super();
    }

    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        LanDuMsgHead.logger = logger;
    }

    public int getPackageMark() {
        return packageMark;
    }

    public void setPackageMark(int packageMark) {
        this.packageMark = packageMark;
    }

    public int getPackageLength() {
        return packageLength;
    }

    public void setPackageLength(int packageLength) {
        this.packageLength = packageLength;
    }

    public int getCheckPackageLength() {
        return checkPackageLength;
    }

    public void setCheckPackageLength(int checkPackageLength) {
        this.checkPackageLength = checkPackageLength;
    }

    public byte getPackageID() {
        return packageID;
    }

    public void setPackageID(byte packageID) {
        this.packageID = packageID;
    }

    public byte getVersion() {
        return version;
    }

    public void setVersion(byte version) {
        this.version = version;
    }

    public int getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(int checkSum) {
        this.checkSum = checkSum;
    }
}
