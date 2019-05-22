package org.garage.java8.lamdaexpression;

public class LamdaExpressionFunctionalInterfaceGarage2 {

	public static void main(String[] args) {
       Interface5 i = ( int a, int b) -> System.out.println("Addition is:"+(a+b));
       i.add(10, 20);
       i.add(100, 200);

	}

}

@FunctionalInterface
interface Interface5 {
	
	public void add(int a, int b);
}
