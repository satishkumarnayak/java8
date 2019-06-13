package org.garage.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterAndMap {

	public static void main(String[] args) {
		StreamFilterAndMap stream = new StreamFilterAndMap();
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(5);
		list.add(10);
		list.add(16);
		list.add(19);

		// stream.printEven(list);
		// stream.printDouble(list);

		List<String> lst = new ArrayList();
		lst.add("evyaan");
		lst.add("evy");
		lst.add("babu");
		lst.add("varun");
		lst.add("vaishu");
		// stream.printLongName(lst);
	//	stream.printUpperCaseName(lst);
		stream.printNumberOfLongName(lst);

	}

	public void printEven(List<Integer> list) {
		System.out.println("All Numbers:" + list);
		List<Integer> result = list.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers:" + result);

	}

	public void printDouble(List<Integer> list) {
		System.out.println("All Numbers    :" + list);
		List<Integer> result = list.stream().map(I -> I * 2).collect(Collectors.toList());
		System.out.println("Doubled Numbers:" + result);
	}

	public void printLongName(List<String> lst) {
		System.out.println("All Names    :" + lst);
		Predicate<String> expr = S -> S.length() > 4;
		List<String> result = lst.stream().filter(expr).collect(Collectors.toList());
		System.out.println("Names Greater than 4 length    :" + result);
	}

	public void printUpperCaseName(List<String> lst) {
		System.out.println("All Names    :" + lst);
		Function<String, String> expr = (S) -> S.toUpperCase();
		List<String> result = lst.stream().map(expr).collect(Collectors.toList());
		System.out.println("Upper case   :" + result);
	}

	public void printNumberOfLongName(List<String> lst) {
		long origCount = lst.stream().count();
		long count = lst.stream().filter(S -> S.length() > 4).count();
		System.out.println("Names original count:" + origCount);
		System.out.println("Number of names greater than 4:" + count);

	}
}
