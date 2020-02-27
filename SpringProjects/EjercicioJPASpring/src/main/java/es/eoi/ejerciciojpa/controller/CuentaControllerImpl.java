package es.eoi.ejerciciojpa.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.eoi.ejerciciojpa.entities.Cuenta;
import es.eoi.ejerciciojpa.service.BancoService;
import es.eoi.ejerciciojpa.service.ClienteService;
import es.eoi.ejerciciojpa.service.CuentaService;


public class CuentaControllerImpl {

	@Autowired
	CuentaService cuentaservice;
	@Autowired
	BancoService bancoservice;
	@Autowired
	ClienteService clienteservice;
	
	public Cuenta obtenerCuenta(EntityManager em) {
		Scanner sc =new Scanner (System.in);
		Cuenta cuent =new Cuenta();
		
		System.out.println("Introduzca el dni del cliente");
		cuent.setCliente(clienteservice.buscarCliente(sc.nextLine()));
		System.out.println("Introduzca el id del banco");
		cuent.setBanco(bancoservice.buscarBanco(sc.nextLine()));
		System.out.println("Introduzca el salario de la cuenta");
		cuent.setSalario(sc.nextInt());
				
		return cuent;
	}
}
