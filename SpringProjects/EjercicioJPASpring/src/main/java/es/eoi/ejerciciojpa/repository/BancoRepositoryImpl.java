package es.eoi.ejerciciojpa.repository;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.eoi.ejerciciojpa.EntityManagerConf;
import es.eoi.ejerciciojpa.entities.Banco;

@Repository
public class BancoRepositoryImpl implements BancoRepository {

	@Autowired
	private EntityManagerConf em;

	public List<Banco> MostrarBancos() {

		String hql = "FROM Banco";
		Query query = em.getEm().createQuery(hql);
		List<Banco> bancos = null;
		bancos = query.getResultList();
		return bancos;
	}

	public boolean InsertarBanco(Banco banc) {
		boolean result = false;
		try {
			em.getEm().getTransaction().begin();
			em.getEm().persist(banc);

			em.getEm().getTransaction().commit();
			result = true;
		} catch (Exception s) {
			s.printStackTrace();
			em.getEm().getTransaction().rollback();
		}
		return result;
	}

	public Banco buscarBanco(String name) {

		String hql = "FROM Banco WHERE NAME LIKE :parameter";
		Query query = em.getEm().createQuery(hql);
		query.setParameter("parameter", name);
		return (Banco) query.getSingleResult();

	}

	public boolean updateBanco(String oldname, String newname, String ciudad) {

		boolean result = false;
		try {
			Banco banc = buscarBanco(oldname);
			banc.setName(newname);
			banc.setCiudad(ciudad);
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

	public boolean removeBanco(String name) {
		boolean result = false;
		try {
			Banco banc = buscarBanco(name);
			em.getEm().getTransaction().begin();
			em.getEm().remove(banc);

			em.getEm().getTransaction().commit();
			result = true;
		} catch (Exception s) {
			s.printStackTrace();
			em.getEm().getTransaction().rollback();
		}
		return result;
	}
}
