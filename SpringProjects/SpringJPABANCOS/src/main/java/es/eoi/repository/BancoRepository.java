package es.eoi.repository;

import java.util.List;

import es.eoi.entity.Banco;

public interface BancoRepository{

	List<Banco> MostrarBancos();

	Banco InsertarBanco(Banco banc);

	Banco buscarBanco(String name);

	boolean updateBanco(String oldname, String newname, String ciudad);

	boolean removeBanco(String name);

}