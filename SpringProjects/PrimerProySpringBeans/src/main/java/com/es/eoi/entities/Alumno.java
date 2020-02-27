package com.es.eoi.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="Alumno")
public class Alumno {
	
	@Autowired
	public Dog dog;

}
