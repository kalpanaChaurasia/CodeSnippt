package com.test;

import java.util.Scanner;

public class LinearSearch {

//	2 = input
//	4
//	1 2 3 4
//	3
//	2 // output
//
//	5
//	10 90 20 30 40
//	40
//	4

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int arr[] = new int[100];

		while (t > 0) {
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			int x = sc.nextInt();

			System.out.println(Search(n, arr, x));
			t--;
		}
	}

	public static int Search(int n, int[] arr, int x) {

		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;

	}

}
