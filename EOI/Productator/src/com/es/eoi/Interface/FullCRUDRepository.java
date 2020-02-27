package com.es.eoi.Interface;

public interface FullCRUDRepository<A,B> {
	
	void create(A a);
	A read(B code);
	void update(A a);
	void delete(B code);

	

}
