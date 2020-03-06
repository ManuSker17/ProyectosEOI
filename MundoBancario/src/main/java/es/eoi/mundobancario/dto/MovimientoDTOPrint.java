package es.eoi.mundobancario.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovimientoDTOPrint {

	private int id;
	private String descripcion;
	private Date fecha;
	private float importe;
	private TiposMovimientoDTO tiposmovimiento;

}
