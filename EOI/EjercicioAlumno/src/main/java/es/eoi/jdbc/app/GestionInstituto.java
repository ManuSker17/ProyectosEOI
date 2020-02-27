package es.eoi.jdbc.app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.eoi.jdbc.entity.Alumno;
import es.eoi.jdbc.exception.Exception_AlumnNotFound;
import es.eoi.jdbc.service.AlumnoService;

public class GestionInstituto {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int select = 0;
		AlumnoService service = new AlumnoService();
		List<Alumno> alumnos = new ArrayList<Alumno>();
		Alumno alu=new Alumno();
		String dni="";
		boolean check=false;
		
		
		ViewEnum enum_select;
		
		

		//ViewEnum.values()[Interger.parseInt(sc.nextInt()) - 1];
		do {
			

			
			imprimir_menu();
			enum_select = ViewEnum.values()[sc.nextInt()];
			//select = sc.nextInt();
			if(sc.hasNextLine()) 
				sc.nextLine();
			
			switch (enum_select) {
			case QUIT:
				System.out.println("Hasta nuki");
				select = 0;
				break;
			case FINDALL_VIEW:
				alumnos = service.findAll();
				imprimir_alumnos(alumnos);
				break;
			case FINDDNI_VIEW:
				System.out.println("Introduzca el DNI pelotudo:");
				dni = sc.nextLine();
				try {
					alu=service.findByDni(dni);
					System.out.println(alu);
				}catch(Exception_AlumnNotFound s) {
					System.out.println(s.getMessage());
				}
				break;
			case CREATE_VIEW:
				alu = introducir_datos_alumno();
				check=service.create(alu);
				if (check)
					System.out.println("Se ha creado el alumno correctamente");
				else 
					System.out.println("No se ha creado el alumno correctamente");
				break;
			case UPDATE_VIEW:
				alu = introducir_datos_alumno();
				check=service.update(alu.getDni(), alu.getNombre(), alu.getApellidos());
				if (check)
					System.out.println("Se ha actualizado el alumno correctamente");
				else 
					System.out.println("No se ha actualizado el alumno correctamente");
				break;
			case DELETE_VIEW:
				System.out.println("Introduzca el DNI pelotudo:");
				dni = sc.nextLine();
				check = service.delete(dni);
				if (check)
					System.out.println("Se ha borrado el alumno correctamente");
				else 
					System.out.println("No se ha borrado el alumno correctamente");
				break;

			default:
				System.out.println("Error");
				break;
			}
			System.out.println("");
		} while (select != 0);

	}

	private static Alumno introducir_datos_alumno() {
		Alumno alu = new Alumno();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el DNI pelotudo:");
		alu.setDni(sc.nextLine());
		System.out.println("Introduzca el nombre pelotudo:");
		alu.setNombre(sc.nextLine());
		System.out.println("Introduzca el apellido pelotudo:");
		alu.setApellidos(sc.nextLine());
		System.out.println("Introduzca la edad pelotudo:");
		alu.setEdad(sc.nextInt());
		return alu;

	}

	private static void imprimir_alumnos(List <Alumno> alumnos) {
		for (Alumno alu : alumnos) {
			System.out.println(alu);			
		}
	}
	private static void imprimir_menu() {
		
		System.out.println(
				"GESTION INSTITUTO V1\n-----------------------\n"
				+ "1- Listado Alumnos\n"
				+ "2- Buscar Alumno (DNI)\n"
				+ "3- Crear Almuno\n"
				+ "4- Modificar Alumno\n"
				+ "5- Eliminar Alumno\n"
				+ "0- SALIR\n-----------------------");
	}
}