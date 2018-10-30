package com.test;

import java.util.Arrays;

class Ideone {
	public static void main(String[] args) throws java.lang.Exception {
		
		 int[] integerArray = {1,2,3,4,5,5,6};
         System.out.println(getMinStones(integerArray, 3));

	}

	public static int getMinStones(final int a[], final int k) {

		if ((a.length < k)) {
			return -1;
		}

		Arrays.sort(a);
		int i, last, stones1, stones2, stones, count;
		stones1 = 0;
		stones2 = 0;

		// Traverse until last repeated value of a[i]
		for (i = k; i < a.length && a[k - 1] == a[i]; i++);
			
		last = a[i - 1];

		// Count number of stones from end of array
		for (i = 0; i < k; i++) {
			stones1 += a[a.length - 1 - i];
		}

		//
		for (i = 0, count = 0; count < k; i++) {
			if ((a[a.length - i - 1] > last)) {
				stones2 += last;
			} else {
				stones2 += a[a.length - i - 1];
				count++;
			}
		}
		stones = Math.min(stones1, stones2);
		return stones;
	}
}