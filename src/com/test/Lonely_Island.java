package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Lonely_Island {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();

		int[] ui = new int[m];
		int[] uj = new int[m];

		for (int i = 0; i < m; i++) {
			ui[i] = sc.nextInt();
			uj[i] = sc.nextInt();
		}

		List<Integer> visited = new ArrayList<>();
		int prev = 0;

		findLonelyIsland(prev, visited, m, r, ui, uj);

	}

	public static int findLonelyIsland(int prev, List<Integer> visited, int m, int r, int[] ui, int[] uj) {
		for (int i = 0; i < m; i++) {
			if (ui[i] == r) {
				if (visited.isEmpty()) {
					if (ui[i] == uj[i]) {
						visited.add(ui[i]);
						prev = ui[i];
					} else {
						visited.add(ui[i]);
						visited.add(uj[i]);
						prev = uj[i];
					}
				} else {
					if (prev == ui[i]) {
						visited.add(uj[i]);
					} else if (prev == uj[i]) {
						visited.add(ui[i]);
					}
				}
			}
		}
		
		visited = new ArrayList<>();
		
		return 0;
	}

}
