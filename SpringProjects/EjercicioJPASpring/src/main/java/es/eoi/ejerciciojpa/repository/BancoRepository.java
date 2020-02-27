package es.eoi.ejerciciojpa.repository;

import java.util.List;

import es.eoi.ejerciciojpa.entities.Banco;

public interface BancoRepository {

	List<Banco> MostrarBancos();

	boolean InsertarBanco(Banco banc);

	Banco buscarBanco(String name);

	boolean updateBanco(String oldname, String newname, String ciudad);

	boolean removeBanco(String name);

}