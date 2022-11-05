package com.learn.spring.properties.xml;

import com.lean.spring.ioc.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("properties-applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);

        System.out.println(person);
    }
}
