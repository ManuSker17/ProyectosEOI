package com.everis.curso;

public class Circulo extends Figuras {

	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}

}
