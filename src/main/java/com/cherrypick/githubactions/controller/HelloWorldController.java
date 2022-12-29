package com.cherrypick.githubactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {



	@GetMapping("/hello-world")
	public String helloWorld(){
	return "Githib Actions Hello World";
	}

}
