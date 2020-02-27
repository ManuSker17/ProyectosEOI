package com.everis.curso;

import java.util.Date;

public class Cliente extends Persona {

	
	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int contadorEmpleado;
	
	public Cliente(String name, String apellidos, int edad, String direccion) {
		super(name, apellidos, edad, direccion);
		this.idCliente=++contadorEmpleado;	
		
	}
	
	public Cliente(String name, String apellidos, int edad, String direccion, Date fechaRegistro, boolean vip) {
		super(name, apellidos, edad, direccion);
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
		this.idCliente=++contadorEmpleado;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public boolean isVip() {
		return vip;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	@Override
	public String toString() {
		return "Cliente ["+super.toString()+" idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + "]";
	}


}
