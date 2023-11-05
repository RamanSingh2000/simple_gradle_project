package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	
	
	public String message(){
		return "Hello Dev Team.Hurray!We have deployed the latest build for gradle";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
