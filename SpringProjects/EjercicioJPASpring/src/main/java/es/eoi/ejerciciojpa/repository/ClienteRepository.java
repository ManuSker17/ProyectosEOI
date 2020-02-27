package es.eoi.ejerciciojpa.repository;

import java.util.List;

import es.eoi.ejerciciojpa.entities.Cliente;

public interface ClienteRepository {

	List<Cliente> MostrarClientes();

	boolean InsertarCliente(Cliente cli);

	Cliente buscarCliente(String dni);

	boolean updateCliente(String dni, String name, String direccion);

	boolean removeCliente(String dni);

}