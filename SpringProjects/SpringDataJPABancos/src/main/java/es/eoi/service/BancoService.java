package es.eoi.service;

import java.util.List;
import java.util.Optional;

import es.eoi.entity.Banco;

public interface BancoService {

	List<Banco> MostrarBancos();

	Banco InsertarBanco(Banco banc);

	Banco buscarBancobyName(String name);

	Optional<Banco> buscarBancobyId(Integer id);

	Banco updateBanco(Banco banc);

	void removeBancobyName(String name);

}