package com.spring.spring_boot_dependancy_injection.controllers;

import com.spring.spring_boot_dependancy_injection.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;


    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
