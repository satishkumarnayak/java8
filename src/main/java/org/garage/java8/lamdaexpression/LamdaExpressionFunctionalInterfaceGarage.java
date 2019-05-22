package org.garage.java8.lamdaexpression;

public class LamdaExpressionFunctionalInterfaceGarage {
	
	public static void main(String[] args) {
		
		// Without lamdaexpression 1.7 and before
		Interface3 i = new A();
		i.methodOne();
		
		//With lambda
		
		Interface4 i4 = () -> System.out.println("methodOne  implementation with lambda");
		i4.methodOne();
		
	}
	
	

}

@FunctionalInterface
interface Interface1 {
	
	 Object methodOne() throws Exception;
	
}

@FunctionalInterface
interface Interface2 extends Interface1 {
	
	public String methodOne() throws RuntimeException ;
	
}


interface Interface3 {
	public void methodOne();
}

class A implements Interface3 {

	public void methodOne() {
	System.out.println("   methodOne  implementation");
		
	}
	
}

interface Interface4 {
	public void methodOne();
}
