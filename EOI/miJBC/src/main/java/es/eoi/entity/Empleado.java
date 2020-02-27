package es.eoi.entity;

public class Empleado {

	private String DNI;
	private String Nombre;
	private int Salario;
	private Departamento Codigo_Departamento;
	
	
	public Departamento getCodigo_Departamento() {
		return Codigo_Departamento;
	}
	public void setCodigo_Departamento(Departamento codigo_Departamento) {
		Codigo_Departamento = codigo_Departamento;
	}
	public String getDNI() {
		return DNI;
	}
	public String getNombre() {
		return Nombre;
	}
	public int getSalario() {
		return Salario;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void setSalario(int salario) {
		Salario = salario;
	}
	@Override
	public String toString() {
		return "Empleado [DNI=" + DNI + ", Nombre=" + Nombre + ", Salario=" + Salario + ", Codigo_Departamento="
				+ Codigo_Departamento + "]";
	}

	
}
