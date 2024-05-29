package com.example.demo_vs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class DemoVsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoVsApplication.class, args);
	}

}
