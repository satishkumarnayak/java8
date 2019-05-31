package org.garage.java8.predicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateUsages {

	public static void main(String[] args) {

		PredicateUsages demo = new PredicateUsages();
		// demo.startsWithE();
		// demo.removeNullOrBlank();
		demo.isEqual();
	}

	public void isEqual() {
		Predicate s = Predicate.isEqual("EVYAAN");

		System.out.println(s.test("VARUN"));
		System.out.println(s.test("EVYAAN"));
	}

	public void removeNullOrBlank() {
		String[] names = { "evyaan", " ", "evy", null, "babu", "evyaanbabu" };

		Predicate<String> isNull = s -> (s == null || s.trim().equals("")) ? true : false;

		String[] newNames = new String[4];
		int i = 0;
		for (String s : names) {

			if (isNull.negate().test(s)) {
				newNames[i] = s;
				i++;
			}
		}
		System.out.println("" + Arrays.toString(names));
		System.out.println("" + Arrays.toString(newNames));
	}

	public void startsWithE() {
		String[] names = { "evyaan", "evy", "babu", "evyaanbabu" };
		Predicate<String> p1 = (s) -> s.startsWith("e");

		for (String s : names) {
			if (p1.test(s)) {
				System.out.println(s);
			}
		}
	}

}
