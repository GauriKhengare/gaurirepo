package com.in28minutes.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.microservices.configuration.Configuration;

@SpringBootApplication
public class LimitsService1Application{

	
	
	public static void main(String[] args) {
		SpringApplication.run(LimitsService1Application.class, args);
	}
	

}
