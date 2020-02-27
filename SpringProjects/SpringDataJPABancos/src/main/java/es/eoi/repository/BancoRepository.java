package es.eoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.eoi.entity.Banco;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Integer>{
	
	public Banco findByName(String name);
	public Banco deleteByName(String name);
	
}