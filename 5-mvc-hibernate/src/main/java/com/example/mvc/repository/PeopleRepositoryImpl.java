package com.example.mvc.repository;

import com.example.mvc.model.Person;
import com.example.mvc.service.PeopleService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
@Transactional
public class PeopleRepositoryImpl implements PeopleRepository {
    @Autowired
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
