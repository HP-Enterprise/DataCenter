package com.hp.data.convert;

import java.lang.reflect.Method;
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
                    getList.add(m);
                }
            }
            setters.put(entityClass,setList);
            getters.put(entityClass,getList);
        }
    }
    public static List<Method> getSetters(Class<?> entityClass){
        return setters.get(entityClass);
    }
    public static List<Method> getGetters(Class<?> entityClass){
        return getters.get(entityClass);
    }

}
