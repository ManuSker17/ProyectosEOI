package com.es.eoi.beca.pokemon.utils;

import java.util.Random;

import com.es.eoi.beca.pokemon.Application;
import com.es.eoi.beca.pokemon.entity.Pokemon;

public class PokemonFactory {
	
	public static Pokemon getRandomPokemon() {
				
		Random rand =new Random();
		return Application.listpokemons.get(rand.nextInt(150));
	}

}
