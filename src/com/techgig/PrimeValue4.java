package com.techgig;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrimeValue4 {

	// 3
	// 5 2 1
	// 1 2 3 4 5
	// 4 3 0
	// 3 5 2 1
	// 6 7 2
	// 7 13 10 5 21 22

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String testcase = br.readLine();
			int t = Integer.parseInt(testcase);
			int n, p, v;

			if (t < 0 || t > 100) {
				return;
			}

			ArrayList<Integer> answer = new ArrayList<>();
			for (int j = 0; j < t; j++) {

				String lines = br.readLine();
				String[] strs = lines.trim().split("\\s+");
				n = Integer.parseInt(strs[0]);
				p = Integer.parseInt(strs[1]);
				v = Integer.parseInt(strs[2]);

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
				String values = br.readLine();
				String[] val = values.trim().split("\\s+");
				for (int i = 0; i < val.length; i++) {
					posterInt.add(Integer.parseInt(val[i]));
				}
				int count = 0;

				// logic
				do {
					int result = posterInt.get(0);
					// System.out.println("rs "+result);
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
				// System.out.println("count "+String.valueOf(count));
				
				for (int k = 0; k < posterInt.size(); k++) {					
					if (0 % posterInt.get(k) == v) {
						count++;
					}
				}
				answer.add(count);
			}

			for (int j = 0; j < answer.size(); j++) {
				System.out.println(String.valueOf(answer.get(j)));
			}
		} catch (Exception e) {

		}
	}

}
