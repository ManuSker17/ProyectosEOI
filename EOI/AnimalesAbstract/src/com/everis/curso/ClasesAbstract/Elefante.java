package com.everis.curso.ClasesAbstract;

public class Elefante extends Animales {

	double sizetrompa;

	public Elefante(String tipoAnimal, double sizetrompa) {
		super(tipoAnimal);
		this.sizetrompa = sizetrompa;
	}

	@Override
	public void comportamiento() {
		System.out.println("PUUUUUUUHHHH");
	}

	public double getSizetrompa() {
		return sizetrompa;
	}

	public void setSizetrompa(double sizetrompa) {
		this.sizetrompa = sizetrompa;
	}

	@Override
	public String toString() {
		return "Perro [" + super.toString() + " tamanyo trompa= " + sizetrompa + "m]";
	}

}
