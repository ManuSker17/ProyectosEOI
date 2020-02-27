package es.eoi.repository;

import java.util.List;

import es.eoi.entity.*;

public interface CuentaRepository {

	List<Cuenta> MostrarCuentas();

	boolean InsertarCuenta(Cuenta cuent);

	Cuenta buscarCuenta(int id);

	boolean updateCuenta(int id, Cliente cliente, Banco banco, int salario);

	boolean removeCuenta(int id);

}