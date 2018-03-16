package com.example.demo.controller;

import com.example.demo.model.Monster;
import com.example.demo.repositories.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class monsterController {

    @Autowired
    MonsterRepository repo;

    @GetMapping("/monsters")
    public List<Monster> getMonsters(){
        return repo.getAll();
    }

    @GetMapping("/monsters/{id}")
    public Monster getMonsterById(@PathVariable("id") String id){
        return repo.getSingle(id);
    }

    @PostMapping("/monsters")
    public void addMonster(@RequestBody Monster monster){
        try {
            repo.insert(monster);
        }catch(Exception e){
            System.out.print("Something went wrong. The record could not be added");
        }
    }

    @DeleteMapping("/monsters/{id}")
    public void deleteMonster(@PathVariable("id") String id){
        try {
            repo.delete(id);
        }catch(Exception e){
            System.out.println("Sorry, something went wrong. The record could not be deleted");
        }
    }

}
