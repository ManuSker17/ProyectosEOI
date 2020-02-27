package es.eoi.entity;

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
@Entity
@Table(name = "clientes")
public class Cliente {
	@Id
	private String dni;
	@Column(name = "nombre")
	private String name;
	@Column(name = "direccion")
	private String direccion;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Cuenta> listCuentas;

	public Cliente() {
	}

	public Cliente(String dni, String name, String direccion) {
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
