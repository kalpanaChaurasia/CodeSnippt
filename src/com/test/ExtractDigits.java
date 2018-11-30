package com.test;

public class ExtractDigits {

	public static void main(String[] args) {
		int num = 15342;

		while (num > 0) {
			int r = num % 10;
			System.out.println(String.valueOf(r));
			num = num / 10;
		}

	}

}
