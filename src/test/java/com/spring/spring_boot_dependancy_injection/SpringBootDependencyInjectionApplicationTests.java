package com.spring.spring_boot_dependancy_injection;

import com.spring.spring_boot_dependancy_injection.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBootDependencyInjectionApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutowireOfController() {
		System.out.println(myController.sayHello());
	}

	@Test
	void getControllerFromContext() {
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {

	}

}
