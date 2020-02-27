package es.eoi.ejerciciojpa.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import es.eoi.ejerciciojpa.entities.Banco;
import es.eoi.ejerciciojpa.service.BancoService;

public class BancoController {

	public static boolean crearBanco(EntityManager em) {
		Scanner sc = new Scanner(System.in);
		Banco bnc = new Banco();

		System.out.println("Introduzca el nombre del cliente");
		bnc.setName(sc.nextLine());
		System.out.println("Introduzca la ciudad del cliente");
		bnc.setCiudad(sc.nextLine());

		BancoService bancserv = new BancoService(em);
		return bancserv.InsertarBanco(bnc);
	}

	public static boolean removeBanco(EntityManager em) {
		Scanner sc = new Scanner(System.in);
		BancoService bncservice = new BancoService(em);

		System.out.println("Introduzca el nombre del banco");
		return bncservice.removeBanco(sc.nextLine());

	}
	public static List<Banco> mostrarBancos(EntityManager em) {
		BancoService bncservice = new BancoService(em);
		Scanner sc = new Scanner(System.in);
		
		return bncservice.MostrarBancos();

	}

	public static boolean updateBanco(EntityManager em) {
		Scanner sc = new Scanner(System.in);
		BancoService bncservice = new BancoService(em);
		Banco bnc = new Banco();

		System.out.println("Introduzca el nombre antiguo del banco");
		String oldname = sc.nextLine();
		System.out.println("Introduzca el nuevo nombre del banco");
		String newname = sc.nextLine();
		System.out.println("Introduzca la nueva ciudad del banco");
		String ciudad = sc.nextLine();

		return bncservice.updateBanco(oldname, newname, ciudad);

	}

	public static Banco selectBanco(EntityManager em) {
		Scanner sc = new Scanner(System.in);
		BancoService bncservice = new BancoService(em);

		System.out.println("Introduzca el nombre del banco");
		return bncservice.buscarBanco(sc.nextLine());

	}
}
