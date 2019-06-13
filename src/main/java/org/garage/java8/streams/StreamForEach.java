package org.garage.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamForEach {

	public static void main(String[] args) {

		List<String> lst = new ArrayList();
		lst.add("evyaan");
		lst.add("evy");
		lst.add("babu");
		lst.add("varun");
		lst.add("vaishu");

		printElementsUsingLamda(lst);
		printElementsUsingMethodRef(lst);

	}

	public static void printElementsUsingLamda(List<String> list) {

		list.stream().forEach(s -> System.out.println(s));

	}

	public static void printElementsUsingMethodRef(List<String> list) {

		list.stream().forEach(System.out::println);

	}

}
