package com.learn.spring.ioc.di.constructor;

import com.lean.spring.ioc.Car;
import com.lean.spring.ioc.Engin;

public class TeslaCar implements Car {
    private final Engin engin;

    public TeslaCar(Engin engin) {
        this.engin = engin;
    }

    @Override
    public void enginInfo() {
        this.engin.Info();
    }
}
