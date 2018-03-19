package com.michelon.microservico2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class Microservico2Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservico2Application.class, args);
	}

	@GetMapping
	public String mundo() {
		return "Mundo";
	}
}
