package org.garage.java8.supplier;

import java.util.Date;

/*
 *Supplier won't take any input and it will always supply objects. 
 *Supplier Functional Interface contains only one method get(). 
 *Supplier Functional interface does not contain any default and static methods.
 */
public class Supplier {

	public Date getSystemDate() {

		java.util.function.Supplier<Date> sysdateExpr = () -> new Date();

		return sysdateExpr.get();

	}

	public String getRandomName() {

		java.util.function.Supplier<String> randomNameExpr = () -> {
			String[] names = { "varun", "evyaan", "vaishu", "dolly" };
			int random = (int) (Math.random() * 3 );
			return names[random];
		};

		return randomNameExpr.get();
	}
}
