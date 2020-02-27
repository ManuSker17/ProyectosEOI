package com.everis.curso;

import com.everis.curso.excepciones.AccesoDatosEx;

public interface AccesoDatos {
	int MAX_REGISTROS = 10;

	void listar() throws AccesoDatosEx;

	void insertar() throws AccesoDatosEx;

	void SimulaError();
}
