package com.goodyhlee.photoal.photoal.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Nomad
 * Date: 2017. 12. 26.
 * Time: PM 4:30
 * Copyright Coupang. All rights reserved.
 */
@Controller
public class HelloWorld {

    @Value("${welcome.message}")
    private String greetingMessage = "Hello World";

    @GetMapping("/helloWorld")
    public String helloWorld(Map<String, Object> model) {
        model.put("message", this.greetingMessage);
        return "HelloWorld";
    }

}
