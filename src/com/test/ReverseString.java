package com.test;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String inStr; // input String
		int inStrLen; // length of the input String

		Scanner in = new Scanner(System.in);
		// Prompt and read input as "String"
		System.out.print("Enter a String: ");
		inStr = in.next(); // use next() to read a String
		inStrLen = inStr.length();

		for (int i = inStrLen - 1; i >= 0; i--) {
			System.out.print(inStr.charAt(i));
		}
	}

}
