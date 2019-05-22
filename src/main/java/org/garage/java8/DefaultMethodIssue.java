package org.garage.java8;

public class DefaultMethodIssue {

	public static void main(String[] args) {
		A a = new A();
		a.methodOne();

	}

}

interface Left {
	public default void methodOne() {
		System.out.println("Left methodOne");
	}
}

interface Right {
	public default void methodOne() {
		System.out.println("Right methoOne");
	}
}

class A implements Left, Right {

	public void methodOne() {
		System.out.println("A methodOne");
		Left.super.methodOne();
		Right.super.methodOne();
	}

}