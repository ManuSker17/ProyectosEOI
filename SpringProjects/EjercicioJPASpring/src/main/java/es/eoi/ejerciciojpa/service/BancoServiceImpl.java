package es.eoi.ejerciciojpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.ejerciciojpa.entities.Banco;
import es.eoi.ejerciciojpa.repository.BancoRepository;

@Service
public class BancoServiceImpl implements BancoService {
	
	@Autowired
	BancoRepository bancrepo;


	public List<Banco> MostrarBancos() {
		return bancrepo.MostrarBancos();
	}

	public boolean InsertarBanco(Banco banc) {
		return bancrepo.InsertarBanco(banc);
	}

	public Banco buscarBanco(String name) {

		return bancrepo.buscarBanco(name);

	}

	public boolean updateBanco(String oldname,String newname,String ciudad) {
		return bancrepo.updateBanco(oldname,newname,ciudad);
	}

	public boolean removeBanco(String name) {
		return bancrepo.removeBanco(name);
	}

}