package org.garage.java8.consumer;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerChaining {

	// Predicate, Function, Consumer
	// Display movies staring arnold,and replacing director with james cameroon
	public void consumer(List<Movie> movies) {

		Predicate<Movie> pexpr = (m) -> m.actor.equals("arnold");

		Function<Movie, Movie> fexpr = (m1) -> {
			m1.setDirector("james cameroon");
			return m1;
		};

		Consumer<Movie> cexpr = (m) -> System.out.println(m);

		Consumer<Movie> cexpr2 = (m) -> m.setName("Terminator Dark fate");

		for (Movie m : movies) {
			cexpr.accept(m);
			if (pexpr.test(m)) {
				fexpr.apply(m);
				cexpr.accept(m);
				cexpr2.accept(m);
				cexpr.accept(m);
			}
		}
	}

	public void consumerChainingAndThen(List<Movie> movies) {

		Consumer<Movie> cexpr = (m) -> System.out.println(m);

		Consumer<Movie> cexpr2 = (m) -> m.setName("Terminator Dark fate");

		for (Movie m : movies) {
			cexpr2.andThen(cexpr).accept(m);

		}
	}

}
