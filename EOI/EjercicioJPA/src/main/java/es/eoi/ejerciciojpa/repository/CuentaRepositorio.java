package es.eoi.ejerciciojpa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import es.eoi.ejerciciojpa.entities.Banco;
import es.eoi.ejerciciojpa.entities.Cliente;
import es.eoi.ejerciciojpa.entities.Cuenta;

public class CuentaRepositorio {

	
	private EntityManager em;

	public CuentaRepositorio(EntityManager em) {
		super();
		this.em = em;
	}
	
	public List<Cuenta> MostrarCuentas() {

		String hql = "FROM Cuenta";
		Query query = em.createQuery(hql);
		List<Cuenta> cuentas =null;
		cuentas=query.getResultList();
		return cuentas;
	}
	
	public boolean InsertarCuenta(Cuenta cuent) {
		boolean result=false;
		try {
			em.getTransaction().begin();
			em.persist(cuent);
			
			em.getTransaction().commit();
			result=true;
		}catch(Exception s) {
			s.printStackTrace();
			em.getTransaction().rollback();
		}
		return result;
	}
	
	public Cuenta buscarCuenta(int id) {
		
		return em.find(Cuenta.class,id);
		
	}
	
	public boolean updateCuenta(int id,Cliente cliente,Banco banco,int salario) {
		
		boolean result=false;
		try {
			Cuenta banc = buscarCuenta(id);
			banc.setCliente(cliente);
			banc.setBanco(banco);
			banc.setSalario(salario);
			em.getTransaction().begin();
			em.merge(banc);
			
			em.getTransaction().commit();
			result=true;
		}catch(Exception s) {
			s.printStackTrace();
			em.getTransaction().rollback();
		}
		return result;	
	}
	
	public boolean removeCuenta(int id) {
		boolean result=false;
		try {
			Cuenta cuent = buscarCuenta(id);
			em.getTransaction().begin();
			em.remove(cuent);
			
			em.getTransaction().commit();
			result=true;
		}catch(Exception s) {
			s.printStackTrace();
			em.getTransaction().rollback();
		}
		return result;
	}
}
