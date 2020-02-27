package com.pruebas.repositoryimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.pruebas.entities.Cliente;
import com.pruebas.entities.Producto;
import com.pruebas.repository.Repository;

public class ProductoRepository implements Repository<Producto, String,Object> {

	private EntityManager em;

	public ProductoRepository(EntityManager em) {
		super();
		this.em = em;
	}
	
	@Override
	public String upsert(Producto prod) {
		Producto cli=get(prod.getCodigo());
		boolean key=false;
		if (cli==null) {
			key=InsertarProducto(prod);
			if (key==true)
				return "Se ha actualizado correctamente el cliente";
			}
		else {
			key=updateProducto(prod);
			if (key==false)
				return "Se ha actualizadoc correctamente el cliente";		
			}
		return "Ha habido un problema";
	}
	
	@Override
	public Producto get(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String itemParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cliente> getAllClientes() {

		String hql = "FROM Cliente";
		Query query = em.createQuery(hql);
		List<Cliente> clientes =null;
		clientes=query.getResultList();
		return clientes;
	}

	
	public boolean InsertarProducto(Producto prod) {
		boolean result=false;
		try {
			em.getTransaction().begin();
			em.persist(prod);
			
			em.getTransaction().commit();
			result=true;
		}catch(Exception s) {
			s.printStackTrace();
			em.getTransaction().rollback();
		}
		return result;
	}
	
	
	public boolean updateProducto(Producto prod) {
		
		boolean result=false;
		try {
			em.getTransaction().begin();
			em.merge(prod);
			
			em.getTransaction().commit();
			result=true;
		}catch(Exception s) {
			s.printStackTrace();
			em.getTransaction().rollback();
		}
		return result;	
	}
	
	

}
