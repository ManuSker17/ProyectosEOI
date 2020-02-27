package com.es.eoi.beca.pokemon.service;

import com.es.eoi.beca.pokemon.Application;
import com.es.eoi.beca.pokemon.entity.Pokedex;
import com.es.eoi.beca.pokemon.repositorio.PokemonRepositorio;
import com.es.eoi.beca.pokemon.utils.PokemonFactory;

public class PokemonService {
		
	PokemonRepositorio pokeRepo = new PokemonRepositorio();

	public void init(){
		Application.listpokemons=pokeRepo.cargarPokemons();
		Pokedex auxpokedex = new Pokedex();
		Application.trainer.setPokedex(auxpokedex.add());
	}
}
