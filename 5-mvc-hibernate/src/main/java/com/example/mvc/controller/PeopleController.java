package com.example.mvc.controller;

import com.example.mvc.model.Person;
import com.example.mvc.service.PeopleService;

import java.io.IOException;
import java.util.List;

public class PeopleController {

    private PeopleService peopleService;

    public  List<Person> index() throws IOException {
        return peopleService.list();
    }

    public void create(Person person) throws IOException {
        peopleService.save(person);
    }

    public Person helloHost(Long id) throws IOException {
        return peopleService.get(id);
    }
}
