package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class IndexController {

    @RequestMapping("/")
    public void index(ServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.write("Hello !?");
    }

    @RequestMapping("/ip")
    public void helloIp(ServletResponse response, ServletRequest request) throws IOException {
        PrintWriter out = response.getWriter();
        out.write("Hello " + request.getRemoteAddr() + " !?");
    }

    @RequestMapping("/you")
    public @ResponseBody String helloHost() throws IOException {
        return "Hello you!";
    }

}
