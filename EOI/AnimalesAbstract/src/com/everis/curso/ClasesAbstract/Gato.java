package com.everis.curso.ClasesAbstract;

public class Gato extends Animales {

	String raza;

	public Gato(String tipoAnimal, String raza) {
		super(tipoAnimal);
		this.raza = raza;
	}

	@Override
	public void comportamiento() {
		System.out.println("MIAUUUU");
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Gato [" + super.toString() + " raza= " + raza + "]";
	}

}
