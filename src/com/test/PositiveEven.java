package com.test;

import java.util.Scanner;

public class PositiveEven {

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(sc.nextLine());
			int count = 0;

			for (int j = 2; j <= n; j += 2) {
				if (j % 2 == 0 && j % 4 != 0) {
					count++;
				}			
			}
			System.out.println(String.valueOf(count));
		}
	}

}
