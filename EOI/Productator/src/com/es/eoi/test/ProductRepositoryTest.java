package com.es.eoi.test;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import com.es.eoi.repository.ProductoRepository;

class ProductRepositoryTest {

	@Test
	void testread() {
		ProductoRepository prodrepo = new ProductoRepository();
		//prodrepo.read("0001");
		assertNotNull(prodrepo.read("0001"));//te dice que esta bien si no recive un null
	}

}
