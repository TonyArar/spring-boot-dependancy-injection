package com.spring.spring_boot_dependancy_injection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

//@ActiveProfiles("dev")
@ActiveProfiles("uat")
//@ActiveProfiles("qa")
@SpringBootTest
class DataControllerTest {

    @Autowired
    DataController dataController;

    @Test
    void getData() {
        System.out.println(dataController.getData());
    }

}