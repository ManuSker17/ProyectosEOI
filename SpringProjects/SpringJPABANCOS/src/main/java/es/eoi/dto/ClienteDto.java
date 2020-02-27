package es.eoi.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDto {
	private String dni;
	private String name;
	private String direccion;

	public ClienteDto() {
	}

	public ClienteDto(String dni, String name, String direccion) {
		super();
		this.dni = dni;
		this.name = name;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", name=" + name + ", direccion=" + direccion + "]";
	}

}
