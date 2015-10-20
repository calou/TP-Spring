package com.example.mvc.controller;

import com.example.mvc.model.HelloMessage;
import com.example.mvc.service.HelloService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SerializationController {

   private HelloService helloService;

    public List<HelloMessage> serializeList() throws IOException {
        HelloMessage firstMessage = new HelloMessage();
        firstMessage.setDate(new Date(110, 12, 31));
        firstMessage.setMessage("Ca a l'air de marcher!!!");

        HelloMessage secondMessage = new HelloMessage();
        secondMessage.setDate(new Date(100, 1, 1));
        secondMessage.setMessage("C'est cool!!!");

        List<HelloMessage> messages = new ArrayList<HelloMessage>();
        messages.add(firstMessage);
        messages.add(secondMessage);
        return messages;
    }

    public HelloMessage serializeMessage(String myName) throws IOException {
        HelloMessage helloMessage = new HelloMessage();
        helloMessage.setDate(new Date());
        helloMessage.setMessage(helloService.sayHello(myName));
        return helloMessage;
    }
}
