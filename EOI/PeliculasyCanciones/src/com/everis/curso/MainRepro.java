package com.everis.curso;

public class MainRepro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reproducible[] listadereproduccion = new Reproducible[6];

		String[] actores = { "DiCaprio", "Emma Watson", "Haley Berry" };

		listadereproduccion[0] = new Pelicula("Titanic", actores[0]);
		listadereproduccion[1] = new Pelicula("Doom", actores[1]);
		listadereproduccion[2] = new Pelicula("Django", actores[2]);
		listadereproduccion[3] = new Cancion("Faint", "Linkin Park");
		listadereproduccion[4] = new Cancion("Cantando", "KaseO");
		listadereproduccion[5] = new Cancion("Mentiras", "ToteKing");

		for (int i = 0; i < listadereproduccion.length; i++) {
			listadereproduccion[i].play();
			listadereproduccion[i].stop();
		}
		((Pelicula) listadereproduccion[0]).getNombre();

	}

}
