package com.techgig;

import java.io.*;
import java.util.*;

public class NeighbourandNewParty {

	public static int MaxofArray(int[] A) {
		int ans = 0;
		for (int i = 0; i < A.length; i++) {
			if (ans <= A[i]) {
				ans = A[i];
			}
		}
		return ans;
	}

	public static Integer getKey(HashMap<Integer, Integer>  map, Integer value) {
		for (Map.Entry entry : map.entrySet()) {
			if (value == entry.getValue()) {
				return (Integer) entry.getKey();
			}
		}
		return null;
	}

	public static void FindMaxCount() {
		int n = scanner.nextInt();
		int A[] = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}

		HashMap<Integer, Integer> maxintMap = new HashMap();
		
		for (int j = 0; j < n; j++) {
			maxintMap.put(A[j], A[j] + A[j + 2]);
		}
		
		maxintMap.put(0, MaxofArray(A));
		ArrayList<Integer> VALUES = new ArrayList();
		for (Map.Entry mapElement : maxintMap.entrySet()) {
			// Add some bonus marks
			// to all the students and print it
			int value = (int) mapElement.getValue();
			VALUES.add(value);
		}
		// System.out.println(“Before = “+VALUES);
		Collections.sort(VALUES);

		int KEY = getKey(maxintMap, VALUES.get(VALUES.size() - 1));
		int VALUE = VALUES.get(VALUES.size() - 1);
		if (KEY == 0) {
			System.out.println(VALUE);
		} else {
			String s1 = (VALUE - KEY) + "";
			String s2 = KEY + "";
			System.out.println(s1 + s2);
		}
	}

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) throws Exception {
		int T = scanner.nextInt();
		for (int i = 0; i < T; i++) {
			FindMaxCount();
			// System.out.println("Number of Test cases = "+i);
		}
	}

}
