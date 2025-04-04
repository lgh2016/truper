package com.test.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.app.dto.SucursaleDto;
import com.test.app.service.SucursalService;

@RestController()
public class SucursalController {

	private SucursalService sucursalService;

	public SucursalController(SucursalService sucursalService) {
		super();
		this.sucursalService = sucursalService;
	}

	@PostMapping("/sucursal")
	public ResponseEntity<?> postMethodName(@RequestBody SucursaleDto dto) {
		return sucursalService.saveSucursal(dto);
	}

	@GetMapping("/sucursal")
	public String getSucursal(@RequestParam String param) {

		System.out.println("SUCURSAL ENTRADA: " + param);
		return new String();
	}

}
