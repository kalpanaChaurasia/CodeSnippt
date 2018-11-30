package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MaxMinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		// Arrays.sort(arr);
		// int multiply = arr[0] * arr[arr.length - 1];
		// System.out.println(String.valueOf(multiply));
		System.out.println(String.valueOf((min * max)));

	}

	// Method 2
	public static void findMinMax() {
		// Initializing array of integers
		Integer[] num = { 2, 4, 7, 5, 9 };

		// using Collections.min() to find minimum element
		// using only 1 line.
		int min = Collections.min(Arrays.asList(num));

		// using Collections.max() to find maximum element
		// using only 1 line.
		int max = Collections.max(Arrays.asList(num));

		// printing minimum and maximum numbers
		System.out.println("Minimum number of array is : " + min);
		System.out.println("Maximum number of array is : " + max);
	}

}
