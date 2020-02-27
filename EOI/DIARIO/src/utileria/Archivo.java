package utileria;

import java.io.*;

public class Archivo {

	public static void crearArchivo(String nombreArchivo) {

		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.close();
			System.out.println("El archivo se ha creado correctamente");

		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		}
	}

	public static void escribirArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			String contenido = "Contenido a escribir en el archivo";
			salida.println(contenido + "\n");
			salida.println("Fin de la escritura");
			salida.close();
			System.out.println("Se ha escrito correctamente");
		}

		catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		}
	}

	public static void leerArchivo(String nombreArchivo) throws FileNotFoundException{
		File archivo = new File(nombreArchivo);
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String lectura = entrada.readLine();
			while (lectura != null) {
				System.out.println(lectura);
				lectura = entrada.readLine();
			}
			entrada.close();

		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
			throw new FileNotFoundException();
		} catch (IOException ex) {
			ex.printStackTrace(System.out);
		}
	}

	public static void anexarArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			String contenido = "Contenido a escribir en el archivo";
			salida.println(contenido + "\n");
			salida.println("Fin de la escritura");
			salida.close();
			//System.out.println("Se ha escrito correctamente");
		}

		catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		} catch (IOException ex) {
			ex.printStackTrace(System.out);
		}
	}

	public static void escribirArrayArchivo(String nombreArchivo, String[] texto) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			for (String line : texto) {
				salida.println(line);
			}
			salida.close();
			System.out.println("Se ha escrito correctamente");
		}catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		}
	}
	
	public static void anexarStringArchivo(String nombreArchivo, String linea) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
				salida.println(linea);
			salida.close();
			//System.out.println("Se ha escrito correctamente");
		}catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		} catch (IOException ex) {
			ex.printStackTrace(System.out);
		}
	}
	
	public static void anexarArrayArchivo(String nombreArchivo, String[] texto) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			for (String line : texto) {
				salida.println(line);
			}
			salida.close();
			System.out.println("Se ha escrito correctamente");
		}catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		} catch (IOException ex) {
			ex.printStackTrace(System.out);
		}
	}
	public static void escribirStringArchivo(String nombreArchivo,String line) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.println(line);
			salida.close();
			System.out.println("Se ha escrito correctamente");
		}

		catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		}
	}
}
