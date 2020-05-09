package org.garage.java8.lamdaexpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDem0 {

	public static void main(String[] args) {
		MyFunctionalInterface inter = () -> {
		//	System.out.println("demo");
			return 2;
		};

	//	System.out.println(inter.mymethod());
		
		Function<String, String> fun = String::toUpperCase;
		Function<String, String> fun2 = (s) -> s.toUpperCase();
		String result = fun.apply("evyaan");
		String result2 = fun2.apply("evyaan");
		System.out.println(result);
		System.out.println(result2);
		
		Consumer<String> t = (s) -> System.out.println(s.toUpperCase());
		
		t.accept("evyaan");
		
		Predicate<String> p = (s) -> s.isEmpty();
		
		boolean test = p.test("evyaan");
		System.out.println(test);
		
		Supplier<String>  s1 = () -> "evy";
		
		String string = s1.get();
		System.out.println(string);

	}

}

@FunctionalInterface
interface MyFunctionalInterface {
	public int mymethod();

}
