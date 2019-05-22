package org.garage.java8.lamdaexpression;

public class LamdaExpressionRunnableFunctionalInterfaceGarage5 {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 10; i++)
				System.out.println("Child Thread in lamda expression");
		};

		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}

	}

}



