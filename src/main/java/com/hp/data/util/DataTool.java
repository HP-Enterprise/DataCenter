package com.hp.data.util;

import com.hp.data.bean.landu.VehicleDataUpload;
import com.hp.data.exception.ConversionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * Created by zxZhang on 2015/12/1.
 */
public class DataTool {
    private static final String DEFAULT_CHARSET="GBK";
    private boolean readMode = false;
    private ByteBuffer buffer;

    private Logger _logger = LoggerFactory.getLogger(DataTool.class);
    public  boolean checkSum(byte[] bytes){
        int sum=0;
        for(int i=2;i<bytes.length-2;i++){
          sum += bytes[i] & 0xFF;
        }
        String hexStr = Integer.toHexString(bytes[bytes.length-2])+ Integer.toHexString(bytes[bytes.length -1]);
        _logger.info(">>checkSum:" + Integer.toHexString(sum) + "<>" + hexStr);
        return hexStr == Integer.toHexString(sum);
    }

    public  ByteBuffer getByteBuffer(String str){
        ByteBuffer bb= ByteBuffer.allocate(1024);
        String[] command=str.split(" ");
        byte[] abc=new byte[command.length];
        for(int i=0;i<command.length;i++){
            abc[i]=Integer.valueOf(command[i],16).byteValue();
        }
        bb.put(abc);
        bb.flip();
        return bb;
    }
    public  byte[] getBytesFromByteBuffer(ByteBuffer buff){
        byte[] result = new byte[buff.remaining()];
        if (buff.remaining() > 0) {
            buff.get(result, 0, buff.remaining());
        }
        return result;
    }

    /**
     * 读出字符串，去掉末尾的0
     * @param dis
     * @return
     */
    public String readStringZero(DataInputStream dis){
        String sb = "";
        try {
            while(dis!= null){
                byte b= dis.readByte();
                if(b!='\000' && b!=','){//','=0x2C  '\000'=0x00
                    char c = (char) (b&0xFF);
                    String temp = String.valueOf(c);
                    sb = sb+temp;
                } else{
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new ConversionException("无法读出以0结尾的字符串");
        }
        return sb;
    }

    /**
     * 写入字符串，末尾补0
     * @param str   字符串
     */
    public void writeStringZero(DataOutputStream dos, String str, boolean addZero){
        try {
            byte[] strBytes = str.getBytes(DEFAULT_CHARSET);
            dos.write(strBytes);
            if(addZero){
                dos.writeByte(0x00);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new ConversionException("字符串"+str+"0无法转换成byte数组");
        }
    }
    /**
     * 构建定位信息字符串
     * @param object 包含定位信息属性的对象
     * @return
     */
    public String buildLocationString(Object object){
        String s = "\000";
        if(object instanceof VehicleDataUpload){
            VehicleDataUpload v = (VehicleDataUpload) object;
            StringBuilder sb = new StringBuilder();
            sb.append(v.getSpeed());
            sb.append(s);
            sb.append(v.getCurrentDriveDistance());
            sb.append(s);
            sb.append(v.getLongitude());
            sb.append(',');
            sb.append(v.getLatitude());
            sb.append(',');
            sb.append(v.getDirect());
            sb.append(',');
            sb.append(v.getPositionTime());
            sb.append(',');
            sb.append(v.getPositionMethod());
            sb.append(s);
            System.out.println(sb);
            return sb.toString();
        }else {
            return null;
        }
    }

    public  String bytes2hex(byte[] bArray) {
        //字节数据转16进制字符串
        StringBuffer sb = new StringBuffer(bArray.length);
        String sTemp;
        for (int i = 0; i < bArray.length; i++) {
            sTemp = Integer.toHexString(0xFF & bArray[i]);
            if (sTemp.length() < 2)
                sb.append(0);
            sb.append(sTemp.toUpperCase());
        }
        return getSpaceHex(sb.toString());
    }
    public  String getSpaceHex(String str){
        //将不带空格的16进制字符串加上空格
        String re="";
        String regex = "(.{2})";
        re = str.replaceAll (regex, "$1 ");
        return re;
    }
}
