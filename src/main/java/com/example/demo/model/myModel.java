package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class myModel {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "myModel{" +
                "name='" + name + '\'' +
                '}';
    }
}
