package com.learn.spring.bean.lifecycle.java;

import com.lean.spring.ioc.Car;
import com.lean.spring.ioc.Engin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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


    @PostConstruct
    public void init(){
        System.out.println("tesla car class -> init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("tesla car class -> destroy");
    }
}
