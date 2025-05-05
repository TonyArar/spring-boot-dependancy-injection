package com.spring.spring_boot_dependancy_injection.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Friends don't let friends do property injection";
    }

}
