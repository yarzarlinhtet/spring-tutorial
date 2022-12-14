package com.learn.spring.ioc.di.constructor;

import com.lean.spring.ioc.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = context.getBean("teslaCar", Car.class);

        car.enginInfo();
    }
}
