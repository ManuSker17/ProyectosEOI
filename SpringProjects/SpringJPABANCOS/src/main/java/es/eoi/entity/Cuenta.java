package es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Cuentas")
public class Cuenta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "SALDO")
	private int salario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DNI", referencedColumnName = "DNI")
	private Cliente cliente;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDBANCO", referencedColumnName = "ID")
	private Banco banco;

	public Cuenta() {
	}

	public Cuenta(int salario) {
		super();
		this.salario = salario;

	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", salario=" + salario + "]";
	}

}
