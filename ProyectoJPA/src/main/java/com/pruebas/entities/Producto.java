package com.pruebas.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
		@Id
		private String codigo;
		@Column(name="descripcion")
		private String descripcion;
		
		@OneToMany(fetch=FetchType.LAZY,mappedBy="producto")
		private List<Compra> listCuentas;

		@Override
		public String toString() {
			return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + "]";
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
			
		
}
