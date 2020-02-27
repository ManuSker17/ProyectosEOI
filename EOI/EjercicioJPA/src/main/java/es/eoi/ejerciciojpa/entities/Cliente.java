package es.eoi.ejerciciojpa.entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="clientes")
public class Cliente {
	@Id
	private String dni;
	@Column(name="nombre")
	private String name;
	@Column(name="direccion")
	private String direccion;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="cliente")
	private List<Cuenta> listCuentas;
	
	public Cliente() {}
	
	public Cliente(String dni, String name, String direccion) {
		super();
		this.dni = dni;
		this.name = name;
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public String getName() {
		return name;
	}

	public String getDireccion() {
		return direccion;
	}

	public List<Cuenta> getListCuentas() {
		return listCuentas;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setListCuentas(List<Cuenta> listCuentas) {
		this.listCuentas = listCuentas;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", name=" + name + ", direccion=" + direccion + "]";
	}
	
	
	
}
