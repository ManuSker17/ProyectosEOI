package es.eoi.repository;

import org.springframework.stereotype.Repository;

	@Repository
	public class HelloWorldRepositoryImpl implements HelloWorldRepository {
		@Override
		public String saluda() {
			return "Hola";
		}
	}

