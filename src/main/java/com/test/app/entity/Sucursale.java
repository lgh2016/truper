package com.test.app.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "sucursales")
public class Sucursale {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sucursal_id;
	
	private String nombre;

	public Long getSucursal_id() {
		return sucursal_id;
	}

	public void setSucursal_id(Long sucursal_id) {
		this.sucursal_id = sucursal_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}