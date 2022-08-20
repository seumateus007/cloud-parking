package com.seumateus007.cloudparking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloControler {
	
	@GetMapping
	public String hello () {
		return "Hello DIO MATEUS BEM";
	}

}
