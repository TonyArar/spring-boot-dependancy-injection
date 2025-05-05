package com.spring.spring_boot_dependancy_injection;

import com.spring.spring_boot_dependancy_injection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In main method");

		System.out.println(controller.sayHello());
	}

}
