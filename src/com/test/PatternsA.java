package com.test;

import java.io.IOException;
import java.util.Scanner;

public class PatternsA {

	// F F F F F F
	// E E E E E
	// D D D D
	// C C C
	// B B
	// A

	public static void main(String[] args) throws IOException {

		String[] strings = { "A", "B", "C", "D", "E" };

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < strings.length; j++) {
//				if (j == 4) {
//					System.out.print(strings[j]);
//				} else {
//					System.out.print(strings[j] + " ");
//				}
//			}
//			System.out.println();
//		}

		int temp = 65;
		int i, j, k;
//		for (i = n - 1; i >= 0; i--) {
//			for (j = 0; j <= i; j++) {
//				System.out.print((char) (temp + i));
//				if (j < i) {
//					System.out.print(" ");
//				}
//			}
//			if (i > 1)
//				System.out.println();
//		}

		for (i = 1; i <= n + 4; i += 2) {

			for (k = i; k <= n + 4; k++) {
				System.out.print(" ");
			}

			for (j = 0; j < i; j++) {
				System.out.print((char) (temp + j));
				if (j < i) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
