package com.learn.spring.ioc.di.javaConfig;

import com.lean.spring.ioc.Car;
import com.lean.spring.ioc.Engin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Engin getEngin() {
        return new ElectricEngin();
    }

    @Bean("car")
    public Car getCar(Engin engin) {
        return new TeslaCar(engin);
    }
}
