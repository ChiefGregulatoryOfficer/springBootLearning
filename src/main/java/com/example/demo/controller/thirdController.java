package com.example.demo.controller;

import com.example.demo.model.myModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class thirdController {

    private myModel model= new myModel();
    @RequestMapping(value="/third", method = RequestMethod.GET)
    public String sayHello(){
        model.setName("This model's name is Greg");
        return model.toString();
    }
}
