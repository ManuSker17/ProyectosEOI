package com.es.eoi.beca.pokemon.repositorio;

import java.util.ArrayList;
import java.util.List;

import static com.es.eoi.beca.pokemon.utils.Archivo.*;
import com.es.eoi.beca.pokemon.entity.Pokemon;

public class PokemonRepositorio {
	
	List<Pokemon> listpokemons=new ArrayList<Pokemon>();
	
	public List<Pokemon> cargarPokemons() {
		String nombreArchivo = "C:\\EOI\\Pokemon\\pokemon1.txt";
		listpokemons=leerArchivos(nombreArchivo);
		
		return listpokemons;
	}
}
