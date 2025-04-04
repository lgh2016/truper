package com.test.app.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordenes")
public class Ordene {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orden_id;

	@ManyToOne
	@JoinColumn(name = "sucursal_id")
	private Long sucursal_id;
	
	private Date fecha;
	
	private Long total;

	public Long getOrden_id() {
		return orden_id;
	}

	public void setOrden_id(Long orden_id) {
		this.orden_id = orden_id;
	}

	public Long getSucursal_id() {
		return sucursal_id;
	}

	public void setSucursal_id(Long sucursal_id) {
		this.sucursal_id = sucursal_id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

}