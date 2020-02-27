package es.eoi.ejerciciojpa.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.eoi.ejerciciojpa.entities.Banco;
import es.eoi.ejerciciojpa.service.BancoService;

@Controller
public class BancoControllerImpl {

	@Autowired
	private BancoService bncserv;
	private Scanner sc = new Scanner(System.in);

	public boolean crearBanco() {
		Banco bnc = new Banco();

		System.out.println("Introduzca el nombre del cliente");
		bnc.setName(sc.nextLine());
		System.out.println("Introduzca la ciudad del cliente");
		bnc.setCiudad(sc.nextLine());

		return bncserv.InsertarBanco(bnc);
	}

	public boolean removeBanco() {

		System.out.println("Introduzca el nombre del banco");
		return bncserv.removeBanco(sc.nextLine());

	}

	public List<Banco> mostrarBancos() {

		return bncserv.MostrarBancos();

	}

	public boolean updateBanco() {

		System.out.println("Introduzca el nombre antiguo del banco");
		String oldname = sc.nextLine();
		System.out.println("Introduzca el nuevo nombre del banco");
		String newname = sc.nextLine();
		System.out.println("Introduzca la nueva ciudad del banco");
		String ciudad = sc.nextLine();

		return bncserv.updateBanco(oldname, newname, ciudad);

	}

	public Banco selectBanco() {

		System.out.println("Introduzca el nombre del banco");
		return bncserv.buscarBanco(sc.nextLine());

	}
}
