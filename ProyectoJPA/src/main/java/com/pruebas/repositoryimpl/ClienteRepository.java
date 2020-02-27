package com.pruebas.repositoryimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.pruebas.entities.Cliente;
import com.pruebas.repository.Repository;

public class ClienteRepository implements Repository<Cliente, String,Object>{

	private EntityManager em;

	public ClienteRepository(EntityManager em) {
		super();
		this.em = em;
	}
	
	@Override
	public String upsert(Cliente cliente) {
		Cliente cli=get(cliente.getDni());
		boolean key=false;
		if (cli==null) {
			key=InsertarCliente(cliente);
			if (key==true)
				return "Se ha actualizado correctamente el cliente";
			}
		else {
			key=updateCliente(cliente);
			if (key==false)
				return "Se ha actualizadoc correctamente el cliente";		
			}
		return "Ha habido un problema";
	}

	@Override
	public Cliente get(String dni) {
		return em.find(Cliente.class,dni); 
	}

	@Override
	public List<Object> getAll() {
		
		return null;
	}

	@Override
	public String delete(String dni) {
		String result=null;
		try {
			Cliente cli = get(dni);
			em.getTransaction().begin();
			em.remove(cli);
			
			em.getTransaction().commit();
			result="El cliente se ha eliminado satisfactoriamente";
		}catch(Exception s) {
			s.printStackTrace();
			em.getTransaction().rollback();
		}
		return result;
	}
	
	public List<Cliente> getAllClientes() {

		String hql = "FROM Cliente";
		Query query = em.createQuery(hql);
		List<Cliente> clientes =null;
		clientes=query.getResultList();
		return clientes;
	}

	
	public boolean InsertarCliente(Cliente cli) {
		boolean result=false;
		try {
			em.getTransaction().begin();
			em.persist(cli);
			
			em.getTransaction().commit();
			result=true;
		}catch(Exception s) {
			s.printStackTrace();
			em.getTransaction().rollback();
		}
		return result;
	}
	
	
	public boolean updateCliente(Cliente cli) {
		
		boolean result=false;
		try {
			em.getTransaction().begin();
			em.merge(cli);
			
			em.getTransaction().commit();
			result=true;
		}catch(Exception s) {
			s.printStackTrace();
			em.getTransaction().rollback();
		}
		return result;	
	}
	
	
}
