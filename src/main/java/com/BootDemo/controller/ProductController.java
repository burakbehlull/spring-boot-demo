package com.BootDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ProductController {
	@GetMapping("/products/{id}")
	public String FindByProductId(@PathVariable int id) {
		return "Product Id: "+ id;
	}
}
