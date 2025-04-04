package com.test.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class SucursalController {
	
	@PostMapping("/sucursal")
	public String postMethodName(@RequestBody String entity) {
		//TODO: process POST request
		
		return entity;
	}
	
	@GetMapping("/sucursal")
	public String getSucursal(@RequestParam String param) {
		
		System.out.println("SUCURSAL ENTRADA: " + param);
		return new String();
	}
	
	

}
