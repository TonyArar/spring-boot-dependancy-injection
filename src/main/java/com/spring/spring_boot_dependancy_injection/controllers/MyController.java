package com.spring.spring_boot_dependancy_injection.controllers;


import com.spring.spring_boot_dependancy_injection.services.GreetingService;
import com.spring.spring_boot_dependancy_injection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }

}
