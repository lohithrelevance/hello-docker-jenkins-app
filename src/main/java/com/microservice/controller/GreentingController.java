package com.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/greet")
@Slf4j
public class GreentingController {

	@GetMapping("/{name}")
	public String greeting(@PathVariable("name") String name) {
		
		log.info("Inside greeting(), name is -> {}", name);
		
		return "Greetings from Docker "+ name + "!!";
	}
}
