package com.pruebas.bd;

import java.sql.Connection;
import java.sql.DriverManager;

import com.pruebas.config.CrudConfig;

public class Conexion {

	public static java.sql.Connection openConnection() {
		Connection conexion=null;
		CrudConfig config = new CrudConfig();
		try {
		String url = config.getPropiedad("urlBd");
		String user = config.getPropiedad("user");
		String pass = config.getPropiedad("password");

		conexion = DriverManager.getConnection(url, user, pass);
		System.out.println("Conectado a ".concat(url));
		}catch(Exception s) {
			s.printStackTrace(System.out);
		}
		
		return conexion;
	}
}
