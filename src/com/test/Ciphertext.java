package com.test;

import java.util.Scanner;

public class Ciphertext {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String inStr = in.next().toUpperCase();

		for (int i = 0; i < inStr.length(); i++) {
			System.out.print(((char) (inStr.charAt(i) + 3)));
		}

	}

}
