package es.eoi.ejerciciojpa.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.eoi.ejerciciojpa.entities.Cliente;
import es.eoi.ejerciciojpa.service.ClienteService;


public class ClienteControllerImpl {
	
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
