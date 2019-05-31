package org.garage.java8.function;

import java.util.StringTokenizer;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// stringLen();
		// square();
		// removeSpaces();
		countSpaces();

	}

	private static void countSpaces() {
		String messageWithSpaces = "Evyaan is great";
		Function<String, Integer> countSpacesFunc = (String s) -> {
			char[] ch = s.toCharArray();
			int count = 0;
			for (char c : ch) {
				if (c == ' ') {
					count++;
				}
			}
			return count;
		};

		System.out.println(countSpacesFunc.apply(messageWithSpaces));

	}

	private static void removeSpaces() {

		String messageWithSpaces = "Evyaan is great";

		Function<String, String> removeSpaces = s -> s.replaceAll(" ", "");

		Function<String, String> removeSpacesFunc = (String inputString) -> {
			StringTokenizer strt = new StringTokenizer(inputString, " ");
			StringBuilder buff = new StringBuilder();
			while (strt.hasMoreTokens()) {
				String string = strt.nextToken();
				if (!string.equals(" ")) {
					buff.append(string);
				}
			}
			return buff.toString();
		};

		System.out.println("Messages with spaces:" + messageWithSpaces);
		System.out.println("Messages without spaces:" + removeSpacesFunc.apply(messageWithSpaces));
		System.out.println("Messages without spaces:" + removeSpaces.apply(messageWithSpaces));

	}

	public static void stringLen() {
		Function<String, Integer> stringLenFunc = (s) -> s.length();
		System.out.println(stringLenFunc.apply("evyaan"));
		System.out.println(stringLenFunc.apply("varun"));
	}

	public static void square() {
		Function<Integer, Integer> squareFunc = i -> {
			return i * i;
		};

		System.out.println(squareFunc.apply(5));
		System.out.println(squareFunc.apply(new Integer(10)));
	}

	

}
