package com.es.eoi.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.es.eoi.Interface.FullCRUDRepository;
import com.es.eoi.entity.Producto;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class ProductoRepository implements FullCRUDRepository<Producto,String> {
	
	List<Producto> productos = new ArrayList<Producto>();
	
	public ProductoRepository() {}
	
	public ProductoRepository(List<Producto> productos) {
		super();
		this.productos = productos;
	}

	public void cargarProductos() {

	}
	
	@Override
	public void create(Producto a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto read(String code) {
		/*
		String filename = "C:\\EOI\\Productator\\productos.json";
		Gson gson = new Gson();
		Producto prueba=null;
		try {
			Producto[] product = gson.fromJson(new FileReader(filename), Producto[].class);
			for (Producto y : product) 
				System.out.println(y);
		}
		catch(JsonSyntaxException | JsonIOException | FileNotFoundException e) {		
			e.printStackTrace();
			return null;
		}
		
		return prueba;
		*/
		
		return productos.parallelStream().filter(t->t.getCodigo().contentEquals(code)).findAny().get();
	}

	@Override
	public void update(Producto a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String code) {
		// TODO Auto-generated method stub
		productos.removeIf(t->t.getCodigo().equals(code));
	}
	
		
}
