package com.hp.data.conf;

import com.hp.data.convert.DataType;
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
        NodeList list=element.getElementsByTagName("data:unit");
        for(int i=0;i<list.getLength();i++){
            Element ele= (Element) list.item(i);
            System.out.println(ele.getAttribute("name"));
        }
        List<DataType> list1=new ArrayList<DataType>();
        list1.add(DataType.BYTE);
        Map<String,List<DataType>> map=new HashMap<String, List<DataType>>();
        map.put("43605", list1);
        builder.addPropertyValue("unitMap",map);
        builder.addPropertyReference("packageDistinguish","packageDistinguish");
    }

    @Override
    protected Class getBeanClass(Element element) {
        // 返回该标签所定义的类实现,在这里是为了创建出DefaultConversion对象
        return DefaultConversion.class;
    }

}  