package com.incar.convert;

import com.incar.DataType;
import com.incar.bean.Req1603;
import com.incar.test.ConversionException;
import com.incar.test.DataBuilder;
import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class DataFlower<T> {
    private DataBuilder builder;
    Logger log=Logger.getLogger(DataFlower.class);
    public DataFlower(ByteBuffer buffer){
        this.builder=DataBuilder.build(buffer);
    }
    public T getData(Class<T> melClass){
        if(melClass.getAnnotation(DataEntity.class)!=null){
            //第一步，通过DataMel实体构建DataBee集合
            List<DataBee> beeList=buildBeeList(melClass);
            //第二步，通过DataBee集合获取数据
            return loadData(melClass,beeList);
        }
        else{
            throw new ConversionException("类型"+melClass+"必须声明DataMel注解");
        }
    }

    private T loadData(Class<T> melClass,List<DataBee> beeList) {
        try {
            //1、实例化JavaBean对象
            T bean=melClass.newInstance();
            for(DataBee bee:beeList){
                Object value=null;
                if(bee.getDataType().equals(DataType.STRING)) value=builder.getString();
                if(bee.getDataType().equals(DataType.U_INT_8)) value=builder.getUInt8();
                if(bee.getDataType().equals(DataType.U_INT_16)) value=builder.getUInt16BE();
                if(bee.getDataType().equals(DataType.U_INT_32)) value=builder.getUInt32BE();
                if(bee.getDataType().equals(DataType.INT_8)) value=builder.getInt8();
                if(bee.getDataType().equals(DataType.INT_16)) value=builder.getInt16BE();
                if(bee.getDataType().equals(DataType.INT_32)) value=builder.getInt32BE();
                if(bee.getDataType().equals(DataType.BYTE)) value=builder.getByte();
                bee.getSetter().invoke(bean,value);
            }
            return bean;

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<DataBee> buildBeeList(Class<T> melClass) {
        try {
            List<DataBee> beeList=new ArrayList<DataBee>(10);
            List<DataBee> orderList=new ArrayList<DataBee>();
            Field[] fields=melClass.getDeclaredFields();
            for(Field f:fields){
                //System.out.println(f.getName());
                //4、找到所有的set开头的方法
                Class<?> fieldType= f.getType();
                String fieldName=f.getName();
                String methodName="set"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
                Method m=melClass.getMethod(methodName,fieldType);
                //5、根据这些set开头的方法推算出对应的属性名
                DataMel mthAnn=m.getAnnotation(DataMel.class);
                DataMel colAnn=f.getAnnotation(DataMel.class);
                if(mthAnn!=null&&colAnn!=null)throw new ConversionException("无法同时在属性及属性对应的set方法上指定@DataMel注解");
                DataType type=DataType.AUTO;
                int order=-1;
                if(mthAnn!=null){
                    type=mthAnn.value();
                    order=mthAnn.order();
                }
                else if(colAnn!=null){
                    type=colAnn.value();
                    order=colAnn.order();
                }
                type=detectDataType(type,fieldType);
                if(order>=0){
                    orderList.add(new DataBee(m,type,order));
                }
                else{
                    beeList.add(new DataBee(m,type));
                }

            }
            for(DataBee dg:orderList){
                beeList.add(dg.getOrder(),dg);
            }
            for(int i=0;i<beeList.size();i++){
                beeList.get(i).setOrder(i);
            }
            return beeList;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    private DataType detectDataType(DataType type,Class<?> fieldType) {
        if(type==null)type=DataType.AUTO;
        if(type.equals(DataType.AUTO)){
            if(fieldType.equals(Byte.class)||fieldType.equals(Boolean.class))return DataType.BYTE;
            if(fieldType.equals(Short.class))return DataType.U_INT_8;
            if(fieldType.equals(Integer.class))return DataType.U_INT_16;
            if(fieldType.equals(Long.class))return DataType.U_INT_32;
            if(fieldType.equals(String.class))return DataType.STRING;
            throw new ConversionException("暂不支持的类型"+fieldType);
        }
        else{
            return type;
        }
    }

    public static void main(String[] args){
        ByteBuffer bb=ByteBuffer.allocate(1024);
        String[] command="AA 55 00 4B FF B4 00 05 16 03 49 4E 43 41 52 30 30 30 30 30 33 00 00 00 00 3D 37 00 4C 53 56 46 56 36 31 38 33 44 32 32 30 30 39 33 32 00 56 31 2E 35 30 2E 30 30 00 56 30 2E 30 30 2E 30 30 00 56 33 2E 31 33 2E 31 35 00 FF 01 0F 22".split(" ");
        byte[] abc=new byte[command.length];
        for(int i=0;i<command.length;i++){
            abc[i]=Integer.valueOf(command[i],16).byteValue();
        }
        bb.put(abc);
        bb.flip();
        //System.out.println(bb.position()+"-"+bb.limit()+"-"+bb.capacity());
        DataFlower<Req1603> df=new DataFlower<Req1603>(bb);
        Req1603 req=df.getData(Req1603.class);
        System.out.println(req);
    }
}
