package com.test.app.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.test.app.dto.OrdeneDto;
import com.test.app.service.OrdenService;

@Service
public class OrdenServiceImpl implements OrdenService{

	@Override
	public ResponseEntity<?> getOrden(Long id) {
		System.out.println("Parametro de entrada: " +  id);
		
		
		
		return null;
	}

	/**
	 * CREAR ORDEN
	 */
	@Override
	public ResponseEntity<?> save(OrdeneDto dto) {
		System.out.println("ORDEN DE ENTRADA: " + dto);
		
		
		
		return null;
	}

}
