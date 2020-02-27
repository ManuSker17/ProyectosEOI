package es.eoi.dto;

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
public class CuentaDto {
	private int id;
	private int salario;

	public CuentaDto() {
	}

	public CuentaDto(int salario) {
		super();
		this.salario = salario;

	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", salario=" + salario + "]";
	}

}
