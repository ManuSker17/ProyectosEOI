package es.eoi.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.eoi.jdbc.entity.Alumno;
import es.eoi.jdbc.exception.Exception_AlumnNotFound;

public class AlumnoRepository {

	private java.sql.Connection openConnection() {
		Connection conexion=null;
		try {
		String url = "jdbc:mysql://localhost:3306/bdprueba?serverTimezone=UTC";
		String user = "root";
		String pass = "123456";

		conexion = DriverManager.getConnection(url, user, pass);
		System.out.println("Conectado a ".concat(url));
		}catch(Exception s) {
			s.printStackTrace(System.out);
		}
		
		return conexion;
	}

	public Alumno findByDni(String dni) throws Exception_AlumnNotFound {

		Alumno alu = null;
		try {

			// Establecemos Conexion
			Connection con = openConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * ");
			sql.append("FROM ALUMNO ");
			sql.append("WHERE DNI = ? ");

			// Inicializamos PrepareStatements
			PreparedStatement pst = con.prepareStatement(sql.toString());
			pst.setString(1, dni);

			// Ejecutamos y recuperamos la consulta SQL
			ResultSet rs = pst.executeQuery();

			// Recorreremos los datos obtenidos (si los hay)
			while (rs.next()) {
				alu = new Alumno();
				alu.setDni(rs.getString("DNI"));
				alu.setNombre(rs.getString("NOMBRE"));
				alu.setApellidos(rs.getString("APELLIDOS"));
				alu.setEdad(rs.getInt("EDAD"));
			}
			
			con.close();
				
		}catch (Exception s) {
			s.printStackTrace();
		}
		
		if (alu==null)
			throw new Exception_AlumnNotFound("ERROR: Alumno no encontrado");

		return alu;

	}

	public List<Alumno> findAll() {

		List<Alumno> alumnos = new ArrayList<Alumno>();

		try {

			// Establecemos Conexion
			Connection con = openConnection();

			// Inicializamos Statements
			Statement st = con.createStatement();

			// Ejecutamos y recuperamos la consulta SQL
			ResultSet rs = st.executeQuery("SELECT * FROM ALUMNO");

			// Recorreremos los datos obtenidos (si los hay)
			while (rs.next()) {
				Alumno alu = new Alumno();
				alu.setDni(rs.getString("DNI"));
				alu.setNombre(rs.getString("NOMBRE"));
				alu.setApellidos(rs.getString("APELLIDOS"));
				alu.setEdad(rs.getInt("EDAD"));

				alumnos.add(alu);				
			}
			con.close();
		} catch (Exception s) {
			s.printStackTrace(System.out);
		}

		return alumnos;
	}

	public boolean create(Alumno alu) {
		
		boolean key=false;
		int rs=0;
		try {
			// Establecemos Conexion
			Connection con = openConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO ");
			sql.append("ALUMNO(nombre,apellidos,dni,edad) ");
			sql.append("VALUES(?,?,?,?)");

			// Inicializamos PrepareStatements
			PreparedStatement pst = con.prepareStatement(sql.toString());
			pst.setString(1, alu.getNombre());
			pst.setString(2, alu.getApellidos());
			pst.setString(3, alu.getDni());
			pst.setInt(4, alu.getEdad());
			rs= pst.executeUpdate();

			con.close();
		} catch (Exception s) {
			s.printStackTrace(System.out);
		}
		return rs==1;
	}

	public String delete(String dni) {
		
		int key=0;
		try {

			// Establecemos Conexion
			Connection con = openConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("DELETE ");
			sql.append("FROM ALUMNO ");
			sql.append("WHERE DNI LIKE ? ");

			// Inicializamos PrepareStatements
			PreparedStatement pst = con.prepareStatement(sql.toString());
			pst.setString(1, dni);
			key=pst.executeUpdate();
			
			con.close();
			
		}catch(Exception s) {
			s.printStackTrace(System.out);
		}
		return key==1;
	}

	public boolean update(String dni, String nombre, String apellidos) {
		int key=0;
		try {
			// Establecemos Conexion
			Connection con = openConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE ");
			sql.append("ALUMNO SET NOMBRE=?, APELLIDOS=? ");
			sql.append("WHERE DNI LIKE ?");

			// Inicializamos PrepareStatements
			PreparedStatement pst = con.prepareStatement(sql.toString());
			pst.setString(1, nombre);
			pst.setString(2, apellidos);
			pst.setString(3, dni);
			key=pst.executeUpdate();
			con.close();
			
	}catch(Exception s) {
		s.printStackTrace(System.out);
	}
		return key==1;
	}

}