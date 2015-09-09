package com.hp.data.core;


import com.hp.data.core.DataType;
import com.hp.data.core.PackageElement;
import com.hp.data.core.Conversion;
import com.hp.data.core.DataPackage;
import com.hp.data.exception.ConversionException;
import com.hp.data.util.DataBuilder;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public abstract class AbstractConversion implements Conversion {
    private Map<String,List<PackageElement>> unitMap;
    public abstract String getPackageKey(ByteBuffer buffer);
    @Override
    public DataPackage generate(ByteBuffer buffer) {
        String key=this.getPackageKey(buffer);
        DataPackage dp=new DataPackage(key);
        List<PackageElement> list=this.unitMap.get(key);
        DataBuilder builder=DataBuilder.build(buffer);
        for(PackageElement pe:list){
            DataType dataType=pe.getDataType();
            String property=pe.getName();
            int size=pe.getSize();
            Object value=getValue(dataType,builder,size);
            dp.put(property,value);
        }
        return dp;
    }
    private Object getValue(DataType dataType,DataBuilder builder,int size){
        if(dataType.equals(DataType.STRING)){
            if(size>0) {
                return builder.getString(size);
            }
            else{
                return builder.getString();
            }
        }
        if(dataType.equals(DataType.U_INT_8)) return builder.getUInt8();
        if(dataType.equals(DataType.U_INT_16)) return builder.getUInt16BE();
        if(dataType.equals(DataType.U_INT_32)) return builder.getUInt32BE();
        if(dataType.equals(DataType.INT_8)) return builder.getInt8();
        if(dataType.equals(DataType.INT_16)) return builder.getInt16BE();
        if(dataType.equals(DataType.INT_32)) return builder.getInt32BE();
        if(dataType.equals(DataType.BYTE)){
            if(size>0) {
                return builder.getByte(size);
            }
            else{
                return builder.getByte();
            }

        }
        return null;
    }
    private void putValue(DataType dataType,DataBuilder builder,Object value,int size){
        if(dataType.equals(DataType.STRING)) {
            if(size>0) {
                builder.putString(castTo(String.class, value),size);
            }
            else{
                builder.putString(castTo(String.class, value));
            }
        }
        if(dataType.equals(DataType.U_INT_8)) builder.putUInt8BE(castTo(Short.class,value));
        if(dataType.equals(DataType.U_INT_16)) builder.putUInt16BE(castTo(Integer.class,value));
        if(dataType.equals(DataType.U_INT_32)) builder.putUInt32BE(castTo(Long.class, value));
        if(dataType.equals(DataType.INT_8)) builder.putInt8BE(castTo(Short.class, value));
        if(dataType.equals(DataType.INT_16)) builder.putInt16BE(castTo(Integer.class, value));
        if(dataType.equals(DataType.INT_32)) builder.putInt32BE(castTo(Integer.class, value));
        if(dataType.equals(DataType.BYTE)) {
            if(size>0){
                builder.putByte(castTo(byte[].class, value));
            }
            else{
                builder.putByte(castTo(Byte.class, value));
            }
        }
    }
    private <T> T castTo(Class<T> castClass,Object target){
        try{
            return (T)target;
        }
        catch (ClassCastException e){
            e.printStackTrace();
            throw new ConversionException("类型转换错误，需要类型["+castClass.getName()+"],得到类型["+target.getClass().getName()+"]");
        }
    }
    @Override
    public ByteBuffer generate(DataPackage pkg) {
        List<PackageElement> eleList= this.unitMap.get(pkg.getKey());
        DataBuilder db=DataBuilder.build();
        for(PackageElement pe:eleList){
            DataType dataType=pe.getDataType();
            String property=pe.getName();
            int size=pe.getSize();
            Object value=pkg.get(property);
            putValue(dataType, db, value,size);
        }
        return db.buffer();
    }

    public Map<String, List<PackageElement>> getUnitMap() {
        return unitMap;
    }

    public void setUnitMap(Map<String, List<PackageElement>> unitMap) {
        this.unitMap = unitMap;
    }

}
