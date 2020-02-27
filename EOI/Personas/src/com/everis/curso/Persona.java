package com.everis.curso;

import java.util.*;

public class Persona implements Comparable<Persona>{

		@Override
	public String toString() {
		return "Persona [Name=" + Name + ", Edad=" + Edad + ", anyoNacim=" + anyoNacim + "]";
	}

		String Name;
		String Apellidos;
		int Edad;
		int diaNacim;
		int mesNacim;
		int anyoNacim;
		String Ciudad;
		char Genero;
		boolean Estudiar;
		boolean Trabajar;
		
		public Persona() {
			
		}
		@Override
		public int compareTo(Persona persona) {
			int comparadorNombre = this.Name.compareTo(persona.Name);
			
			if (comparadorNombre==0) {
				if (this.Edad==persona.Edad){
					if (this.anyoNacim>persona.anyoNacim)
						return 1;
					else
						return -1;
				}
				else if (this.Edad>persona.Edad)
					return -1;
				else
					return 1;
				
			}
			return comparadorNombre;
			

		}

		public Persona(String name, int edad, int anyoNacim) {
			super();
			Name = name;
			Edad = edad;
			this.anyoNacim = anyoNacim;
		}


		public Persona(String name, String apellidos, int edad, int diaNacim, int mesNacim, int anyoNacim,
				String ciudad, char genero, boolean estudiar, boolean trabajar) {
			Name = name;
			Apellidos = apellidos;
			Edad = edad;
			this.diaNacim = diaNacim;
			this.mesNacim = mesNacim;
			this.anyoNacim = anyoNacim;
			Ciudad = ciudad;
			Genero = genero;
			Estudiar = estudiar;
			Trabajar = trabajar;
		}


		public int getAnyoNacim() {
			return anyoNacim;
		}


		public void setAnyoNacim(int anyoNacim) {
			this.anyoNacim = anyoNacim;
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

		public int getDiaNacim() {
			return diaNacim;
		}

		public void setDiaNacim(int diaNacim) {
			this.diaNacim = diaNacim;
		}

		public int getMesNacim() {
			return mesNacim;
		}

		public void setMesNacim(int mesNacim) {
			this.mesNacim = mesNacim;
		}

		public String getCiudad() {
			return Ciudad;
		}

		public void setCiudad(String ciudad) {
			Ciudad = ciudad;
		}

		public char getGenero() {
			return Genero;
		}

		public void setGenero(char genero) {
			Genero = genero;
		}

		public boolean isEstudiar() {
			return Estudiar;
		}

		public void setEstudiar(boolean estudiar) {
			Estudiar = estudiar;
		}

		public boolean isTrabajar() {
			return Trabajar;
		}

		public void setTrabajar(boolean trabajar) {
			Trabajar = trabajar;
		}
		
}
