package es.eoi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import es.eoi.entity.Banco;

@Repository
public class BancoRepositoryImpl implements BancoRepository {

	@PersistenceContext
	private EntityManager em;

	public List<Banco> MostrarBancos() {

		String hql = "FROM Banco";
		Query query = em.createQuery(hql);
		List<Banco> bancos = null;
		bancos = query.getResultList();
		return bancos;
	}
	@Transactional
	public Banco InsertarBanco(Banco banc) {
		boolean result = false;
		try {
			em.persist(banc);

			result = true;
		} catch (Exception s) {
			s.printStackTrace();
		}
		return banc;
	}

	public Banco buscarBanco(String name) {

		String hql = "FROM Banco WHERE NOMBRE LIKE :parameter";
		Query query = em.createQuery(hql);
		query.setParameter("parameter", name);
		return (Banco) query.getSingleResult();

	}
	@Transactional
	public boolean updateBanco(String oldname, String newname, String ciudad) {

		boolean result = false;
		try {
			Banco banc = buscarBanco(oldname);
			banc.setName(newname);
			banc.setCiudad(ciudad);
			em.merge(banc);

			result = true;
		} catch (Exception s) {
			s.printStackTrace();
		}
		return result;
	}
	@Transactional
	public boolean removeBanco(String name) {
		boolean result = false;
		try {
			Banco banc = buscarBanco(name);
			em.remove(banc);

			result = true;
		} catch (Exception s) {
			s.printStackTrace();
		}
		return result;
	}
}
