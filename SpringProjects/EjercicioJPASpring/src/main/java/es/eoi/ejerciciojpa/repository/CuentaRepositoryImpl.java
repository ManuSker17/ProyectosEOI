package es.eoi.ejerciciojpa.repository;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.eoi.ejerciciojpa.EntityManagerConf;
import es.eoi.ejerciciojpa.entities.Banco;
import es.eoi.ejerciciojpa.entities.Cliente;
import es.eoi.ejerciciojpa.entities.Cuenta;

@Repository
public class CuentaRepositoryImpl implements CuentaRepository {

	@Autowired
	private EntityManagerConf em;

	public List<Cuenta> MostrarCuentas() {

		String hql = "FROM Cuenta";
		Query query = em.getEm().createQuery(hql);
		List<Cuenta> cuentas = null;
		cuentas = query.getResultList();
		return cuentas;
	}

	public boolean InsertarCuenta(Cuenta cuent) {
		boolean result = false;
		try {
			em.getEm().getTransaction().begin();
			em.getEm().persist(cuent);

			em.getEm().getTransaction().commit();
			result = true;
		} catch (Exception s) {
			s.printStackTrace();
			em.getEm().getTransaction().rollback();
		}
		return result;
	}

	public Cuenta buscarCuenta(int id) {

		return em.getEm().find(Cuenta.class, id);

	}

	public boolean updateCuenta(int id, Cliente cliente, Banco banco, int salario) {

		boolean result = false;
		try {
			Cuenta banc = buscarCuenta(id);
			banc.setCliente(cliente);
			banc.setBanco(banco);
			banc.setSalario(salario);
			em.getEm().getTransaction().begin();
			em.getEm().merge(banc);

			em.getEm().getTransaction().commit();
			result = true;
		} catch (Exception s) {
			s.printStackTrace();
			em.getEm().getTransaction().rollback();
		}
		return result;
	}

	public boolean removeCuenta(int id) {
		boolean result = false;
		try {
			Cuenta cuent = buscarCuenta(id);
			em.getEm().getTransaction().begin();
			em.getEm().remove(cuent);

			em.getEm().getTransaction().commit();
			result = true;
		} catch (Exception s) {
			s.printStackTrace();
			em.getEm().getTransaction().rollback();
		}
		return result;
	}
}
