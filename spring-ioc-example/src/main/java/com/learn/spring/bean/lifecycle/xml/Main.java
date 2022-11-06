package com.learn.spring.bean.lifecycle.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle-applicationContext.xml");

        TeslaCar car = context.getBean("teslaCar", TeslaCar.class);

        car.enginInfo();
        System.out.println(car.getModel());

        context.close();
    }
}
