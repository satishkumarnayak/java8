package org.garage.java8.lamdaexpression;

public class LamdaExpressionFunctionalInterfaceGarage3 {

	public static void main(String[] args) {
	
		Interface6 i = s -> s.length();
//		Interface6 i = (s) -> s.length();  braces for method is optional if only one param
		// Interface6 i = ( s) -> return s.length();  // return is optional
		// Interface6 i = (String s) -> s.length();  // Type is optional
		int length = i.getLength("evyaan");
		length = i.getLength("babu");

		System.out.println("length:" + length);

	}

}

@FunctionalInterface
interface Interface6 {

	public int getLength(String s);
	
}