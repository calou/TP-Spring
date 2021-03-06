package com.example.mvc.service;

import com.example.mvc.model.Person;
import com.example.mvc.repository.PeopleRepository;

import javax.annotation.PostConstruct;
import java.util.List;

public class PeopleServiceImpl implements PeopleService {
    private PeopleRepository peopleRepository;

    @PostConstruct
    private void initialize(){
        createPerson("Martin", "Lemoine");
        createPerson("Florian", "Durand");
        createPerson("Laurence", "Letski");
    }

    private void createPerson(String firstname, String lastname) {
        Person person = new Person();
        person.setFirstname(firstname);
        person.setLastname(lastname);
        save(person);
    }

    public Person get(Long id){
        return peopleRepository.get(id);
    }

    public List<Person> list(){
        return peopleRepository.list();
    }

    public void save(Person person){
        peopleRepository.save(person);
    }
}
