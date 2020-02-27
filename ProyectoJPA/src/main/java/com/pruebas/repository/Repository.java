package com.pruebas.repository;

import java.util.List;

public interface Repository <O,P,T> {
	
	String upsert(O itemParam);
	O get(String dni);
	List<T> getAll();
	String delete (P itemParam);
	
}
