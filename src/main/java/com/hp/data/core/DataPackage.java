package com.hp.data.core;


import com.hp.data.util.PackageEntityManager;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataPackage {
    private String key;
    public DataPackage(String key){
        this.key=key;
    }
    private Map<String,Object> propertyValueMap=new HashMap<String, Object>();

    void put(String propertyName,Object value){
        this.propertyValueMap.put(propertyName,value);
    }
    Object get(String propertyName){
        return this.propertyValueMap.get(propertyName);
    }
    void remove(String propertyName){
        this.propertyValueMap.remove(propertyName);
    }
    private String methodName2PropertyName(String methodName){
        String temp=methodName.substring(3);
        return temp.substring(0,1).toLowerCase()+temp.substring(1);
    }
    public <T> T loadBean(Class<T> beanClass){
        try {
            T bean=beanClass.newInstance();
            List<Method> setters= PackageEntityManager.getSetters(beanClass);
            for(Method m:setters){
                String property=methodName2PropertyName(m.getName());
                Object value=propertyValueMap.get(property);
                if(value==null)continue;
                m.invoke(bean,value);
            }
            return bean;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void fillBean(Object bean){
        Class<?> beanClass=bean.getClass();
        DataEntity ann=beanClass.getAnnotation(DataEntity.class);
        String key=ann.key();
        List<Method> getters= PackageEntityManager.getGetters(beanClass);
        try {
            for(Method m:getters){
                String propertyName=methodName2PropertyName(m.getName());
                Object value=m.invoke(bean);
                this.propertyValueMap.put(propertyName,value);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


    public String getKey() {
        return key;
    }
}
