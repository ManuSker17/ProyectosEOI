package es.eoi.ejerciciojpa.entities;

import javax.persistence.*;


@Entity
@Table(name="Cuentas")
public class Cuenta {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="SALDO")
	private int salario;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DNI",referencedColumnName="DNI")
	private Cliente cliente;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="IDBANCO",referencedColumnName="ID")
	private Banco banco;
	
	
	public Cuenta() {}
	public Cuenta(int salario) {
		super();
		this.salario = salario;

	}
	public int getId() {
		return id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Banco getBanco() {
		return banco;
	}
	public int getSalario() {
		return salario;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", salario=" + salario +  "]";
	}
	
	
}
