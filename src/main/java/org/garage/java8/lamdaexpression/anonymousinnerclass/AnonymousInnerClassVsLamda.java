package org.garage.java8.lamdaexpression.anonymousinnerclass;

public class AnonymousInnerClassVsLamda {

	int a = 999;

	public static void main(String[] args) {
		AnonymousInnerClassVsLamda demo = new AnonymousInnerClassVsLamda();
	//	demo.anonymousInnerClass();
		demo.lamda();

	}

	private  void lamda() {
		int b = 666;
		Infer r = () -> {
			int a = 777;
			System.out.println("lamda--a:"+this.a);
			System.out.println("lamda--b:"+b);
			a = 888;
			this.a= 1000;
			System.out.println("lamda--a:"+a);
			System.out.println("lamda--this.a:"+this.a);
		//	b = 777;  CE , implicit final for lamda expression
		};
		//b = 777; CE , implicit final for lamda expression
		r.m1();
	}

	private  void anonymousInnerClass() {
		Infer r = new Infer() {
			int a = 777;

			@Override
			public void m1() {
				System.out.println("anonymousInnerClass--a:"+this.a);

			}
		};

		
		r.m1();
	}

}

@FunctionalInterface
interface Infer {
	public void m1();
}
