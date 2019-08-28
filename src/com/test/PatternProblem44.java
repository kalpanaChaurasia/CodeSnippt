package com.test;

import java.util.Scanner;

public class PatternProblem44 {
	// Program to print pyramid using char

	// A
	// B A B
	// C B A B C
	// D C B A B C D
	// E D C B A B C D E

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i, j;

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= n - i; j++) {
				System.out.printf("  ");
			}
			for (j = i; j > 0; j--) {
				System.out.printf(" %c", (char) (j + 64));
			}
			for (j = 2; j <= i; j++) {
				System.out.printf(" %c", (char) (j + 64));
			}

			if (i < n)
				System.out.println();
		}

	}

}
