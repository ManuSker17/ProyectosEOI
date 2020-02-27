package com.es.eoi.beca.pokemon.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.es.eoi.beca.pokemon.entity.Attributes;
import com.es.eoi.beca.pokemon.entity.Pokemon;


public class Archivo {


	public static List<Pokemon> leerArchivos(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		
		Attributes atr=new Attributes();
		String splitter=";";
		List<Pokemon> listpoke = new ArrayList<Pokemon>();
		int cont=0;
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String lectura = entrada.readLine();
			while (lectura != null) {
				String[] elements=lectura.split(splitter);
				Pokemon poke = new Pokemon();
				poke.setId(Integer.parseInt(elements[0]));
				poke.setName(elements[1]);
				poke.setType(elements[3]);
				atr.setHealth(Integer.parseInt(elements[5]));
				atr.setAttack(Integer.parseInt(elements[5]));
				atr.setDefense(Integer.parseInt(elements[5]));
				poke.setAtt(atr);
				listpoke.add(poke);
				//System.out.println(listpoke.get(cont));
				cont++;
				lectura = entrada.readLine();
			}
			entrada.close();

		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		} catch (IOException ex) {
			ex.printStackTrace(System.out);
		}

		return listpoke;
	}

}
