package com.everis.curso;

import com.everis.curso.excepciones.AccesoDatosEx;

public class ImplementacionOracle implements AccesoDatos {

	private boolean SimularError;

	public ImplementacionOracle() {
		super();

	}

	public ImplementacionOracle(boolean simularError) {
		super();
		SimularError = simularError;
	}

	@Override
	public void listar() throws AccesoDatosEx {
		if (SimularError == true)
			throw new AccesoDatosEx("Error en el listado de Oracle");
		System.out.println("Lista Oracle satisfactoriamente");

	}

	@Override
	public void insertar() throws AccesoDatosEx {
		if (SimularError == true)
			throw new AccesoDatosEx("Error en el listado de Oracle");
		System.out.println("Inserta Oracle satisfactoriamente");

	}

	@Override
	public void SimulaError() {
		SimularError = true;

	}

}
