package es.eoi.ejerciciojpa.controller;

import java.util.Scanner;

import es.eoi.ejerciciojpa.entities.Cliente;

public class ClienteController {

	public static Cliente obtenercliente() {
		Scanner sc =new Scanner (System.in);
		Cliente cli = new Cliente();
		System.out.println("Introduzca el dni del cliente");
		cli.setDni(sc.nextLine());
		System.out.println("Introduzca el nombre del cliente");
		cli.setName(sc.nextLine());
		System.out.println("Introduzca la calle del cliente");
		cli.setDireccion(sc.nextLine());
		
		return cli;
	}
}
