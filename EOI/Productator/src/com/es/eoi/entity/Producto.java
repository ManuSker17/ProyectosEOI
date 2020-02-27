package com.es.eoi.entity;

public class Producto {
	
	private String codigo;
	private String nombre;
	private String descripcion;
	private String IVA;
	private Double precio;
	private Integer stock;
	private Integer ventas;
	private String categoria;
	
	
	
	public String getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getIVA() {
		return IVA;
	}
	public Double getPrecio() {
		return precio;
	}
	public Integer getStock() {
		return stock;
	}
	public Integer getVentas() {
		return ventas;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setIVA(String iVA) {
		IVA = iVA;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public void setVentas(Integer ventas) {
		this.ventas = ventas;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", IVA=" + IVA
				+ ", precio=" + precio + ", stock=" + stock + ", ventas=" + ventas + ", categoria=" + categoria + "]";
	}
	
	

}
