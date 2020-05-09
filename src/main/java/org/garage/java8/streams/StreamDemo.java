package org.garage.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,6,5,8,9);
		
		List<Integer> evenList = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		
		System.out.println(evenList);
		


	}

}
