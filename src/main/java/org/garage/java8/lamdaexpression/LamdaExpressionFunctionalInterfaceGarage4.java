package org.garage.java8.lamdaexpression;

public class LamdaExpressionFunctionalInterfaceGarage4 {

	public static void main(String[] args) {
		Interface7 i = x -> x * x;
		System.out.println(i.squareit(4));
		System.out.println(i.squareit(8));

	}

}

@FunctionalInterface
interface Interface7 {

	public int squareit(int x);

}
