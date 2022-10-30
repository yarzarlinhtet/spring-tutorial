package com.learn.spring.ioc.di.javaConfig;

import com.lean.spring.ioc.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean("car", Car.class);
        car.enginInfo();
    }
}
