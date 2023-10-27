package com.example.demo;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@SpringBootApplication
@RestController
public class Mkdemo1Application {

	Random rand = new Random();
	
	long randomNumber = rand.nextLong(1000);
	
	public static void main(String[] args) {
		SpringApplication.run(Mkdemo1Application.class, args);
	}

	@GetMapping(value = "/message", produces = {MediaType.TEXT_PLAIN_VALUE})
	public String getMessage() {
		return "Happy birthday to you!";
	}
	
	@PostMapping( value = "/number", produces = {MediaType.TEXT_PLAIN_VALUE})
	public String postNumber( @PathParam(value = "number") Long number) {
		String odpoved = "juchu sedi ...";
		if( number < randomNumber ) {
			odpoved = "zvacsi, nehanb sa.";
		} else if ( number > randomNumber ) {
			odpoved = " zmensi, prestrelil si.";
		} else {
			odpoved = " ... trafil si";
			randomNumber = rand.nextLong(1000);
		}
		return "tak ty si hadal " + number + " a ... " + odpoved;
	}
}
