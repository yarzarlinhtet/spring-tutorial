package com.learn.spring.properties.java;

import com.lean.spring.ioc.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.learn.spring.properties.java");
        context.refresh();

        TeslaCar car = context.getBean("teslaCar", TeslaCar.class);
        car.enginInfo();
        System.out.println(car.getModel());
    }
}
