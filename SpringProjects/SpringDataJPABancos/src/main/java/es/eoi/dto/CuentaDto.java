package es.eoi.dto;

import es.eoi.entity.Cuenta;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CuentaDto {
	private String dni;
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

	public CuentaDto(String dni, int id, int salario) {
		super();
		this.dni = dni;
		this.id = id;
		this.salario = salario;
	}
	
	public CuentaDto(Cuenta cuenta) {
		
		dni=cuenta.getCliente().getDni();
		id=cuenta.getBanco().getId();
		salario=cuenta.getSalario();
	}

}
