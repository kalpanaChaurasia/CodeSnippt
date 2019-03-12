package com.test;

import java.util.Scanner;
import java.util.Stack;

public class BinaryGap {

	/*
	 * OUTPUT
	 * 
	 * Binary representation of 124: 1111100
	 * 
	 * Binary representation of 45: 101101
	 * 
	 * Binary representation of 999: 1111100111
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		// Method 1: Using toBinaryString() method
		method1(number);

		// Method 2: Without using predefined method
		method2(number);

		// Method 3: Decimal to Binary using Stack
		method3(number);
	}

	public static void method1(int num) {
		System.out.println(Integer.toBinaryString(num));
		System.out.println("\nBinary representation of 124: ");
		System.out.println(Integer.toBinaryString(124));
		System.out.println("\nBinary representation of 45: ");
		System.out.println(Integer.toBinaryString(45));
		System.out.println("\nBinary representation of 999: ");
		System.out.println(Integer.toBinaryString(999));
	}

	public static void method2(int num) {
		// 123

		int binary[] = new int[40];
		int index = 0;
		while (num > 0) {
			binary[index++] = num % 2;
			num /= 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	public static void method3(int num) {
		Stack<Integer> stack = new Stack<Integer>();
		while (num != 0) {
			int d = num % 2;
			stack.push(d);
			num /= 2;
		}

		System.out.print("\nBinary representation is:");
		while (!(stack.isEmpty())) {
			System.out.print(stack.pop());
		}
		System.out.println();
	}
}
