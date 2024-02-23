package com.Akshay.springbootcicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HellowController {
	
	@GetMapping("/welcome")
	public String getMessage() {
		return "Hellow Welcome to ABChannel!!";

	}
}
