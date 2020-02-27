package com.es.eoi.beca.pokemon;

import java.util.ArrayList;
import java.util.List;

import com.es.eoi.beca.pokemon.controller.PokemonController;
import com.es.eoi.beca.pokemon.entity.Pokemon;
import com.es.eoi.beca.pokemon.entity.Trainer;
import com.es.eoi.beca.pokemon.repositorio.PokemonRepositorio;
import com.es.eoi.beca.pokemon.service.PokemonService;

public class Application {
	
	public static PokemonRepositorio pokeRepo = new PokemonRepositorio();
	public static List<Pokemon> listpokemons = new ArrayList<Pokemon>();
	public static Trainer trainer = new Trainer("ManuSker");
	public static PokemonController controller = new PokemonController();
	public static PokemonService service = new PokemonService();
	
	public static void main(String[] args) {

		service.init();
		//Inicializar app
		
		//inicializar datos, jugador , pokedex y pokemon
		
		//localizar oponente(pokemon)
		
		//luchar
		
		//resultado

	}

}
