package org.garage.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMinMax {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(51);
		list.add(12);
		list.add(3);
		list.add(19);

		minValue(list);
		maxValue(list);
	}

	public static void minValue(List<Integer> list) {

		System.out.println("List:" + list);
		Integer minValue = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("minValue:" + minValue);

	}

	public static void maxValue(List<Integer> list) {

		System.out.println("List:" + list);
		Integer maxValue = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("maxValue:" + maxValue);

	}
}
