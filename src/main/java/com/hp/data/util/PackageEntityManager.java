package com.hp.data.util;

import com.hp.data.core.DataEntity;
import com.hp.data.exception.ConversionException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.*;

public final class PackageEntityManager {
    private static Map<Class<?>,List<Method>> setters=new HashMap<Class<?>,List<Method>>();
    private static Map<Class<?>,List<Method>> getters=new HashMap<Class<?>,List<Method>>();
    static{
        Set<Class<?>> set= ClassScanner.scan("com.hp.data.bean", DataEntity.class);
        for(Class<?> entityClass:set){
            Method[] methods=entityClass.getMethods();
            List<Method> setList=new ArrayList<Method>();
            List<Method> getList=new ArrayList<Method>();
            for(Method m:methods){
                String methodName=m.getName();
                if(methodName.indexOf("set")==0){
                    setList.add(m);
                }
                else if(methodName.indexOf("get")==0){
                    if("getClass".equals(m.getName()))continue;
                    getList.add(m);
                }
            }
            setters.put(entityClass,setList);
            getters.put(entityClass,getList);
        }
    }
    public static void printEntity(Object bean){
        Class<?> entityClass=bean.getClass();
        if(getters.containsKey(entityClass)){
            System.out.println("\n对象"+entityClass.getName()+":");
            List<Method> getters=getGetters(entityClass);
            DataBuilder dataBuilder=DataBuilder.build();
            for(Method m:getters){
                try {
                    String nameStep1=m.getName().substring(3);
                    String nameStep2=nameStep1.substring(0,1).toLowerCase()+nameStep1.substring(1);
                    String propertyName=rightPad(nameStep2,20,' ');
                    String typeStep1=m.getReturnType().getName();
                    String type=rightPad(typeStep1,20,' ');
                    Object valueStep1=m.invoke(bean);
                    String valueStep2=valueStep1!=null?valueStep1.toString():"";
                    String value=rightPad(valueStep2,20,' ');
                    String hexValue=getHexString(valueStep2,m.getReturnType(),dataBuilder);
                    System.out.println(propertyName+" "+value+" "+type+" "+hexValue);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        else{
            throw new ConversionException("打印对象"+entityClass.getName()+"失败，要打印的对象必须在指定包下并由@DataEntity注释");
        }
    }
    public static String getHexString(String value,Class<?> valueClass,DataBuilder dataBuilder){
        dataBuilder.clear();
        if(String.class.equals(valueClass))dataBuilder.putString(value, value.length());
        if(Short.class.equals(valueClass))dataBuilder.putUInt8BE(Short.valueOf(value));
        if(Integer.class.equals(valueClass))dataBuilder.putUInt16BE(Integer.valueOf(value));
        if(Long.class.equals(valueClass))dataBuilder.putUInt32BE(Long.valueOf(value));
        if(Byte.class.equals(valueClass))dataBuilder.putByte(Byte.valueOf(value));
        return getByteString(dataBuilder.buffer());
    }
    public static String rightPad(String text, int length, char c) {
        if(text.length()>length)text=text.substring(0,length-2)+"..";
        char[] array = new char[length];
        Arrays.fill(array, c);
        System.arraycopy(text.toCharArray(), 0, array, 0, text.length());
        return new String(array);
    }


    public static String getByteString(ByteBuffer bb){
        bb.flip();
        StringBuilder stringBuffer=new StringBuilder();
        for(int i=0;i<bb.limit();i++){
            String byteStr=Integer.toHexString(bb.get()).toUpperCase();
            if(byteStr.length()==1)byteStr="0"+byteStr;
            if(byteStr.length()!=2)byteStr=byteStr.substring(byteStr.length()-2);
            stringBuffer.append(byteStr).append(" ");
        }
        return stringBuffer.toString();
    }
    public static ByteBuffer getByteBuffer(String str){
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
    public static List<Method> getSetters(Class<?> entityClass){
        return setters.get(entityClass);
    }
    public static List<Method> getGetters(Class<?> entityClass){
        return getters.get(entityClass);
    }

}
