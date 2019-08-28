package com.test;

import java.util.Arrays;

public class Segregate0n1 {

	/*
	 * You are given an array of 0s and 1s in random order. Segregate 0s on left
	 * side and 1s on right side of the array. Traverse array only once. Input array
	 * = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] Output array = [0, 0, 0, 0, 0, 1, 1, 1, 1,
	 * 1]
	 */

	public static void main(String[] args) {
		int arr[] = new int[] { 0, 1, 0, 1, 1, 1 };
		int n = arr.length;

		int c = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				c++;
			}
		}
		int newarr[] = new int[n];
		for (int i = 0; i < c; i++) {
			newarr[i] = 0;
		}	
		
		for (int i = c; i < n; i++) {
			newarr[i] = 1;
		}	
		
		System.out.println(Arrays.toString(newarr));
	}

}
