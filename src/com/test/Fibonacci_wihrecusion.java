package com.test;

public class Fibonacci_wihrecusion {

	/*
	 * Write a java program to print fibonacci series without using recursion and
	 * using recursion.
	 * 
	 * Input: 10
	 * 
	 * Output: 0 1 1 2 3 5 8 13 21 34
	 */

	public static void main(String[] args) {
		int n = 10;
		long starttime = System.nanoTime();
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		long endtime = System.nanoTime() - starttime;
		System.out.println("end - "+endtime);
		
	}

	static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}

}
