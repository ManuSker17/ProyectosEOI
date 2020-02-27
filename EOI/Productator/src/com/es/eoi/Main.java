package com.es.eoi;

import java.util.ArrayList;
import java.util.List;

import com.es.eoi.entity.Producto;

public class Main {
	
	static List<Producto> productos=new ArrayList<Producto>();

	public static void main(String[] args) {
		init();
		// TODO Auto-generated method stub
		
		//llamar al listado de productos e imprimir el que tenga el codigo 0002
		
		// dar de alta a un nuevo producto
		
		// updatear un producto
		
		//borrar un producto

	}
	
	private static void init() {
		for (int i = 0; i < 9; i++) {
			Producto product= new Producto();
			product.setCodigo("000"+i);
			product.setNombre("Producto"+i);
			product.setPrecio(Double.valueOf(10*i));
			productos.add(product);
			System.out.println(product);
		}
		
	}
}
