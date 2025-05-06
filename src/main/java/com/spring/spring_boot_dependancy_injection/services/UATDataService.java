package com.spring.spring_boot_dependancy_injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class UATDataService implements DataService {

    @Override
    public String getData() {
        return "UAT";
    }

}
