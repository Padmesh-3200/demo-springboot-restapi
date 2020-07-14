package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {

	@GetMapping(path="/greet", produces = "application/json")
	public String greeting() {
		return "Hello, Welcome!";
	}
	
	@RequestMapping(path="/greet1", produces = "application/json",method =RequestMethod.GET )
	public String greeting1() {
		return "Hello, Welcome! via Request mapping";
	}
}
