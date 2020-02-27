package com.everis.curso;

import com.everis.curso.excepciones.AccesoDatosEx;

public class MainExcepciones {

	public static void main(String[] args) {

		AccesoDatos[] inter = new AccesoDatos[2];
		inter[0] = new ImplementacionMySQL();
		inter[1] = new ImplementacionOracle();

		try {
			inter[0].insertar();
			inter[1].insertar();
			inter[0].listar();
			inter[1].listar();

		} catch (AccesoDatosEx e) {
			System.out.println(e.getMessage());
		}

		inter[0].SimulaError();
		inter[1].SimulaError();

		try {
			inter[0].insertar();
			inter[1].insertar();
			inter[0].listar();
			inter[1].listar();

		} catch (AccesoDatosEx e) {
			System.out.println(e.getMessage());
		}

	}

}
