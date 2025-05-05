package com.spring.spring_boot_dependancy_injection.controllers;

import com.spring.spring_boot_dependancy_injection.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
