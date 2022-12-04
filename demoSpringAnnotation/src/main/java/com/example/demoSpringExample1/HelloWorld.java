package com.example.demoSpringExample1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype" )
public class HelloWorld {
	
	private HelloWorld() {
		//System.out.println("Hello World from constructor");

	}
	
	public void display() {
		System.out.println("Hello World from spring");
	}

}
