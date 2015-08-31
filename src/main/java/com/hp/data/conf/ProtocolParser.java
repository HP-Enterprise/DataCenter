package com.hp.data.conf;

import com.hp.data.convert.PackageElement;
import com.hp.data.core.DefaultConversion;
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
        NodeList unitList=element.getElementsByTagName("data:unit");
        Map<String,List<PackageElement>> unitMap=new HashMap<String, List<PackageElement>>();
        for(int i=0;i<unitList.getLength();i++){
            Element unit= (Element) unitList.item(i);
            String name=unit.getAttribute("name");
            String key=unit.getAttribute("key");
            List<PackageElement> eleList=new ArrayList<PackageElement>();
            NodeList eleNodeList=unit.getElementsByTagName("data:element");
            for(int j=0;j<eleNodeList.getLength();j++){
                Element ele= (Element) eleNodeList.item(j);
                String eleName=ele.getAttribute("name");
                String eleType=ele.getAttribute("type");
                eleList.add(new PackageElement(eleName,eleType));
            }
            unitMap.put(key,eleList);
        }
        builder.addPropertyValue("unitMap",unitMap);
        builder.addPropertyReference("packageDistinguish","packageDistinguish");
    }

    @Override
    protected Class getBeanClass(Element element) {
        // 返回该标签所定义的类实现,在这里是为了创建出DefaultConversion对象
        return DefaultConversion.class;
    }

}  