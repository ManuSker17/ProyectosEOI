package es.eoi.jdbc.service;
import java.util.List;

import es.eoi.jdbc.entity.Alumno;
import es.eoi.jdbc.repository.AlumnoRepository;
import es.eoi.jdbc.exception.*;

public class AlumnoService {
	
	AlumnoRepository repository = new AlumnoRepository();	
	
	public Alumno findByDni(String dni) throws Exception_AlumnNotFound {
		
		return repository.findByDni(dni);
		
	}
	public List<Alumno> findAll(){
		
		return repository.findAll();
		
	}
	
	public boolean create(Alumno alu){
		
		return repository.create(alu);
		
	}
	public boolean delete(String dni){
		
		return repository.delete(dni);
		
	}
	public boolean update(String dni, String nombre, String apellidos){
		
		return repository.update(dni, nombre, apellidos);
	}

}