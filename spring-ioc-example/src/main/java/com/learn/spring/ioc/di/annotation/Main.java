package com.learn.spring.ioc.di.annotation;

import com.lean.spring.ioc.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.learn.spring.ioc.di.annotation");
        context.refresh();

        Car car = context.getBean("teslaCar", Car.class);
        car.enginInfo();
    }
}
