package com.example.spring.bean;


import com.example.spring.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

    public void setSomeService(SomeService someService){
        this.someService = someService;
    }

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
