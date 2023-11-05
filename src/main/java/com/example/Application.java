package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController	
public class Application {

	
	@GetMapping
	public String message(){
		return "Hello Dev Team.We have deployed the latest build for gradle.Just Confirm";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
