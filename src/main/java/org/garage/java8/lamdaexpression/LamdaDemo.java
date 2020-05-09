package org.garage.java8.lamdaexpression;

public class LamdaDemo {

	public static void main(String[] args) {

		/*
		 * Runnable runnable = new Runnable(){ public void run() {
		 * System.out.println("Thread Started from Anonymus method"); } };
		 */

	//	Runnable runnable = () ->  System.out.println("Thread Started from lamda expression");
		

		Thread t = new Thread(() ->  System.out.println("Thread Started from lamda expression"));
		t.start();

	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Started");

	}

}
