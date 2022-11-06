package com.learn.spring.properties.java;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:tesla.properties")
public class CarConfig {
}
