package com.example.spring.bean;


import com.example.spring.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Lazy
public class SomeLazyBean {

    @Autowired
    private SomeService someService;

    public SomeLazyBean(){
        System.out.println("Creation of a SomeLazyBean object : " + this.toString());
        if(someService != null){
            System.out.println(someService.toString() + " is already autowired");
        }
    }
    
    @PostConstruct
    private void postContruct(){
        System.out.println("PostConstruct on a SomeLazyBean object : " + this.toString());
        System.out.println(this.toString() + " autowired with " + someService.toString());
    }


    public List<String> all(){
        return someService.all();
    }

    public String get(Long id){
        return someService.get(id);
    }
}
