package com.test.app.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link com.test.app.entity.Producto}
 */
public class ProductoDto implements Serializable {
    private final Integer id;
    private final String codigo;
    private final String descripcion;
    private final BigDecimal precio;
    private final OrdeneDto orden;

    public ProductoDto(Integer id, String codigo, String descripcion, BigDecimal precio, OrdeneDto orden) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.orden = orden;
    }

    public Integer getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public OrdeneDto getOrden() {
        return orden;
    }
}