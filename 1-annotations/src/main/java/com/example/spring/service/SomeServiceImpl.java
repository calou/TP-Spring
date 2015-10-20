package com.example.spring.service;


import com.example.spring.repository.SomeRepository;

import javax.annotation.PostConstruct;
import java.util.List;

public class SomeServiceImpl implements SomeService {

    private SomeRepository someRepository;

    public SomeServiceImpl(){
        System.out.println("Creation of a SomeService object :" + this.toString());
        if(someRepository != null){
            System.out.println(someRepository.toString() + " is already autowired");
        }
    }

    @PostConstruct
    private void postContruct(){
        System.out.println("PostConstruct on a SomeServiceImpl object : " + this.toString() );
        System.out.println(this.toString() + " autowired with " + someRepository.toString());
    }

    public List<String> all() {
        return someRepository.all();
    }

    public String get(Long id) {
        return someRepository.get(id);
    }
}
