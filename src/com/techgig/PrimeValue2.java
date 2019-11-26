package com.techgig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeValue2 {

	// 3
	// 5 2 1
	// 1 2 3 4 5
	// 4 3 0
	// 3 5 2 1
	// 6 7 2
	// 7 13 10 5 21 22

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = sc.nextInt();
		int n, p, v;

		if (t < 0 || t > 100) {
			return;
		}

		ArrayList<Integer> answer = new ArrayList<>();
		for (int j = 0; j < t; j++) {
			int count = 0;
			
			n = sc.nextInt();
			p = sc.nextInt();
			v = sc.nextInt();

			if (v > p || v < 0) {
				return;
			}

			if (p <= 1 || p > 100000000) {
				return;
			}

			if (n < 1 || n > 100000) {
				return;
			}

			ArrayList<Integer> posterInt = new ArrayList<>();
			int[] posters = new int[n];
			for (int i = 0; i < n; i++) {
				posters[i] = sc.nextInt();
				posterInt.add(posters[i]);
			}

			// logic
			do {
				int result = posterInt.get(0);
			//	System.out.println("rs "+result);
				if (result % p == v) {
					count++;
				}
				for (int k = 1; k < posterInt.size(); k++) {
					result *= posterInt.get(k);
					if (result % p == v) {
						count++;
					}
				}
				if (posterInt.size() < 1) {
					if (result % p == v) {
						count++;
					}
				}
				posterInt.remove(0);
			} while (!posterInt.isEmpty());
			//System.out.println("count "+String.valueOf(count));
			answer.add(count);
		}

		for (int j = 0; j < answer.size(); j++) {
			System.out.println(String.valueOf(answer.get(j)));
		}

	}

}
