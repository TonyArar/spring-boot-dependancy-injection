package com.spring.spring_boot_dependancy_injection.controllers;

import com.spring.spring_boot_dependancy_injection.services.DataService;
import org.springframework.stereotype.Controller;

@Controller
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    public String getData(){
        return dataService.getData();
    }

}
