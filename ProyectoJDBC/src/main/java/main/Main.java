package main;

import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.pruebas.config.CrudConfig;
import com.pruebas.repositoryimpl.ClienteRepository;

import model.Cliente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gson gson = new Gson();
		CrudConfig config = new CrudConfig();
		ClienteRepository clirepo = new ClienteRepository();
		boolean run=true;
		Cliente cli = gson.fromJson(config.getPropiedad("json"), Cliente.class);

		System.out.println(" 0 Saliendo \n 1 Upsert \n 2 Get \n 3 Get all \n 4 Delete");
		Scanner sc = new Scanner(System.in);
		
		do {
		switch (sc.nextInt()) {
		case 0:
			System.out.println("Saliendo del super programa to guapooo");
			run=false;
			break;
		case 1:
			System.out.println(clirepo.upsert(cli));
			break;
		case 2:
			System.out.println(clirepo.get(cli.getDni()));
			break;
		case 3:
			clirepo.getAll();
			List<Cliente> clientes = clirepo.getAll();
			for (Cliente cliente : clientes) 
				System.out.println(cliente);
			break;
		case 4:
			System.out.println(clirepo.delete(cli.getDni()));
			break;

		default:
			System.out.println("Te has equivocado merluzo. Repite");
			break;
		}
		}while(run==true);

		

	}

}
