package com.example.demo.repositories;

import com.example.demo.model.Monster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

//import java.util.List;

@Repository
public class MonsterRepository {

    @Autowired
    private MongoOperations mongoOperations;

    public List<Monster> getAll(){
        return mongoOperations.findAll(Monster.class);
    }

    public Monster getSingle(String id){
        Query q = new Query(Criteria.where("_id").is(id));
        return mongoOperations.findOne(q, Monster.class);
    }
    public void insert(Monster monster){
        String id = UUID.randomUUID().toString();
        monster.setId(id);
        mongoOperations.save(monster);
    }

    public void delete(String id){
        Query q = new Query(Criteria.where("_id").is(id));
        mongoOperations.remove(q, Monster.class);
    }
    //public Monster findByName(String name);
    //public List<Monster> getAllMonsters();
}
