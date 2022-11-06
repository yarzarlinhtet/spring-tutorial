package com.learn.spring.bean.lifecycle.xml;

import com.lean.spring.ioc.Engin;

public class ElectricEngin implements Engin {
    @Override
    public void Info() {
        System.out.println("Engin -> Electric Engin");
    }
}
