package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.bean.Person;

@RestController
@RequestMapping("/sys")
public class AController {
	@Autowired
	private Person person;
	
	@RequestMapping("/hello")
	public String a() {
		return "helloworld";
	}
	
	@RequestMapping("/person")
	public Person b() {
		return person;
	}
	
}
