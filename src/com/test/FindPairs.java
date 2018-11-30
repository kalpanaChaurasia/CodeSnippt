package com.test;

import java.util.Scanner;

public class FindPairs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int array[] = new int[number];

		for (int i = 0; i < number; i++) {
			array[i] = scanner.nextInt();

		}
		int find = scanner.nextInt();

		boolean isFind = false;
		for (int i = 1; i < array.length; i++) {
			if ((array[i - 1] + array[i]) == find) {
				isFind = true;
				break;
			}
		}

		if (isFind) {
			System.out.print("True");
		} else {
			System.out.print("False");
		}

	}

}
