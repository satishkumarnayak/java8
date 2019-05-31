package org.garage.java8.supplier;

import org.junit.Before;
import org.junit.Test;

public class SupplierTest {

	Supplier demo;

	@Before
	public void setUp() throws Exception {

		demo = new Supplier();
	}

	@Test
	public void getSystemDateTest() {
		System.out.println(demo.getSystemDate());
	}

	@Test
	public void getRandomNameTest() {
		String result = demo.getRandomName();
		System.out.println(result);
	}

}
