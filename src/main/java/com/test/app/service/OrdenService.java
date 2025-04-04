package com.test.app.service;

import org.springframework.http.ResponseEntity;

import com.test.app.dto.OrdenDto;

public interface OrdenService {

	/*
	 * OBTENER ORDEN POR ID
	 */
	ResponseEntity<?> getOrden(Long id);

	ResponseEntity<?> save(OrdenDto dto);

}
