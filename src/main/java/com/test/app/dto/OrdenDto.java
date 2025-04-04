package com.test.app.dto;

public class OrdenDto {

	private Long sucursal_id;
	private Long total;
	private ProductoDto productos;

	public Long getSucursal_id() {
		return sucursal_id;
	}

	public void setSucursal_id(Long sucursal_id) {
		this.sucursal_id = sucursal_id;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public ProductoDto getProductos() {
		return productos;
	}

	public void setProductos(ProductoDto productos) {
		this.productos = productos;
	}

}
