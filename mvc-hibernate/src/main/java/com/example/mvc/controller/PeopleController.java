package com.example.mvc.controller;

import com.example.mvc.model.Person;
import com.example.mvc.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "/people", produces = "application/json")
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Person> index() throws IOException {
        return peopleService.list();
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody boolean create(Person person) throws IOException {
        peopleService.save(person);
        return true;
    }

    @RequestMapping("/{id}")
    public @ResponseBody Person helloHost(@PathVariable("id") Long id) throws IOException {
        return peopleService.get(id);
    }
}
