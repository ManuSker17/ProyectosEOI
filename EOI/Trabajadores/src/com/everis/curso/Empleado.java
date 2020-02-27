package com.everis.curso;

public class Empleado extends Persona {

	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	

	public Empleado(String name, String apellidos, int edad, String direccion) {
		super(name, apellidos, edad, direccion);
		// TODO Auto-generated constructor stub
	}

	public Empleado(String name, String apellidos, int edad, String direccion, double sueldo) {
		super(name, apellidos, edad, direccion);
		
		this.idEmpleado= ++contadorEmpleado;
		this.sueldo=sueldo;
	}
	
	public int getIdEmpleado() {
		return idEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado ["+super.toString()+" idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + "]";
	}

	

}
