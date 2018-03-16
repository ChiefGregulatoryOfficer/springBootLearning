package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class secondController {

    @RequestMapping(value = "/second", method = RequestMethod.GET)
    public String secondEndpoint(){
        return "Hello from a second endpoint";
    }
}
