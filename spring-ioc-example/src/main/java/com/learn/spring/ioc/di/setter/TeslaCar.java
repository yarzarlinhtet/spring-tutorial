package com.learn.spring.ioc.di.setter;

import com.lean.spring.ioc.Car;
import com.lean.spring.ioc.Engin;

public class TeslaCar implements Car {
    private Engin engin;

    private String model;

    public void setEngin(Engin engin) {
        this.engin = engin;
    }

    @Override
    public void enginInfo() {
        this.engin.Info();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
