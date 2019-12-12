package com.trustmeenglish.core.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    public String sayHello(){
        return "Hello world";
    }
}
