package com.hp.data.conf;

import com.hp.data.convert.PackageElement;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProtocolParser extends AbstractSingleBeanDefinitionParser{

    @Override
    protected void doParse(Element element, ParserContext parserContext,
                           BeanDefinitionBuilder builder) {
        Map<String,List<PackageElement>> unitMap=new HashMap<String, List<PackageElement>>();
        List<String> keyList=new ArrayList<String>();
        /*------------头部--------------*/
        //获得包头
        Element head= (Element) element.getElementsByTagName("data:head").item(0);
        //定义包头的元素集合
        List<PackageElement> headList=new ArrayList<PackageElement>();
        //获得包头包含的元素遍历
        NodeList headNodeList=head.getElementsByTagName("data:element");
        for(int i=0;i<headNodeList.getLength();i++){
            Element ele= (Element) headNodeList.item(i);
            String eleName=ele.getAttribute("name");
            String eleType=ele.getAttribute("type");
            Integer eleSize =Integer.valueOf(ele.getAttribute("size"));
            String key=ele.getAttribute("key");
            if(key!=null&&!"".equals(key)){
                keyList.add(key);
            }
            //生成包元素对象并添加到包头的元素集合中
            headList.add(new PackageElement(eleName,eleType,eleSize));
        }
        /*------------尾部--------------*/
        //获得包尾
        Element tail= (Element) element.getElementsByTagName("data:tail").item(0);
        //定义包尾的元素集合
        List<PackageElement> tailList=new ArrayList<PackageElement>();
        //获得包头包含的元素遍历
        NodeList tailNodeList=tail.getElementsByTagName("data:element");
        for(int i=0;i<tailNodeList.getLength();i++){
            Element ele= (Element) tailNodeList.item(i);
            String eleName=ele.getAttribute("name");
            String eleType=ele.getAttribute("type");
            Integer eleSize =Integer.valueOf(ele.getAttribute("size"));
            String key=ele.getAttribute("key");
            if(key!=null&&!"".equals(key)){
                keyList.add(key);
            }
            //生成包元素对象并添加到包头的元素集合中
            tailList.add(new PackageElement(eleName,eleType,eleSize));
        }
        /*------------包体--------------*/
        //获得包体
        Element body= (Element) element.getElementsByTagName("data:body").item(0);
        //获得包体包含的命令单元，遍历
        NodeList unitNodeList=body.getElementsByTagName("data:unit");
        for(int i=0;i<unitNodeList.getLength();i++){
            Element unit= (Element) unitNodeList.item(i);
            //定义包体的元素集合
            List<PackageElement> unitList=new ArrayList<PackageElement>();
            String unitName=unit.getAttribute("name");
            NodeList eleNodeList=unit.getElementsByTagName("data:element");
            for(int j=0;j<eleNodeList.getLength();j++){
                Element ele= (Element) eleNodeList.item(j);
                String eleName=ele.getAttribute("name");
                String eleType=ele.getAttribute("type");
                Integer eleSize =Integer.valueOf(ele.getAttribute("size"));
                String key=ele.getAttribute("key");
                if(key!=null&&!"".equals(key)){
                    keyList.add(key);
                }
                //生成包元素对象并添加到包头的元素集合中
                unitList.add(new PackageElement(eleName,eleType,eleSize));
            }
            //针对每个unit创建Map映射
            String key=String.join("_",keyList);
            unitList.addAll(0,headList);
            unitList.addAll(tailList);
            unitMap.put(key, unitList);
        }
        builder.addPropertyValue("unitMap", unitMap);
    }


    @Override
    protected String getBeanClassName(Element element) {
        return element.getAttribute("class");
    }
}  