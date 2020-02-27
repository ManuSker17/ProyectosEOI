package com.everis.curso.clases;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static utileria.Archivo.*;

public class Diario {
	
	String nombreArchivo;
	public Diario(String nombreArchivo) {
		super();
		this.nombreArchivo = nombreArchivo;
	}

	public boolean escribirDiario() {
		Scanner sc = new Scanner(System.in);
		String line;
		crearArchivo(nombreArchivo);
		line=sc.nextLine();
		do {
			anexarStringArchivo(nombreArchivo, line);
			line=sc.nextLine();
		}while(!line.equals("FIN"));
		sc.close();
		return true;
	}
	
	public boolean leerDiario() {
		try {
			leerArchivo(nombreArchivo);}
		catch(FileNotFoundException ex) {
			System.out.println("El archivo no existe");
			return false;
		}
		return true;
	}
}
