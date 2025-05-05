package com.spring.spring_boot_dependancy_injection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingsServicePrimary implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Hello from the primary bean";
    }


}
