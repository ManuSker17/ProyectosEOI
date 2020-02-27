package com.everis.curso;

import java.util.Scanner;

public class MainAnimal {
	
	public static void main(String[] args) {
		
		Perro[] perros=new Perro[2];
		Gato[] gatos=new Gato[2];
		Raton[] ratones=new Raton[2];
		
		Scanner sc =new Scanner(System.in);
		
		
		for (int i = 0; i < perros.length; i++) {
			perros[i] =new Perro();
			System.out.println("Como se llama tu perro?");
			perros[i].setNombre(sc.nextLine());
			System.out.println("Cuanto mide?");
			perros[i].setAltura(sc.nextDouble());
			System.out.println("Cuanto pesa?");
			perros[i].setPeso(sc.nextInt());
			if (sc.hasNextLine())
				sc.nextLine();
			
		}
		
		for (int i = 0; i < gatos.length; i++) {
			gatos[i] =new Gato();
			System.out.println("Como se llama tu gato?");
			gatos[i].setNombre(sc.nextLine());
			System.out.println("Cuanto mide?");
			gatos[i].setAltura(sc.nextDouble());
			System.out.println("Cuanto pesa?");
			gatos[i].setPeso(sc.nextInt());
			if (sc.hasNextLine())
				sc.nextLine();
			
		}
		
		for (int i = 0; i < ratones.length; i++) {
			ratones[i] =new Raton();
			System.out.println("Como se llama tu raton?");
			ratones[i].setNombre(sc.nextLine());
			System.out.println("Cuanto mide?");
			ratones[i].setAltura(sc.nextDouble());
			System.out.println("Cuanto pesa?");
			ratones[i].setPeso(sc.nextInt());
			if (sc.hasNextLine())
				sc.nextLine();
			
		}
		
		for (int i = 0; i < perros.length; i++) {
			System.out.println(perros[i].toString()+" y hace "+perros[i].ladrar());			
		}
		for (int i = 0; i < gatos.length; i++) {
			System.out.println(gatos[i].toString()+" y hace "+gatos[i].maullar());			
		}
		for (int i = 0; i < ratones.length; i++) {
			System.out.println(ratones[i].toString()+" y hace "+ratones[i].roer());			
		}

	}
	
}
