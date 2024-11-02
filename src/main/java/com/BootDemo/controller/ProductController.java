package com.BootDemo.controller;

import com.umit.model.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ProductController {
	@GetMapping("/products/{id}")
	public String FindByProductId(@PathVariable int id) {
		return "Product Id: "+ id;
	}
	
	@PostMapping("/products")
	public Product createProduct(@RequestBody Product product) {
		System.out.println("Dönen Products: "+ product);;
		return product;
	}
}
