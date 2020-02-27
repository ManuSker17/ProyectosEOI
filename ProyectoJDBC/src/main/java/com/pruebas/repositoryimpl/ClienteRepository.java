package com.pruebas.repositoryimpl;

import static com.pruebas.bd.Conexion.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pruebas.repository.Repository;

import model.Cliente;

public class ClienteRepository implements Repository <Cliente, String> {

	@Override
	public String upsert(Cliente cliente) {
		
		Cliente cli=get(cliente.getDni());
		System.out.println(cli);
		if (cli==null) {
			create(cliente);
			return "Se ha creado el cliente";}
		else {
			update(cliente);
			return "Se ha actualizado el cliente";}

	}

	@Override
	public Cliente get(String dni) {
		Cliente cli = null;
		String str = null;
		try {

			// Establecemos Conexion
			Connection con = openConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * ");
			sql.append("FROM CLIENTES ");
			sql.append("WHERE DNI = ? ");

			// Inicializamos PrepareStatements
			PreparedStatement pst = con.prepareStatement(sql.toString());
			pst.setString(1, dni);

			// Ejecutamos y recuperamos la consulta SQL
			ResultSet rs = pst.executeQuery();

			// Recorreremos los datos obtenidos (si los hay)
			while (rs.next()) {
				cli = new Cliente();
				cli.setDni(rs.getString("DNI"));
				cli.setNombre(rs.getString("NOMBRE"));
				cli.setApellidos(rs.getString("APELLIDOS"));
			}
			
			con.close();
				
		}catch (Exception s) {
			s.printStackTrace();
		}

		return cli;
	}

	@Override
	public List<Cliente> getAll() {

		List<Cliente> alumnos = new ArrayList<Cliente>();

		try {

			// Establecemos Conexion
			Connection con = openConnection();

			// Inicializamos Statements
			Statement st = con.createStatement();

			// Ejecutamos y recuperamos la consulta SQL
			ResultSet rs = st.executeQuery("SELECT * FROM CLIENTES");

			// Recorreremos los datos obtenidos (si los hay)
			while (rs.next()) {
				Cliente alu = new Cliente();
				alu.setDni(rs.getString("DNI"));
				alu.setNombre(rs.getString("NOMBRE"));
				alu.setApellidos(rs.getString("APELLIDOS"));

				alumnos.add(alu);				
			}
			con.close();
		} catch (Exception s) {
			s.printStackTrace(System.out);
		}

		return alumnos;
	}

	@Override
	public String delete(String dni) {
		String result=null;
		int key = 0;
		try {

			// Establecemos Conexion
			Connection con = openConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("DELETE ");
			sql.append("FROM CLIENTES ");
			sql.append("WHERE DNI LIKE ? ");

			// Inicializamos PrepareStatements
			PreparedStatement pst = con.prepareStatement(sql.toString());
			pst.setString(1, dni);
			key=pst.executeUpdate();
			if (key==1)
				result="Se ha borrado con exito";
			else
				result="No se ha logrado borrar";
			con.close();
			
		}catch(Exception s) {
			s.printStackTrace(System.out);
			result="No se ha logrado borrar";
		}
		return result;
	}
	
	private boolean create(Cliente alu) {
			
			boolean key=false;
			int rs=0;
			try {
				// Establecemos Conexion
				Connection con = openConnection();
	
				StringBuilder sql = new StringBuilder();
				sql.append("INSERT INTO ");
				sql.append("CLIENTES(nombre,apellidos,dni) ");
				sql.append("VALUES(?,?,?)");
	
				// Inicializamos PrepareStatements
				PreparedStatement pst = con.prepareStatement(sql.toString());
				pst.setString(1, alu.getNombre());
				pst.setString(2, alu.getApellidos());
				pst.setString(3, alu.getDni());
				rs= pst.executeUpdate();
	
				con.close();
			} catch (Exception s) {
				s.printStackTrace(System.out);
			}
			return rs==1;
		}
	
	private boolean update(Cliente cli) {
		int key=0;
		try {
			// Establecemos Conexion
			Connection con = openConnection();
	
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE ");
			sql.append("CLIENTES SET NOMBRE=?, APELLIDOS=? ");
			sql.append("WHERE DNI LIKE ?");
	
			// Inicializamos PrepareStatements
			PreparedStatement pst = con.prepareStatement(sql.toString());
			pst.setString(1, cli.getNombre());
			pst.setString(2, cli.getApellidos());
			pst.setString(3, cli.getDni());
			key=pst.executeUpdate();
			con.close();
			
	}catch(Exception s) {
		s.printStackTrace(System.out);
	}
		return key==1;
	}

}
