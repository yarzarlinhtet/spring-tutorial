package com.learn.spring.properties.java;

import com.lean.spring.ioc.Engin;
import org.springframework.stereotype.Component;

@Component
public class ElectricEngin implements Engin {
    @Override
    public void Info() {
        System.out.println("Engin -> Electric Engin");
    }
}
