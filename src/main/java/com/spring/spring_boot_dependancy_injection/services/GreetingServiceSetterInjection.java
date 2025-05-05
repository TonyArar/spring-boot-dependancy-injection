package com.spring.spring_boot_dependancy_injection.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hey I'm setting a greeting";
    }

}
