package com.everis.curso;

public class Animal {
	protected String Nombre;
	protected int Peso;
	protected double Altura;

	public Animal() {

	}

	public Animal(String nombre, int peso, double altura) {
		Nombre = nombre;
		Peso = peso;
		Altura = altura;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getPeso() {
		return Peso;
	}

	public void setPeso(int peso) {
		Peso = peso;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}

	@Override
	public String toString() {
		return ("El " + getClass().getSimpleName() + " se llama " + getNombre() + ", pesa " + getPeso() + ", mide "
				+ getAltura());

	}

}
