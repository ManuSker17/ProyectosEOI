package com.pruebas.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static EntityManager init_entitymanager() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClientesSucursalesPU");
		return emf.createEntityManager();
	}
}
