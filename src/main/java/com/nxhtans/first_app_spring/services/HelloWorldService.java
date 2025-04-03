package com.nxhtans.first_app_spring.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloWorld(String name) {
        return "Hello World! " + name;
    }
}
