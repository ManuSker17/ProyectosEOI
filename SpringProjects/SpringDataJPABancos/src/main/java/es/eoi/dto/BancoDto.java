package es.eoi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BancoDto {

	private int id;
	private String name;
	private String ciudad;
	
	public BancoDto() {
	}

	public BancoDto(String name, String ciudad) {
		super();
		this.name = name;
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Banco [id=" + id + ", name=" + name + ", ciudad=" + ciudad + "]";
	}

}
