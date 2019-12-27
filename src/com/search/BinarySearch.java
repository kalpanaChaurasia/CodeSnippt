package com.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int num, array[], counter, item, first, last, middle;

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		// Creating array to store the all the numbers
		array = new int[num];

		System.out.println("Enter " + num + " integers");
		// Loop to store each numbers in array
		for (counter = 0; counter < num; counter++)
			array[counter] = sc.nextInt();

		System.out.println("Enter the search value:");
		item = sc.nextInt();

		//sorting
		Arrays.sort(array);
		
		for (counter = 0; counter < num; counter++)
			System.out.println(array[counter]);
		
		//binary search
		first = 0;
		last = num - 1;
		middle = (first + last) / 2;

		while (first <= last) {
			if (array[middle] < item)
				first = middle + 1;
			else if (array[middle] == item) {
				System.out.println(item + " found at location " + (middle + 1) + ".");
				break;
			} else {
				last = middle - 1;
			}
			
			middle = (first + last) / 2;
			System.out.println(first + " and "+last+ " and "+middle);
		}
		if (first > last)
			System.out.println(item + " is not found.\n");
	}

}
