package com.example.mvc.service;

import com.example.mvc.model.Person;

import java.util.List;

public interface PeopleService {
    Person get(Long id);
    List<Person> list();
    void save(Person person);
}
