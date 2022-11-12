package com.springmvc.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/")
    public String testing(){
        return "index";
    }

    @RequestMapping("/greet")
    public String greeting() {
        return "greeting";
    }
}
