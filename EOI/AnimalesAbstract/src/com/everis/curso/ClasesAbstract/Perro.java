package com.everis.curso.ClasesAbstract;

public class Perro extends Animales {

	String raza;

	public Perro(String tipo, String raza) {
		super(tipo);
		this.raza = raza;
	}

	@Override
	public void comportamiento() {
		System.out.println("GUAU");

	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Perro [" + super.toString() + " raza= " + raza + "]";
	}

}
