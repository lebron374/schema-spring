package com.victory;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by lebron374 on 2020/11/8.
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
