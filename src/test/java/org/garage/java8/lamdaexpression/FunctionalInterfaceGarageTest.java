package org.garage.java8.lamdaexpression;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * The Main Objective of Lambda Expression is to bring benefits of functional
 * programming into Java.
 * 
 * What is Lambda Expression (λ):  Lambda Expression is just an anonymous
 * (nameless) function. That means the function which doesn’t have the name,
 * return type and access modifiers.
 * 
 * 1) A lambda expression can have zero or more number of parameters
 * (arguments).
 * 
 * 2) Usually we can specify type of parameter. If the compiler expects the type
 * based on the context then we can remove type. i.e., programmer is not
 * required.
 * 
 * 3) If multiple parameters present then these parameters should be separated
 * with comma (,).
 * 
 * 4) If zero number of parameters available then we have to use empty parameter
 * [ like ()].
 * 
 * 5) If only one parameter is available and if the compiler can expect the type
 * then we can remove the type and parenthesis also.
 * 
 * 6) Similar to method body lambda expression body also can contain multiple
 * statements. If more than one statements present then we have to enclose
 * inside within curly braces. If one statement present then curly braces are
 * optional.
 * 
 *7) Once we write lambda expression we can call that expression just like a method, for this functional interfaces are required.
(String str)  return str;
(str)  str;
 */


/**
 * 
 * If an interface contain only one abstract method, such type of interfaces are called functional interfaces and the method is called functional method or single abstract method (SAM).
 * 
 * 
 * Inside functional interface in addition to single Abstract method (SAM) we write any number of default and static methods.
 * 
 * 
 * In Java 8, Sun Micro System introduced @Functional Interface annotation to specify that the interface is Functional Interface.
 * 
 * Once we write Lambda expressions to invoke it’s functionality, then Functional Interface is required. We can use Functional Interface reference to refer Lambda Expression.
Where ever Functional Interface concept is applicable there we can use Lambda Expressions
 * @author Satish_Nayak
 *
 */
public class FunctionalInterfaceGarageTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		// fail("Not yet implemented");
	}

}
