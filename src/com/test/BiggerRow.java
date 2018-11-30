package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BiggerRow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int count = 0;
		HashMap<String, Integer> total = new HashMap<>();

		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
				count += arr[i][j];
			}
			total.put("Row " + (i + 1), count);
		}

		Map.Entry<String, Integer> maxEntry = null;
		for (Map.Entry<String, Integer> entry : total.entrySet()) {
			if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}
		}
		System.out.println(maxEntry.getKey());
	}

}
