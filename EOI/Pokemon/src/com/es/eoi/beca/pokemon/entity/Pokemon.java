package com.es.eoi.beca.pokemon.entity;

public class Pokemon {

	private String name;
	private int id;
	private String type;
	private Attributes att;

	public Attributes getAtt() {
		return att;
	}

	public void setAtt(Attributes att) {
		this.att = att;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", id=" + id + ", type=" + type + ", att=" + att + "]";
	}

}
