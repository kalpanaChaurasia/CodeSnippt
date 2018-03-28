package com.test;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		int base = scanner.nextInt();
		int exponent = scanner.nextInt();

		int result = (int) Math.pow(exponent, base);

		System.out.println(String.valueOf(result));
	}

}
