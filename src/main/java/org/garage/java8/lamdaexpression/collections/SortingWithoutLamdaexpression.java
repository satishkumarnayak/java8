package org.garage.java8.lamdaexpression.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortingWithoutLamdaexpression {

	public static void main(String[] args) {
		SortingWithoutLamdaexpression sortWithoutLamda = new SortingWithoutLamdaexpression();
		// sortWithoutLamda.sortArrayList();
	//	sortWithoutLamda.sortTreeSet();
		sortWithoutLamda.sortTreeMap();

	}
	
	private void sortTreeMap() {

		TreeMap<Integer, String> l = new TreeMap<Integer, String>(new MyComparator());
		l.put(10, "ten");
		l.put(9, "nice");;
		l.put(110, "nieve");;
		l.put(130, "dds");
		l.put(210, "twoten");
		l.put(510, "fiveten");
		l.put(210, "twoten");
		System.out.println(" sorting" + l);

	}

	private void sortTreeSet() {

		TreeSet<Integer> l = new TreeSet<Integer>(new MyComparator());
		l.add(10);
		l.add(9);
		l.add(110);
		l.add(130);
		l.add(210);
		l.add(510);
		l.add(210);
		System.out.println(" sorting" + l);

	}

	private void sortArrayList() {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(9);
		l.add(110);
		l.add(130);
		l.add(210);
		l.add(510);
		l.add(210);
		System.out.println("Before sorting" + l);
		Collections.sort(l);
		System.out.println("After sorting" + l);
		Collections.sort(l, new MyComparator());
		System.out.println("After sorting" + l);

	}
}

class MyComparator implements Comparator<Integer> {

	public int compare(Integer i1, Integer i2) { // 9, 89
		/*
		 * if (i1 > i2) { return -1; } else if (i1 < i2) { return 1; } else return 0;
		 */

		return (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0;
	}

}
