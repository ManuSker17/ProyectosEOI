package com.everis.curso;

public class Perro extends Animal{

	
	public Perro() {
		super();
	}
	
	public Perro(String nombre, int peso, double altura) {
		super(nombre, peso, altura);
	}

	public String ladrar() {
		return("Guau primo que flipe");
	}
}
