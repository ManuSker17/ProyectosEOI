package es.eoi.ejerciciojpa.service;

import java.util.List;

import javax.persistence.EntityManager;

import es.eoi.ejerciciojpa.entities.Banco;
import es.eoi.ejerciciojpa.entities.Cliente;
import es.eoi.ejerciciojpa.entities.Cuenta;
import es.eoi.ejerciciojpa.repository.CuentaRepositorio;

public class CuentaService {

	CuentaRepositorio cuentrepo;

	public CuentaService(EntityManager em) {
		cuentrepo = new CuentaRepositorio(em);
	}

	public List<Cuenta> MostrarCuenta() {
		return cuentrepo.MostrarCuentas();
	}

	public boolean InsertarCuenta(Cuenta cuenta) {
		return cuentrepo.InsertarCuenta(cuenta);
	}

	public Cuenta buscarCuenta(int id) {

		return cuentrepo.buscarCuenta(id);

	}

	public boolean updateCuenta(int id, Cliente cliente, Banco banco, int salario) {
		return cuentrepo.updateCuenta(id, cliente, banco, salario);
	}

	public boolean removeCuenta(int id) {
		return cuentrepo.removeCuenta(id);
	}
}
