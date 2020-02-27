package main.cadenas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;

import dto.Cliente;

public class Cadenas {
	
	public void getCaracter(String cadena,int pos) {
		System.out.println(cadena.charAt(pos));
	}
	public void Concatenar(String cad1,String cad2) {
		System.out.println(cad1+cad2);
	}
	
	public void BuscaTexto(String cad1,String busca) {
		System.out.println("El texto se encuentra en la cadena: "+cad1.contains(busca));
	}
	public void Comparar(String cad1,String cad2) {
		System.out.println("Las cadenas son iguales: "+cad1.equals(cad2));
	}
	
	public void verFecha(String formato) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formato);
			System.out.println(simpleDateFormat.format(new Date()));

	}
	public void sustituir(String cad1,char a, char b) {
		System.out.println(cad1.replace(a, b));
	}
	
	public boolean esNumero(String numero, String expresionRegular) {
        return numero.matches(expresionRegular);
	}
	public void sumarNumeros(String cad1, String expresionRegular) {
		Pattern p = Pattern.compile(expresionRegular);
        Matcher m = p.matcher(cad1);
        double result=0;
        while(m.find()) {
            result+= Double.parseDouble(m.group());
	}
        System.out.println(result);
	}
	
	public void subCadena(String cad1, int posIn, int posFin) {
		cad1.substring(posIn,posFin);
	}
	
	public void mayusculas(String cad1) {
		cad1.toUpperCase();
	}
	
	public void minusculas(String cad1) {
		cad1.toLowerCase();
	}
	public void comparaciones(String cad1) {
		System.out.println(cad1.equals("loco"));
		System.out.println(cad1.equalsIgnoreCase("Loco"));
		System.out.println(cad1.startsWith("lo"));
		System.out.println(cad1.endsWith("co"));
		System.out.println(cad1.contains("oc"));
	}
	
	public void json(String json) {
		Gson gson = new Gson();
		Cliente cli = gson.fromJson(json, Cliente.class);
		System.out.println(cli);
	}
}
