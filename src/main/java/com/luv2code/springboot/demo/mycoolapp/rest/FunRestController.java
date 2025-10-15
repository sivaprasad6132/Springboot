package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    @GetMapping("/")
    public String sayHello() {
        System.out.println("This is feature 8");
        return "my team members changes this, lets rock 8";
    }
}
