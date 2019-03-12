package com.test;

import java.util.Scanner;

public class CountVowelsDigits {

	/*
	 * Write a program called CountVowelsDigits, which prompts the user for a
	 * String, counts the number of vowels (a, e, i, o, u, A, E, I, O, U) and digits
	 * (0-9) contained in the string, and prints the counts and the percentages
	 * (rounded to 2 decimal places). For example,
	 * 
	 * Enter a String: testing12345 Number of vowels: 2 (16.67%) Number of digits: 5
	 * (41.67%)
	 */

	public static void main(String[] args) {
		String inStr; // input String
		int inStrLen; // length of the input String

		Scanner in = new Scanner(System.in);
		// Prompt and read input as "String"
		System.out.print("Enter a String: ");
		inStr = in.next().toLowerCase(); // use next() to read a String
		inStrLen = inStr.length();

		int count = 0;
		int sum = 0;
		for (int i = 0; i < inStrLen; i++) {
			if (inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9') {
				sum += Integer.valueOf(inStr.charAt(i));
				count++;
			}
			// OR//
			if (Character.isDigit(inStr.charAt(i))) {
				System.out.println("Yes " + inStr.charAt(i));
			}
		}

		System.out.println("avg %d =>" + (sum / count) + "%");
	}

}
