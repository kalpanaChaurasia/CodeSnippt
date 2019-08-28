package com.test;

import java.util.Scanner;

public class Pattern1 {
	
//	5
//	
//	5 5 5 5 5
//	4 4 4 4
//	3 3 3
//	2 2
//	1
//
//	5 4 3 2 1
//	5 4 3 2
//	5 4 3
//	5 4
//	5

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(String.valueOf(i));
				if (j < i) {
					System.out.print(" ");
				}
			}
			if (i > 1)
				System.out.println();
		}

		System.out.println();
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(String.valueOf(j));
				if (j > i) {
					System.out.print(" ");
				}
			}
			if (i < n)
				System.out.println();
		}
	}

}
