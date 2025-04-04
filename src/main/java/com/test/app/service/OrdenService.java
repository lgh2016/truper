package com.test.app.service;

import org.springframework.http.ResponseEntity;

import com.test.app.dto.OrdeneDto;

public interface OrdenService {

	/*
	 * OBTENER ORDEN POR ID
	 */
	ResponseEntity<?> getOrden(Long id);

	ResponseEntity<?> save(OrdeneDto dto);

}
