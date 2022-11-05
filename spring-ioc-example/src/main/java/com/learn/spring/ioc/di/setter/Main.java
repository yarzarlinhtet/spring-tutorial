package com.learn.spring.ioc.di.setter;

import com.lean.spring.ioc.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TeslaCar car = context.getBean("setTeslaCar", TeslaCar.class);

        car.enginInfo();
        System.out.println(car.getModel());
    }
}
