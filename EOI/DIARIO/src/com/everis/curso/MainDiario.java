package com.everis.curso;

import java.util.Scanner;

import com.everis.curso.clases.Diario;

public class MainDiario {

	public static void main(String[] args) {
		
		Diario diario = new Diario("diario.txt");
		Scanner sc= new Scanner(System.in);
		boolean comprobacion=false;
		while(comprobacion==false) {
			System.out.println("1 Escribir en el diario");
			System.out.println("2 Leer en el diario");
			int selec=sc.nextInt();
			if (selec==1)
				comprobacion=diario.escribirDiario();
			else if (selec==2)
				comprobacion=diario.leerDiario();
			else {
				System.out.println("Hasta nuki");
				comprobacion =true;}
		}
		sc.close();
		
	}

}
