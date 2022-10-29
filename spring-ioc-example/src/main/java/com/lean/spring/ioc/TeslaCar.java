package com.lean.spring.ioc;

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
