package com.learn.spring.ioc.di.javaConfig;

import com.lean.spring.ioc.Car;
import com.lean.spring.ioc.Engin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class TeslaCar implements Car {

    private Engin engin;

    public TeslaCar(Engin engin) {
        this.engin = engin;
    }

    @Override
    public void enginInfo() {
        this.engin.Info();
    }
}
