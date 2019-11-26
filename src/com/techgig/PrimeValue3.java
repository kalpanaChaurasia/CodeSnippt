package com.techgig;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeValue3 {

	// 3
	// 5 2 1
	// 1 2 3 4 5
	// 4 3 0
	// 3 5 2 1
	// 6 7 2
	// 7 13 10 5 21 22

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n, p, v;

		if (t < 0 || t > 100) {
			return;
		}

		ArrayList<Integer> answer = new ArrayList<>();
		for (int j = 0; j < t; j++) {
			int count = 0;
			String val = sc.nextLine();
			String[] numbers = val.split(" ");
			n = Integer.parseInt(numbers[0]);
			p = Integer.parseInt(numbers[1]);
			v = Integer.parseInt(numbers[2]);

			if (v > p || v < 0) {
				return;
			}

			if (p <= 1 || p > 100000000) {
				return;
			}

			if (n < 1 || n > 100000) {
				return;
			}

//			String posters = sc.nextLine();
//			System.out.println("poster "+posters);
//			String[] posterVal = posters.split(" ");
			ArrayList<Integer> posterInt = new ArrayList<>();
//			for (int i = 0; i < posterVal.length; i++) {
//				posterInt.add(Integer.parseInt(posterVal[i]));
//			}
			int[] posters = new int[n];
			for (int i = 0; i < n; i++) {
				posters[i] = sc.nextInt();
				posterInt.add(posters[i]);
			}

			// logic
			do {
				int result = 1;
				int prev = posterInt.get(posterInt.size()-1);
				for (int value : posterInt) {
					result *= value;
					if (result % p == v) {
						count++;
					}
				}
				posterInt.remove(0);
			} while (!posterInt.isEmpty());

			answer.add(count);

		}

		for (int j = 0; j < answer.size(); j++) {
			System.out.println(String.valueOf(answer.get(j)));
		}

	}

}
