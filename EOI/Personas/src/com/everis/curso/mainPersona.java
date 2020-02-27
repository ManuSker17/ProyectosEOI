package com.everis.curso;


import java.util.*;

public class mainPersona {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Persona[] personas=new Persona[3];
		
		for (int i = 0; i < 3; i++) {
			personas[i]=new Persona();
			System.out.println("Dime tu nombre:");
			personas[i].setName(sc.nextLine());
			System.out.println("Dime tus apellidos:");
			personas[i].setApellidos(sc.nextLine());
			System.out.println("Dime tu ciudad:");
			personas[i].setCiudad(sc.nextLine());
			System.out.println("Dime tu Edad:");
			personas[i].setEdad(sc.nextInt());
			System.out.println("Dime tu dia de nacimiento:");
			personas[i].setDiaNacim(sc.nextInt());
			System.out.println("Dime tu mes de nacimiento:");
			personas[i].setMesNacim(sc.nextInt());
			System.out.println("Dime tu anyo de nacimiento:");
			personas[i].setAnyoNacim(sc.nextInt());
			System.out.println("Dime tu genero H:hombre M:mujer O:otro:");
			personas[i].setGenero(sc.next().charAt(0));
			System.out.println("Estudias?");
			personas[i].setEstudiar(sc.nextBoolean());
			System.out.println("Trabajas?");
			personas[i].setTrabajar(sc.nextBoolean());
			
			if (sc.hasNextLine())
				sc.nextLine();
			
			
		}
		sc.close();
	}
*/
	
	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		listaPersonas.add(new Persona("Adolfo",15,1994));
		listaPersonas.add(new Persona("Clamidia",20,1995));
		listaPersonas.add(new Persona("Clamidia",12,2008));
		listaPersonas.add(new Persona("Clamidia",12,2009));
		
		Collections.sort(listaPersonas);
		
		System.out.println(listaPersonas);
	}
}
