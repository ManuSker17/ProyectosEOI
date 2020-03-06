package es.eoi.mundobancario.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovimientoDTOCreate {

	private String descripcion;
	private float importe;

}
