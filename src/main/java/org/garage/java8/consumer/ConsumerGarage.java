package org.garage.java8.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerGarage {

	public void consumer(List<Movie> movies) {

		Consumer<Movie> consumerExpr = (m) -> {
			System.out.println(m.toString());
		};

		for (Movie m : movies) {
			consumerExpr.accept(m);
		}

	}
}
