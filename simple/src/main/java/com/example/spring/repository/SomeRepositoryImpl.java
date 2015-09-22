package com.example.spring.repository;


import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SomeRepositoryImpl implements SomeRepository {

    private List<String> values;

    public SomeRepositoryImpl(){
        System.out.println("Creation of a SomeRepositoryImpl object :" + this.toString());
        values = new ArrayList<String>();
        values.add("Premier");
        values.add("Second");
        values.add("Troisième");
    }

    @PostConstruct
    private void postContruct(){
        System.out.println("PostConstruct on a SomeRepositoryImpl object : " + this.toString());
    }

    public List<String> all() {
        return values;
    }

    public String get(Long id) {
        return values.get(id.intValue());
    }
}
