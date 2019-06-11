package org.garage.java8.doublecolonoperator;

public class MethodReference2 {

	private void someMethod() {
		for (int i = 0; i < 10; i++) {
			System.out.println("run method in MethodReference2 class");
		}
	}

	public static void main(String[] args) {

		// Using lamda expression
		Runnable rLamdaExpr = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("lamda expression run method called");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread myThread = new Thread(rLamdaExpr);
		myThread.start();

		// Using method reference
		MethodReference2 obj = new MethodReference2();
		Runnable myRunnable = obj::someMethod;
		Thread myAnotherThread = new Thread(myRunnable);
		myAnotherThread.start();

	}

}
