package org.garage.java8;

public class StaticMethod {

	public static void main(String[] args) {
		C c = new C();
		Infer.methodOne();
      // can be called with only Interface name
	}

}

interface Infer {
	public static void methodOne() {
		System.out.println("Infer static methodOne");
	}
}

class C implements Infer {

}