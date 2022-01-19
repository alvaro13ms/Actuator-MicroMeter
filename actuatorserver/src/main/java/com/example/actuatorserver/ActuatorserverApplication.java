package com.example.actuatorserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan 
public class ActuatorserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorserverApplication.class, args);
	}

}
