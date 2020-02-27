package com.es.eoi.beca.pokemon.entity;

import java.util.List;

public class Attributes {

	private int health;
	private int attack;
	private int defense;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	@Override
	public String toString() {
		return "health=" + health + ", attack=" + attack + ", defense=" + defense;
	}


}
