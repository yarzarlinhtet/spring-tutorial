package com.learn.spring.ioc.di.javaConfig;

import com.lean.spring.ioc.Engin;
import org.springframework.stereotype.Component;

public class ElectricEngin implements Engin {
    @Override
    public void Info() {
        System.out.println("Engin -> Electric Engin");
    }
}
