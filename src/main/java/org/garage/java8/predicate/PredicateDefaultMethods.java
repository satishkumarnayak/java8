package org.garage.java8.predicate;

import java.util.function.Predicate;

public class PredicateDefaultMethods {

	public static void main(String[] args) {

		int x[] = { 2, 3, 4, 6, 5, 7, 8, 9, 10 };
		Predicate<Integer> p1 = (y) -> y > 5;
		Predicate<Integer> p2 = (y) -> y % 2 == 0;
		System.out.println("Elements greater than 5");
		methodOne(p1, x);
		System.out.println("Elememts even number");
		methodOne(p2, x);
		System.out.println("Elements NOT greater than 5");
		methodOne(p1.negate(),x);
		System.out.println("Elements  greater than 5 AND even number");
		methodOne(p1.and(p2),x);
		System.out.println("Elements  greater than 5 OR even number");
		methodOne(p1.or(p2),x);
		System.out.println("Negate Elements  greater than 5 OR even number");
		methodOne(p1.or(p2).negate(),x);
		

	}

	public static void methodOne(Predicate<Integer> p, int[] x) {
		for (int i : x) {
			System.out.println(i + "->" + p.test(i));
		}

	}

}
