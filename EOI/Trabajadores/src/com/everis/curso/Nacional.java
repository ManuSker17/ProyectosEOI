package com.everis.curso;

import java.util.Date;

public class Nacional extends Cliente {
	
	String DNI;


	public Nacional(String name, String apellidos, int edad, String direccion) {
		super(name, apellidos, edad, direccion);
		// TODO Auto-generated constructor stub
	}

	public Nacional(String name, String apellidos, int edad, String direccion, Date fechaRegistro, boolean vip) {
		super(name, apellidos, edad, direccion, fechaRegistro, vip);
		// TODO Auto-generated constructor stub
	}
	
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}


}
