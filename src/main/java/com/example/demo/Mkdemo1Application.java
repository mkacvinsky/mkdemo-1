package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Mkdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Mkdemo1Application.class, args);
	}

	@GetMapping(value = "/message", produces = {MediaType.TEXT_PLAIN_VALUE})
	public String getMessage() {
		return "jakasracka";
	}
}
