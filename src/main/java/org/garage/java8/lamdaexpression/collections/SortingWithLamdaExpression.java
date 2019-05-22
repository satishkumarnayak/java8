package org.garage.java8.lamdaexpression.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortingWithLamdaExpression {

	public static void main(String[] args) {
		SortingWithLamdaExpression sortingWithLamdaExpression = new SortingWithLamdaExpression();
		// sortingWithLamdaExpression.sortArrayList();
		// sortingWithLamdaExpression.sortTreeSet();
		//sortingWithLamdaExpression.sortTreeMap();
		sortingWithLamdaExpression.sortEmployeeArrayList();
	}
	
	public void sortEmployeeArrayList() {

		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(12, "evyaan"));
		employeeList.add(new Employee(32, "vaishu"));
		employeeList.add(new Employee(5, "varun"));
		employeeList.add(new Employee(15, "dolly"));
		employeeList.add(new Employee(4, "kruthi"));
		System.out.println("sorted" + employeeList);
		Collections.sort(employeeList, (e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);
		// Collections.sort(employeeList, (e1, e2) -> ((e1.eno < e2.eno) ? -1 : (e1.eno
		// > e2.eno) ? 1 : 0));
		// Collections.sort(employeeList, new MyComparator());
		System.out.println("sorted" + employeeList);

	}
	
	class MyComparator implements Comparator<Employee> {

		public int compare(Employee e1, Employee e2) { // 9, 89
			/*
			 * if (i1 > i2) { return -1; } else if (i1 < i2) { return 1; } else return 0;
			 */

			return  ((e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);
		}

	}

	public void sortArrayList() {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(9);
		l.add(110);
		l.add(130);
		l.add(210);
		l.add(510);
		l.add(210);
		System.out.println("Before sorting" + l);

		// Comparator<Integer> c = ( i1, i2) -> (i1 > i2) ? -1 :(i1 < i2) ? 1 : 0;
		Collections.sort(l, (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		System.out.println("Before sorting" + l);

	}

	public void sortTreeSet() {
		TreeSet<Integer> l = new TreeSet<Integer>((i1, i2) -> (i2 < i1) ? -1 : (i2 > i1) ? 1 : 0);
		l.add(10);
		l.add(9);
		l.add(110);
		l.add(130);
		l.add(210);
		l.add(510);
		l.add(210);
		System.out.println(" sorting" + l);
	}

	public void sortTreeMap() {
		TreeMap<Integer, String> l = new TreeMap<Integer, String>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		l.put(10, "ten");
		l.put(9, "nice");
		;
		l.put(110, "nieve");
		;
		l.put(130, "dds");
		l.put(210, "twoten");
		l.put(510, "fiveten");
		l.put(210, "twoten");
		System.out.println(" sorting" + l);
	}

}

class Employee {
	int eno;
	String ename;
	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}
	
	
}

















