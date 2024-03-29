package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(final String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") final String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/person")
	public Person person(@RequestParam(value = "name", defaultValue = "World") final String name) {
		String greeting = String.format("Hello %s!", name);
		Person person = new Person();
		person.setName(name);
		person.setGreeting(greeting);
	
		return person;
	}
	

}
