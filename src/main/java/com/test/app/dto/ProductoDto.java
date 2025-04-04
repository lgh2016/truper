package com.test.app.dto;

public class ProductoDto {

	private Long producto_id;
	private Long orden_id;
	private String codigo;
	private Long precio;

	public Long getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(Long producto_id) {
		this.producto_id = producto_id;
	}

	public Long getOrden_id() {
		return orden_id;
	}

	public void setOrden_id(Long orden_id) {
		this.orden_id = orden_id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

}
