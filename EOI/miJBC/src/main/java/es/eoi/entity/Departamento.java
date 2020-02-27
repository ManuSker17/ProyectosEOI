package es.eoi.entity;

public class Departamento {
	private int codigo;
	private String Nombre;
	private String Localizador;
	
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getLocalizador() {
		return Localizador;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void setLocalizador(String localizador) {
		Localizador = localizador;
	}
	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", Nombre=" + Nombre + ", Localizador=" + Localizador + "]";
	}
	
	
}
