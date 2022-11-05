package com.learn.spring.bean.scope;

import com.lean.spring.ioc.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeScope {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("scope-applicationContext.xml");

        Person personOne = context.getBean("myPersonPro", Person.class);

        Person personTwo = context.getBean("myPersonPro", Person.class);

        boolean result = (personOne == personTwo);

        System.out.println("Same Reference : " + result);

        System.out.println("PersonOne Memory Location : " + personOne);

        System.out.println("PersonTwo Memory Location : " + personTwo);

        System.out.println("Person One age : " + personOne.getAge());
        System.out.println("Person Two age : " + personTwo.getAge());
        personOne.setAge(2);
        System.out.println("____________________________________");
        System.out.println("Person One age : " + personOne.getAge());
        System.out.println("Person Two age : " + personTwo.getAge());
    }
}
