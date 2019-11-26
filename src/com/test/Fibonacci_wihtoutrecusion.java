package com.test;

import java.util.Arrays;

public class Fibonacci_wihtoutrecusion {

/*	Write a java program to print fibonacci series without using recursion and using recursion.

	Input: 10

	Output: 0 1 1 2 3 5 8 13 21 34*/
	
	public static void main(String[] args) {
	
		int n=10;
		long starttime = System.nanoTime();
		
		int arr[] = new int[10];
		
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2; i<n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println(Arrays.toString(arr));
		long endtime = System.nanoTime() - starttime;
		System.out.println("end - "+endtime);

	}

}
