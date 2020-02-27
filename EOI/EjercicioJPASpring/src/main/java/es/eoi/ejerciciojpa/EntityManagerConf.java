package es.eoi.ejerciciojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class EntityManagerConf {
	
	private EntityManager em;
	public EntityManagerConf () {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClientesSucursalesPU");
		em = emf.createEntityManager();
	}
}
