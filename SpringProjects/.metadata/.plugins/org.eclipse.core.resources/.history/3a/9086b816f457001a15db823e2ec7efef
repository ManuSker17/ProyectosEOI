package es.eoi.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import es.eoi.entity.Cliente;
import es.eoi.service.ClienteService;


public class ClienteController {
	
	@Autowired
	private ClienteService cliservice;

	public Cliente obtenercliente() {
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
