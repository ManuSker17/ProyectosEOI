package com.everis.curso;

public class Cuadrado extends Figuras {

	private double lado;
	

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return Math.pow(lado, 2);
	}

}
