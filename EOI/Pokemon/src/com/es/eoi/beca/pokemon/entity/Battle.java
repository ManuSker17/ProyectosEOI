package com.es.eoi.beca.pokemon.entity;

import java.util.Calendar;
import java.util.Date;

public class Battle {

	private Pokemon pokemon1;

	private Pokemon pokemon2;

	private Date date;

	public Battle(Pokemon pokemon1, Pokemon pokemon2) {
		this.pokemon1 = pokemon1;
		this.pokemon2 = pokemon2;
		this.date = Calendar.getInstance().getTime();
	}

	public Pokemon getPokemon1() {
		return pokemon1;
	}

	public void setPokemon1(Pokemon pokemon1) {
		this.pokemon1 = pokemon1;
	}

	public Pokemon getPokemon2() {
		return pokemon2;
	}

	public void setPokemon2(Pokemon pokemon2) {
		this.pokemon2 = pokemon2;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
