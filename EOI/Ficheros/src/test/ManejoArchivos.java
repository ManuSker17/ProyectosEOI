package test;

import static utileria.Archivo.*;
public class ManejoArchivos {

	public static void main(String[] args) {
		String nombreArchivo = "c:\\Manuel\\archivoPruebajava.txt";
		
		String[] texto= {"Un dia","me comi una mierda","y me supo bien"};
		// Crea el archivo
		//crearArchivo(nombreArchivo);
		
		// Escribe el archivo
		//escribirArchivo(nombreArchivo);
		
		// Leer el archivo
		//leerArchivo(nombreArchivo);
		
		// Escribir en el archivo donde acaba
		//anexarArchivo(nombreArchivo);
		
		// Escribir un Array de Strings
		//escribirArrayArchivo(nombreArchivo, texto);
		
		// Anexar un Array de String
		anexarArrayArchivo(nombreArchivo, texto);
	}
}
