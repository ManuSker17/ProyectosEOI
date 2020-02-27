package es.eoi.ejerciciojpa.service;

import java.util.List;

import javax.persistence.EntityManager;

import es.eoi.ejerciciojpa.entities.Cliente;
import es.eoi.ejerciciojpa.repository.ClienteRepository;

public class ClienteService {

	ClienteRepository clientrepo;

	public ClienteService(EntityManager em) {
		clientrepo = new ClienteRepository(em);
	}

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