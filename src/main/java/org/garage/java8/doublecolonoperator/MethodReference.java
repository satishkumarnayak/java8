package org.garage.java8.doublecolonoperator;

public class MethodReference {

	public static void methodTwo() {
		System.out.println("static method methodtwo referenced");

	}

	public  void methodThree() {
		System.out.println("non static method methodThree referenced");

	}
	public static void main(String[] args) {

		// Using lamda expression
		MyInterface iLamda = () -> System.out.println("methodOne lamda expression referenced");
		iLamda.methodOne();

		// Using Double Colon Operator for static method
		MyInterface iDoubleColon = MethodReference::methodTwo;
		iDoubleColon.methodOne();
	
		// Using Double Colon Operator for non static method
		MethodReference obj = new MethodReference();
		MyInterface iDoubleColon2 = obj::methodThree;
		iDoubleColon2.methodOne();
		
		
	}

}

interface MyInterface {
	public void methodOne();
}
