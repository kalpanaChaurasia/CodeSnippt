package com.test;

import java.util.*;

public class LargestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ld = 0;

		while (n > 0) {
			if (n % 10 > ld) {
				ld = n % 10;
			}
			n = n / 10;
		}

		System.out.println(String.valueOf(ld));

	}

}
