package com.learn.spring.properties.java;

import com.lean.spring.ioc.Car;
import com.lean.spring.ioc.Engin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TeslaCar implements Car {
    @Autowired
    private Engin engin;

    @Value("${model}")
    private String model;

//    @Autowired
//    public TeslaCar(Engin engin) {
//        this.engin = engin;
//    }

    @Override
    public void enginInfo() {
        this.engin.Info();
    }

    public String getModel() {
        return model;
    }
}
