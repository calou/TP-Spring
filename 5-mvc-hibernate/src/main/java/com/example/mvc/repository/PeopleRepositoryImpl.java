package com.example.mvc.repository;

import com.example.mvc.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PeopleRepositoryImpl implements PeopleRepository {
    SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public Person get(Long id){
        return getSession().get(Person.class, id);
    }

    public List<Person> list(){
        return getSession().createCriteria(Person.class).list();
    }

    public void save(Person person){
        getSession().saveOrUpdate(person);
    }
}
