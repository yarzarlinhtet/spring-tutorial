package com.learn.spring.bean.lifecycle.xml;

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

    public void initCall() {
        System.out.println("Tesla Car class -> init");
    }

    public void destroy() {
        System.out.println("Tesla Car class -> destroy");
    }
}
