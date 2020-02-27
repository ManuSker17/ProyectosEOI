package com.pruebas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Compra")
public class Compra {

	public class Cuenta {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;

		@Column(name="FECHA_COMPRA")
		private int fechacompra;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="DNI",referencedColumnName="DNI")
		private Cliente cliente;
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="CODIGO_PRODUCTO",referencedColumnName="CODIGO")
		private Producto producto;
}
}
