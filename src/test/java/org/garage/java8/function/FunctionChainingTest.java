package org.garage.java8.function;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FunctionChainingTest {

	FunctionChaining func;

	@Before
	public void setUp() throws Exception {
		func = new FunctionChaining();
	}

	@Test
	public void functionChainUsingAndThenTest() {
		String result = func.functionChainUsingAndThen("EVYAAN");
		assertEquals("evya", result);
	}

	@Test
	public void functionChainUsingComposeTest() {
		String result = func.functionChainUsingCompose("EVYAAN");
		assertEquals("evya", result);
	}

	@Test
	public void functionChainUsingAndThenVsComposeTest() {
		Integer result = func.functionChainUsingAndThenVsCompose(2);

		assertEquals(48, result);
	}
	

	@Test
	public void functionIdentityTest() {
		String result = func.functionIdentity("EVYAAN");
		assertEquals("EVYAAN", result);
	}

}
