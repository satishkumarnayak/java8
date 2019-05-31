package org.garage.java8.function;

import java.util.function.Function;

public class FunctionChaining {

	public String functionChainUsingAndThen(String input) {

		Function<String, String> upperCaseExpr = (in) -> in.toLowerCase();

		Function<String, String> substrExp = (in) -> in.substring(0, in.length() - 2);

		return upperCaseExpr.andThen(substrExp).apply(input);

	}

	public String functionChainUsingCompose(String input) {

		Function<String, String> upperCaseExpr = (in) -> in.toLowerCase();

		Function<String, String> substrExp = (in) -> in.substring(0, in.length() - 2);

		return upperCaseExpr.compose(substrExp).apply(input);

	}

	public Integer functionChainUsingAndThenVsCompose(Integer input) {

		Function<Integer, Integer> doubleExpr = (in) -> in + in;
		Function<Integer, Integer> cubeExpr = (in) -> in * in * in;

		Integer apply = doubleExpr.andThen(cubeExpr).apply(input);

		Integer apply2 = doubleExpr.compose(cubeExpr).apply(input);

		return apply - apply2;

	}
	
	public String functionIdentity(String input) {

		Function<String, String> func = Function.identity();

		return func.apply(input);

	}

}
