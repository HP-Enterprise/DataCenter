package com.incar.test;


import java.nio.ByteBuffer;

public final class DataBuilder {
    private static byte[] temp2=new byte[2];
    private static byte[] temp4=new byte[4];
    private ByteBuffer buffer;
    private DataBuilder(ByteBuffer buffer){
        this.buffer=buffer;
    }
    public static DataBuilder buildByBuffer(ByteBuffer buffer){
        return new DataBuilder(buffer);
    }

    /**
     * 获取一个字节
     * @return 单字节
     */
    public byte getByte(){
        return buffer.get();
    }
    /**
     * 获取无符号单字节整型
     * @return  整型数
     */
    public int getUInt8(){
        return Byte.toUnsignedInt(buffer.get());
    }

    /**
     * 获取单字节整型
     * @return  整型数
     */
    public int getInt8(){
        return buffer.get();
    }
    /**
     * 获取大端无符号双字节整型
     * @return  整型数
     */
    public int getUInt16BE(){
        return Short.toUnsignedInt(buffer.getShort());
    }
    /**
     * 获取大端双字节整型
     * @return  整型数
     */
    public int getInt16BE(){
        return buffer.getShort();
    }
    /**
     * 获取大端无符号四字节整型
     * @return  长整形数
     */
    public long getUInt32BE(){
        return Integer.toUnsignedLong(buffer.getInt());
    }

    /**
     * 获取大端四字节整型
     * @return  长整形数
     */
    public long getInt32BE(){
        return buffer.getInt();
    }
}
