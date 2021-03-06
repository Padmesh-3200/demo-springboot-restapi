package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.repo.IStudentRepo;
import com.service.IStudentService;

@RestController
public class Student {

	@Autowired
	private IStudentService studentService;

	//test
	
	@GetMapping(path="/greet", produces = "application/json")
	public String greeting() {
		return studentService.greeting();
	}
	
	@RequestMapping(path="/greet1", produces = "application/json",method =RequestMethod.GET )
	public String greeting1() {
		return " test messge";
	}
	
	
}
