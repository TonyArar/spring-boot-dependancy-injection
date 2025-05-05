package com.spring.spring_boot_dependancy_injection.controllers;

import com.spring.spring_boot_dependancy_injection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController controller;

/*
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }
*/

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }

}