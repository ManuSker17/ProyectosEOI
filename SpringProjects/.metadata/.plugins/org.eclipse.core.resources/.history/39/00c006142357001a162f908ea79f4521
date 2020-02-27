package es.eoi.ejerciciojpa.repository;

import java.util.List;

import es.eoi.ejerciciojpa.entities.Banco;
import es.eoi.ejerciciojpa.entities.Cliente;
import es.eoi.ejerciciojpa.entities.Cuenta;

public interface CuentaRepository {

	List<Cuenta> MostrarCuentas();

	boolean InsertarCuenta(Cuenta cuent);

	Cuenta buscarCuenta(int id);

	boolean updateCuenta(int id, Cliente cliente, Banco banco, int salario);

	boolean removeCuenta(int id);

}