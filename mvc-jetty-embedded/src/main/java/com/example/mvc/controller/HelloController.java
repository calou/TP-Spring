package com.example.mvc.controller;

import com.example.mvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public ModelAndView index() {
        String message = "Hello stranger!";
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("view");
        modelAndView.addObject("msg", message);
        return modelAndView;
    }

    @RequestMapping("/hello/{name}")
    public ModelAndView get(@PathVariable("name") String name) {
        String message = helloService.sayHello(name);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("view");
        modelAndView.addObject("msg", message);
        return modelAndView;
    }
}
