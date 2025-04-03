package com.nxhtans.first_app_spring.controllers;

import com.nxhtans.first_app_spring.domains.User;
import com.nxhtans.first_app_spring.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Nathan");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter,@RequestBody User body) {
        return "Hello World " + body.getName() + " Id:" + id + " Filter:" + filter;
    }
}
