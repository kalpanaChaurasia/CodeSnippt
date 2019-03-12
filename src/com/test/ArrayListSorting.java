package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListSorting {

	public static void main(String[] args) {

		// Scanner scanner = new Scanner(System.in);
		// int number = scanner.nextInt();
		//
		// ArrayList<Integer> array = new ArrayList<>();
		// for (int i = 0; i < number; i++) {
		// int arr = scanner.nextInt();
		// array.add(arr);
		// }

		ArrayList<String> array = new ArrayList<String>();
		array.add("AA");
		array.add("ZZ");
		array.add("CC");
		array.add("FF");

		System.out.println("Original");
		System.out.print(array);

		System.out.println("\nAscending");

		// Method 1 : Using Collections.sort - Ascending
		method1(array);

		System.out.println("\nDescending");

		// Method 2 : Using Collections.sort - Descending
		method2(array);

	}

	private static void method1(ArrayList<String> array) {
		Collections.sort(array);
		System.out.print(array);
	}

	private static void method2(ArrayList<String> array) {
		Collections.sort(array, Collections.reverseOrder());
		System.out.print(array);
	}

}
