package es.eoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.eoi.entity.Cuenta;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Integer>{
	
	public Cuenta findByDniAndIdbanco(String dni, int id);
	public Cuenta findById(int id);
}