package org.garage.java8.function;

import java.util.function.Function;

public class FunctionalChaining {

	int i;
	public static void main(String[] args) {
		
		
		Function<Integer, Integer> multiply = (value) -> value*5;
		Function<Integer, Integer> add = (value) -> value+5;
		
		Function<Integer,Integer> multiplyAdd = multiply.andThen(add);
		
		Integer result = multiplyAdd.apply(3);
		System.out.println(result);

	}

}
