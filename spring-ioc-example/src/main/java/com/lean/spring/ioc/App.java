package com.lean.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        Car car = new TeslaCar(new ElectricEngin());
//        car.enginInfo();

//        Person person = new Person("Aung Aung");
//        System.out.println(person);

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Person person = context.getBean("myPerson", Person.class);
//
//        Person person1 = context.getBean("myPerson2", Person.class);
//
//        System.out.println(person);
//        System.out.println(person1);

        Car car = context.getBean("teslaCar", Car.class);

        car.enginInfo();


    }
}
