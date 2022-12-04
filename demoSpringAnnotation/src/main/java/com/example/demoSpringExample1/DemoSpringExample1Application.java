package com.example.demoSpringExample1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringExample1Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoSpringExample1Application.class, args);
		
		HelloWorld h = context.getBean(HelloWorld.class);
		h.display();
		
		
		
	}

}
