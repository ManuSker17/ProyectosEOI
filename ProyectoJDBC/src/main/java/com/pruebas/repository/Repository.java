package com.pruebas.repository;

import java.util.List;

public interface Repository <O,P> {
	
	String upsert(O itemParam);
	O get(String dni);
	List<O> getAll();
	String delete (P itemParam);
	
}
