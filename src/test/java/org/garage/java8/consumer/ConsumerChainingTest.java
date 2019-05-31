package org.garage.java8.consumer;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ConsumerChainingTest {

	ConsumerChaining garage;

	@Before
	public void setUp() throws Exception {

		garage = new ConsumerChaining();
	}

	@Test
	public void testComsumerWithPredicateAndFunction() {
		Movie m1 = new Movie("speed", "jay", "keanu reeves");
		Movie m2 = new Movie("mi", "crow", "tom cruse");
		Movie m3 = new Movie("terminator", "james camerron", "arnold");
		Movie m4 = new Movie("true lies", "chris", "arnold");
		Movie m5 = new Movie("last man stand", "martin", "arnold");

		List<Movie> movies = new ArrayList<Movie>();
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		movies.add(m4);
		movies.add(m5);

		garage.consumer(movies);
	}

	@Test
	public void testComsumerChainingTest() {
		Movie m1 = new Movie("speed", "jay", "keanu reeves");
		Movie m2 = new Movie("mi", "crow", "tom cruse");
		Movie m3 = new Movie("terminator", "james camerron", "arnold");
		Movie m4 = new Movie("true lies", "chris", "arnold");
		Movie m5 = new Movie("last man stand", "martin", "arnold");

		List<Movie> movies = new ArrayList<Movie>();
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		movies.add(m4);
		movies.add(m5);

		garage.consumerChainingAndThen(movies);
	}

}
