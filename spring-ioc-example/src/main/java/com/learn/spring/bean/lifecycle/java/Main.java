package com.learn.spring.bean.lifecycle.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.learn.spring.bean.lifecycle.java");
        context.refresh();

        TeslaCar car = context.getBean("teslaCar", TeslaCar.class);
        car.enginInfo();
        context.close();
    }
}
