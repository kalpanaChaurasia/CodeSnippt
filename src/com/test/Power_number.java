package com.test;

import java.util.Scanner;

public class Power_number {
	public static void main(String[] args) {
		int result = 1, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("the Exoponent is:- ");
		n = sc.nextInt();
		System.out.println("the base is:- ");
		int base = sc.nextInt();

		while (n != 0) {
			result *= base;
			--n;
		}
		System.out.println("Power of Number is:-" + result);
	}
}
