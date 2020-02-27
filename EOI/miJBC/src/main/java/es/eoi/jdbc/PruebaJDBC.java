package es.eoi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.eoi.entity.Departamento;
import es.eoi.entity.Empleado;


public class PruebaJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Empleado> empleados= obtenerEmpleados();
		
		for (Empleado empleado : empleados) {
			System.out.println(empleado);
		}
			
		
	}
	
	private static Departamento buscarDepartamento(int codigo){
		String url = "jdbc:mysql://localhost:3306/bdprueba?serverTimezone=UTC";
		String user = "root";
		String pass = "123456";
		
		Departamento dep = new Departamento();
		try {
			Connection conexion = DriverManager.getConnection(url, user, pass);
			System.out.println("Conectado a ".concat(url));
			
			Statement st = conexion.createStatement();
			
			ResultSet rs =st.executeQuery("Select * from departamento");
			
			while(rs.next()) {
				if (rs.getInt("Codigo")==codigo) {
					
					dep.setCodigo(rs.getInt("Codigo"));
					dep.setNombre(rs.getString("Nombre"));
					dep.setLocalizador(rs.getString("Localizacion"));
					break;
				}

			}
		}catch(Exception s) {
			System.out.println("ERRROR departamento");
			s.printStackTrace(System.out);
		}
		return dep;
	}
	
	private static List<Empleado> obtenerEmpleados(){
		String url = "jdbc:mysql://localhost:3306/bdprueba?serverTimezone=UTC";
		String user = "root";
		String pass = "123456";
		List<Empleado> empleados= new ArrayList<Empleado>();
		try {
			Connection conexion = DriverManager.getConnection(url, user, pass);
			System.out.println("Conectado a ".concat(url));
			
			Statement st = conexion.createStatement();
			
			ResultSet rs =st.executeQuery("Select * from empleado");
			
			while(rs.next()) {
				Empleado emp = new Empleado();
				emp.setDNI(rs.getString("DNI"));
				emp.setNombre(rs.getString("Nombre"));
				emp.setSalario(rs.getInt("Salario"));
				emp.setCodigo_Departamento(buscarDepartamento(rs.getInt("Codigo_Departamento")));
				
				empleados.add(emp);

			}
		}catch(Exception s) {
			System.out.println("ERRROR");
		}
		return empleados;
	}
}
