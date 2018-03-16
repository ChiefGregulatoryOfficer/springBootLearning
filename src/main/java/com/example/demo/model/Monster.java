package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class Monster {

    @Id
    public String id;

    public String name;
    public String description;

    public Monster(){}

    public Monster(String name, String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString(){
        return "It's a "+name+"! "+description;
    }

    public void setId(String id) {
        this.id = id;
    }
}
