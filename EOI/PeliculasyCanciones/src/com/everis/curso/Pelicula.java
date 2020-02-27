package com.everis.curso;

public class Pelicula implements Reproducible {

	String nombre;
	String actores;
	
	
	public Pelicula() {

	}
	public Pelicula(String nombre, String actores) {
		super();
		this.nombre = nombre;
		this.actores = actores;
	}
	@Override
	public void play() {
		System.out.println("Reproduciendo "+this.toString());
		
	}
	@Override
	public void stop() {
		System.out.println("Reproduccion parada");
	
	
	}
	public String getNombre() {
		return nombre;
	}
	public String getActores() {
		return actores;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setActores(String actores) {
		this.actores = actores;
	}
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", actores=" + actores + "]";
	}
	
	

}
