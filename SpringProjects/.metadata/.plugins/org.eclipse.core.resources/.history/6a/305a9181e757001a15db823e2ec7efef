package es.eoi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.entity.Banco;
import es.eoi.entity.Cliente;
import es.eoi.entity.Cuenta;
import es.eoi.repository.CuentaRepository;

@Service
public class CuentaServiceImpl implements CuentaService {
	
	@Autowired
	CuentaRepository cuentrepo;

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
