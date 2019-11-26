package com.techgig;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeValue {

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
			n = sc.nextInt();
			p = sc.nextInt();
			v = sc.nextInt();

			ArrayList<Integer> posterInt = new ArrayList<>();
			int[] posters = new int[n];
			for (int i = 0; i < n; i++) {
				posters[i] = sc.nextInt();
				posterInt.add(posters[i]);
				// System.out.println("" + posters[i]);
			}

			// logic
			do {
				int result = 1;
				// System.out.println("zero "+posterInt.get(0));
				for (int value : posterInt) {
					result *= value;
					if (result % p == v) {
						count++;
					}
				}
				posterInt.remove(0);
				// System.out.println("size "+posterInt.size());
			} while (!posterInt.isEmpty());

			//System.out.println("toal count " + count);
			answer.add(count);

		}
		
		for (int j = 0; j < answer.size(); j++) {
			System.out.println(String.valueOf(answer.get(j)));
		}

		// factorial logic with modulo - check the condition if p==v set 1 else 0
		// start from 0 and continue with end of array of poster
		// remove index once one circle done

	}

}
