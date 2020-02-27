package es.eoi.service;

import java.util.List;
import java.util.Optional;

import es.eoi.entity.Cliente;

public interface ClienteService {

	List<Cliente> MostrarCliente();

	Cliente InsertarCliente(Cliente client);

	Optional<Cliente> buscarCliente(String dni);

	Cliente updateCliente(Cliente cliente);

	void removeCliente(String dni);

}