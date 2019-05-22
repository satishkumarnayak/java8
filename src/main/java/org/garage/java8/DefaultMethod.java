package org.garage.java8;

public class DefaultMethod {

	public static void main(String[] args) {

		ADefaultMethod a = new ADefaultMethod();
		a.methodOne();

		BDefaultMethod b = new BDefaultMethod();
		b.methodOne();
	}

}

interface Interf {

	public default void methodOne() {
		System.out.println("Interface Infer default methodOne");
	}
}

class ADefaultMethod implements Interf {

}

class BDefaultMethod implements Interf {
	public void methodOne() {
		System.out.println("Interface Infer default methodOne overriden in child class");
	}
}
