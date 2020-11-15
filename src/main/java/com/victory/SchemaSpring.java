package com.victory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lebron374 on 2020/11/8.
 */
public class SchemaSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User user = (User) context.getBean("eric");
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getSex());
        System.out.println(user.getAge());
    }
}
