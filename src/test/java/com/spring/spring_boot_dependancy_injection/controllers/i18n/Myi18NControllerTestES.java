package com.spring.spring_boot_dependancy_injection.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

/**
 * when no profile is active, the default profile is used
 * @see com.spring.spring_boot_dependancy_injection.services.i18n.EnglishGreetingService
 */
// @ActiveProfiles("ES")
@SpringBootTest
class Myi18NControllerTestES {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void sayHallo() {
        System.out.println(myi18NController.sayHallo());
    }

}