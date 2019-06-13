package org.garage.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(51);
		list.add(12);
		list.add(3);
		list.add(19);
		streamSortDefaultSortingOrder(list);
		streamSortCustomSortingOrder(list);

	}

	public static void streamSortDefaultSortingOrder(List<Integer> list) {

		System.out.println("Unsorted:" + list);
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Default:" + sorted);

	}

	
	public static void streamSortCustomSortingOrder(List<Integer> list) {
		System.out.println("Unsorted:" + list);
		List<Integer> sorted = list.stream().sorted((Integer i1, Integer i2) -> i1 > i2 ? -1 : i1 < i2 ? 1 : 0).collect(Collectors.toList());
		System.out.println("Sorted Custom:" + sorted);
	}
}
