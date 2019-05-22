package org.garage.java8.lamdaexpression.anonymousinnerclass;

public class AnonymousInnerClassWithLambda {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child thread");
			}
		};

		// Thread t = new Thread(r);
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		});
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
