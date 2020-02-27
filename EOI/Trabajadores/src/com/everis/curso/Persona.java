package com.everis.curso;

public class Persona {

		protected String Name;
		protected String Apellidos;
		protected int Edad;
		protected String direccion;
		
		public Persona(String name, String apellidos, int edad, String direccion) {
			Name = name;
			Apellidos = apellidos;
			Edad = edad;
			this.direccion = direccion;
		}

		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getApellidos() {
			return Apellidos;
		}
		public void setApellidos(String apellidos) {
			Apellidos = apellidos;
		}
		public int getEdad() {
			return Edad;
		}
		public void setEdad(int edad) {
			Edad = edad;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		@Override
		public String toString() {
			return "Name=" + Name + ", Apellidos=" + Apellidos + ", Edad=" + Edad + ", direccion=" + direccion
					+ "]";
		}
}
