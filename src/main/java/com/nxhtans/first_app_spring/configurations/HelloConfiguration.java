package com.nxhtans.first_app_spring.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello World!";
    }
}
