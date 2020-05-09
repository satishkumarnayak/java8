package org.garage.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamDemo {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList();
		long time1, time2 ;
		for (int i = 0; i < 100; i++) {
			list.add(new Employee("Evy", 5000));
			list.add(new Employee("Varun", 6000));
			list.add(new Employee("Kritz", 4000));
			list.add(new Employee("Madhu", 7000));
			list.add(new Employee("Dolly", 7000));
			list.add(new Employee("Vaishu", 8000));
			list.add(new Employee("Sneha", 3000));
			list.add(new Employee("Swetha", 9000));
			list.add(new Employee("Shalu", 8000));

		}
		
		System.out.println(list.size());
		
		time1 = System.currentTimeMillis();
		
		long count2 = list.stream().filter((e) -> e.getSalary() > 5000).count();
		
		time2 = System.currentTimeMillis();
		
		System.out.println("Sequential stream Output"+count2);
		System.out.println("Sequential stream Time taken:"+(time2-time1));
		
		time1 = System.currentTimeMillis();
		
		long count = list.parallelStream().filter((e) -> e.getSalary() > 5000).count();
		
		time2 = System.currentTimeMillis();
		
		
		System.out.println("Parallel stream Output"+count);
		System.out.println("Parallel stream Time taken:"+(time2-time1));
		

	}

}
