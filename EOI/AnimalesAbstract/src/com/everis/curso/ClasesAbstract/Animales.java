package com.everis.curso.ClasesAbstract;

public abstract class Animales {

	protected String TipoAnimal;

	public Animales(String tipoAnimal) {
		TipoAnimal = tipoAnimal;
	}

	public abstract void comportamiento();

	public void comer() {
		System.out.println("A COMEEEER");
	}

	public String getTipoAnimal() {
		return TipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		TipoAnimal = tipoAnimal;
	}

	@Override
	public String toString() {
		return ("TipoAnimal= " + TipoAnimal);
	}

}
