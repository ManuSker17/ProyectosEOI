package es.eoi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import es.eoi.entity.Cliente;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {

	@PersistenceContext
	private EntityManager em;

	public List<Cliente> MostrarClientes() {

		String hql = "FROM Cliente";
		Query query = em.createQuery(hql);
		List<Cliente> clientes = null;
		clientes = query.getResultList();
		return clientes;
	}

	public boolean InsertarCliente(Cliente cli) {
		boolean result = false;
		try {
			em.getTransaction().begin();
			em.persist(cli);

			em.getTransaction().commit();
			result = true;
		} catch (Exception s) {
			s.printStackTrace();
			em.getTransaction().rollback();
		}
		return result;
	}

	public Cliente buscarCliente(String dni) {

		return em.find(Cliente.class, dni);

	}

	public boolean updateCliente(String dni, String name, String direccion) {

		boolean result = false;
		try {
			Cliente cli = buscarCliente(dni);
			cli.setName(name);
			cli.setDireccion(direccion);
			em.getTransaction().begin();
			em.merge(cli);

			em.getTransaction().commit();
			result = true;
		} catch (Exception s) {
			s.printStackTrace();
			em.getTransaction().rollback();
		}
		return result;
	}

	public boolean removeCliente(String dni) {
		boolean result = false;
		try {
			Cliente cli = buscarCliente(dni);
			em.getTransaction().begin();
			em.remove(cli);

			em.getTransaction().commit();
			result = true;
		} catch (Exception s) {
			s.printStackTrace();
			em.getTransaction().rollback();
		}
		return result;
	}
}
