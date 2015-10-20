package com.example.spring.bean;


import com.example.spring.service.SomeService;

import javax.annotation.PostConstruct;
import java.util.List;

public class SomeBean {

    private SomeService someService;

    public SomeBean(){
        System.out.println("Creation of a SomeBean object : " + this.toString());
        if(someService != null){
            System.out.println(someService.toString() + " is already autowired");
        }
    }

    @PostConstruct
    private void postContruct(){
        System.out.println("PostConstruct on a SomeBean object : " + this.toString());
        System.out.println(this.toString() + " autowired with " + someService.toString());
    }

    public List<String> all(){
        return someService.all();
    }

    public String get(Long id){
        return someService.get(id);
    }
}
