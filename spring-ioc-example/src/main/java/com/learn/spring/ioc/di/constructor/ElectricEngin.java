package com.learn.spring.ioc.di.constructor;

import com.lean.spring.ioc.Engin;

public class ElectricEngin implements Engin {
    @Override
    public void Info() {
        System.out.println("Engin -> Electric Engin");
    }
}
