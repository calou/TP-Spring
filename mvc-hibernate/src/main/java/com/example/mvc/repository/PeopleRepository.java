package com.example.mvc.repository;

import com.example.mvc.model.Person;

import java.util.List;

public interface PeopleRepository {
    Person get(Long id);
    List<Person> list();
    void save(Person person);
}
