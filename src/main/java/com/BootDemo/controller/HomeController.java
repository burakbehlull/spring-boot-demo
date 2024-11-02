package com.BootDemo.controller;

import com.BootDemo.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "Merhaba, Spring Boot!";
	}
}
