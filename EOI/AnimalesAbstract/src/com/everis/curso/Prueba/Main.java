package com.everis.curso.Prueba;

import com.everis.curso.ClasesAbstract.*;

public class Main {

	public static void main(String[] args) {

		Animales[] Arranim = new Animales[3];

		Arranim[0] = new Perro("Perro", "Husky");
		Arranim[1] = new Gato("Gato", "Persa");
		Arranim[2] = new Elefante("Elefante", 3.5);

		for (int i = 0; i < Arranim.length; i++) {
			Arranim[i].comportamiento();
			Arranim[i].comer();
			System.out.println(Arranim[i]);
		}

	}

}
