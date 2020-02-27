package es.eoi.ejerciciojpa.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Bancos")
public class Banco {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "nombre")
	private String name;
	@Column(name = "ciudad")
	private String ciudad;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "banco")
	private List<Cuenta> listCuentas;

	public Banco() {
	}

	public Banco(String name, String ciudad) {
		super();
		this.name = name;
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Banco [id=" + id + ", name=" + name + ", ciudad=" + ciudad + "]";
	}

}
