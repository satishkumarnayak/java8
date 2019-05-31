package org.garage.java8.consumer;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ConsumerGarageTest {

	ConsumerGarage garage;

	@Before
	public void setUp() throws Exception {

		garage = new ConsumerGarage();
	}

	@Test
	public void consumerTest() {
		Movie m1 = new Movie("speed", "jay", "keanu reeves");
		Movie m2 = new Movie("mi", "crow", "tom cruse");
		Movie m3 = new Movie("terminator", "james camerron", "arnold schwarzennger");

		List<Movie> movies = new ArrayList<Movie>();
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);

		garage.consumer(movies);
	}

}
