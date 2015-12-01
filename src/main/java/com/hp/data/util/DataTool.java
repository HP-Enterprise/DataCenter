package com.hp.data.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.ByteBuffer;

/**
 * Created by zxZhang on 2015/12/1.
 */
public class DataTool {

    private Logger _logger = LoggerFactory.getLogger(DataTool.class);
    public  boolean checkSum(byte[] bytes){
        int sum=0;
        for(int i=2;i<bytes.length-2;i++){
          sum += bytes[i] & 0xFF;
        }
        String hexStr = Integer.toHexString(bytes[bytes.length-2])+ Integer.toHexString(bytes[bytes.length -1]);
        _logger.info(">>checkSum:" + Integer.toHexString(sum) + "<>" + hexStr );
        return hexStr == Integer.toHexString(sum);
    }

    public  ByteBuffer getByteBuffer(String str){
        //根据16进制字符串得到buffer
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
}
