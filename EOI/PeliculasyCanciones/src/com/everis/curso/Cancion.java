package com.everis.curso;

public class Cancion implements Reproducible {
	
	String titulo;
	String interpretes;
	
	public Cancion() {

	}

	public Cancion(String titulo, String interpretes) {
		super();
		this.titulo = titulo;
		this.interpretes = interpretes;
	}

	@Override
	public void play() {
		System.out.println("Reproduciendo "+this.toString());

	}

	@Override
	public void stop() {
		System.out.println("Reproduccion parada");
		
	}

	public String getTitulo() {
		return titulo;
	}

	public String getInterpretes() {
		return interpretes;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setInterpretes(String interpretes) {
		this.interpretes = interpretes;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", interpretes=" + interpretes + "]";
	}
	

}
