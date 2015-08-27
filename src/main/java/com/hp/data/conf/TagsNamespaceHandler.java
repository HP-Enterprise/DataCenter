package com.hp.data.conf;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


public class TagsNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("protocol", new ProtocolParser());
    }
}  