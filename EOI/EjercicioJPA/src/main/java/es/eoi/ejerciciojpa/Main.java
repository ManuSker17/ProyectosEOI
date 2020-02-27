package es.eoi.ejerciciojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static es.eoi.ejerciciojpa.controller.BancoController.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = init_entitymanager();
		
		
		// CreateClientes(em);
		// CreateBancos(em);
		// CreateCuenta(em);
		//completoCliente(em);
		// completoBanco(em);
		// completoCuenta(em);

	}

	public static EntityManager init_entitymanager() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClientesSucursalesPU");
		return emf.createEntityManager();
	}
/*
	public static void CreateClientes(EntityManager em) {

		ClienteService clienteserv = new ClienteService(em);
		Cliente cl1 = new Cliente("123456A", "Manuel", "calle limon");
		Cliente cl2 = new Cliente("654321C", "Pedro", "calle mayor");
		Cliente cl3 = new Cliente("456789B", "Tomas", "calle lorca");
		Cliente cl4 = new Cliente("987654D", "Ignacio", "calle menor");
		Cliente cl5 = new Cliente("134679R", "Jorge", "calle yamato");
		clienteserv.InsertarCliente(cl1);
		clienteserv.InsertarCliente(cl2);
		clienteserv.InsertarCliente(cl3);
		clienteserv.InsertarCliente(cl4);
		clienteserv.InsertarCliente(cl5);
	}

	public static void CreateBancos(EntityManager em) {

		BancoService bancserv = new BancoService(em);
		Banco bc1 = new Banco("Sabadell", "Orihuela");
		Banco bc2 = new Banco("Caixa", "Alicante");
		Banco bc3 = new Banco("CAM", "Zaragoza");
		Banco bc4 = new Banco("Bankia", "Cordoba");
		Banco bc5 = new Banco("BBVA", "Toledo");
		bancserv.InsertarBanco(bc1);
		bancserv.InsertarBanco(bc2);
		bancserv.InsertarBanco(bc3);
		bancserv.InsertarBanco(bc4);
		bancserv.InsertarBanco(bc5);
	}

	public static void CreateCuenta(EntityManager em) {
		ClienteService clientserv = new ClienteService(em);
		BancoService bancserv = new BancoService(em);
		CuentaService cuentaserv = new CuentaService(em);
		Cuenta ct1 = new Cuenta(15000);
		Cuenta ct2 = new Cuenta(25000);
		Cuenta ct3 = new Cuenta(1000000);
		Cuenta ct4 = new Cuenta(326548);
		Cuenta ct5 = new Cuenta(9158000);

		ct1.setCliente(clientserv.buscarCliente("123456A"));
		ct2.setCliente(clientserv.buscarCliente("654321C"));
		ct3.setCliente(clientserv.buscarCliente("456789B"));
		ct4.setCliente(clientserv.buscarCliente("987654D"));
		ct5.setCliente(clientserv.buscarCliente("134679R"));

		ct1.setBanco(bancserv.buscarBanco(1));
		ct2.setBanco(bancserv.buscarBanco(2));
		ct3.setBanco(bancserv.buscarBanco(3));
		ct4.setBanco(bancserv.buscarBanco(4));
		ct5.setBanco(bancserv.buscarBanco(5));

		cuentaserv.InsertarCuenta(ct1);
		cuentaserv.InsertarCuenta(ct2);
		cuentaserv.InsertarCuenta(ct3);
		cuentaserv.InsertarCuenta(ct4);
		cuentaserv.InsertarCuenta(ct5);
	}

	public static void completoCliente(EntityManager em) {
		ClienteService clientserv = new ClienteService(em);

		Cliente cli = clientserv.buscarCliente("123456A");

		System.out.println(cli.getListCuentas());
		// clientserv.removeCliente("987654D");
		/*
		 * clientserv.updateCliente("456789B", "Roberto", "Gran Via"); List<Cliente>
		 * listcliente=clientserv.MostrarCliente(); for (Cliente cl : listcliente) {
		 * System.out.println(cl); }
		 */
	/*
	}

	public static void completoBanco(EntityManager em) {
		BancoService bancserv = new BancoService(em);

		System.out.println(bancserv.buscarBanco(3) + "\n\n");
		// bancserv.removeBanco(2);
		bancserv.updateBanco(5, "CAJA MURCIA", "MURCIA");
		List<Banco> listbancos = bancserv.MostrarBancos();
		for (Banco b : listbancos) {
			System.out.println(b);
		}
	}

	public static void completoCuenta(EntityManager em) {
		CuentaService cuentserv = new CuentaService(em);
		ClienteService clienteserv = new ClienteService(em);
		BancoService bancserv = new BancoService(em);
		System.out.println(cuentserv.buscarCuenta(3) + "\n\n");
		cuentserv.removeCuenta(2);
		cuentserv.updateCuenta(4, clienteserv.buscarCliente("123456A"), bancserv.buscarBanco(2), 164987);
		List<Cuenta> listcuenta = cuentserv.MostrarCuenta();
		for (Cuenta c : listcuenta) {
			System.out.println(c);
		}

	}*/
}
