package org.garage.java8.doublecolonoperator;

public class ConstructorReference {

	public ConstructorReference() {
		System.out.println("ConstructorReference constructor called");
	}
	
	public ConstructorReference(int param) {
		System.out.println("Parameter ConstructorReference constructor called");
	}

	public static void main(String[] args) {

		// Using lamda expression
		MyConstructorReferenceInterface lamdaExpr = () -> {
			System.out.println("MyConstructorReferenceInterface lamda expression called");
			ConstructorReference obj = new ConstructorReference();
			return obj;

		};
		lamdaExpr.get();

		// Using Constructor reference
		MyConstructorReferenceInterface consRef = ConstructorReference::new;
		consRef.get();

	}

}

interface MyConstructorReferenceInterface {

	ConstructorReference get();
	

}
