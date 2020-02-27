package es.eoi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.entity.Cliente;
import es.eoi.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clientrepo;

	public List<Cliente> MostrarCliente() {
		return clientrepo.MostrarClientes();
	}

	public boolean InsertarCliente(Cliente client) {
		return clientrepo.InsertarCliente(client);
	}

	public Cliente buscarCliente(String dni) {

		return clientrepo.buscarCliente(dni);

	}

	public boolean updateCliente(String dni, String name, String direccion) {
		return clientrepo.updateCliente(dni, name, direccion);
	}

	public boolean removeCliente(String dni) {
		return clientrepo.removeCliente(dni);
	}
}