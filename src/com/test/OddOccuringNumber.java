package com.test;

//Using xor - Same example with for loop is - SumOddFrequency
public class OddOccuringNumber {
	public static int findNumber(int[] A) {
		int x = 0;
		for (int i = 0; i < A.length; i++) {
			x = x ^ A[i];
		}
		return x;
	}

	public static void main(String[] args) {
	//	int A[] = { 10, 20, 20, 10, 40, 40, 10 };
		int[] A = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7 };
		System.out.println("Element appearing add number of times: " + findNumber(A));

	}
}