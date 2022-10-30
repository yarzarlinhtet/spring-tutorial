package com.learn.spring.ioc.di.annotation;

import com.lean.spring.ioc.Car;
import com.lean.spring.ioc.Engin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeslaCar implements Car {
    @Autowired
    private Engin engin;

//    @Autowired
//    public TeslaCar(Engin engin) {
//        this.engin = engin;
//    }

    @Override
    public void enginInfo() {
        this.engin.Info();
    }
}
