package com.everis.curso;

import com.everis.curso.excepciones.AccesoDatosEx;

public class ImplementacionMySQL implements AccesoDatos {

	private boolean SimularError;

	public ImplementacionMySQL() {
	}

	public ImplementacionMySQL(boolean simularError) {
		SimularError = simularError;
	}

	@Override
	public void listar() throws AccesoDatosEx {
		if (SimularError == true)
			throw new AccesoDatosEx("Error en el listado de MySQL");
		System.out.println("Lista MySQL satisfactoriamente");

	}

	@Override
	public void insertar() throws AccesoDatosEx {
		if (SimularError == true)
			throw new AccesoDatosEx("Error en el insertado de MySQL");
		System.out.println("Inserta MySQL satisfactoriamente");
	}

	@Override
	public void SimulaError() {
		SimularError = true;

	}

}
