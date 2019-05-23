package org.garage.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {

	public static void main(String[] args) {
		PredicateFunctionalInterface predicate = new PredicateFunctionalInterface();
		predicate.predicateExample();
		predicate.stringLength();
		predicate.arrayListLength();

	}

	public void predicateExample() {
		Predicate<Integer> p = I -> I > 10;

		System.out.println(p.test(100));
		System.out.println(p.test(5));
	}

	public void stringLength() {
		Predicate<String> p = (String s) -> s.length() > 5;
		System.out.println(p.test("evyaan"));
		System.out.println(p.test("evy"));
	}

	public void arrayListLength() {
		Predicate<List> p = (l) -> l.isEmpty();
		List list = new ArrayList();
		list.add("evyaan");

		System.out.println(p.test(list));
		list.remove("evyaan");
		System.out.println(p.test(list));
	}

}
