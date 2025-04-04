package com.test.app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.test.app.dto.OrdenDto;
import com.test.app.service.OrdenService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class OrdenController {

	private OrdenService ordenService;

	public OrdenController(OrdenService ordenService) {
		super();
		this.ordenService = ordenService;
	}

	/**
	 * OBTENER ORDEN GUARDADA
	 * 
	 * @param param
	 * @return
	 */
	@GetMapping()
	public ResponseEntity<?> getOrden(@RequestParam Long id) {
		System.out.println("PARAMETRO DE ENTRADA CONTROLLER: " + id);
		return ordenService.getOrden(id);
	}

	/**
	 * CREAR UNA ORDEN
	 * 
	 * @param entity
	 * @return
	 */
	@PostMapping()
	public ResponseEntity<?> save(@RequestBody OrdenDto dto) {
		return ordenService.save(dto);
	}

}
