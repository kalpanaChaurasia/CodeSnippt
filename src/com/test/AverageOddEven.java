package com.test;

import java.util.Scanner;

public class AverageOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int countOdd = 0, countEven = 0;
		float oddVal = 0, evenVal = 0;
		int evenAvg = 0, oddAvg = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 2 == 0) {
				countEven++;
				evenVal += arr[i];

			} else {
				countOdd++;
				oddVal += arr[i];
			}
		}

		if (countEven != 0)
			evenAvg = (int) Math.ceil(evenVal / countEven);
		if (countOdd != 0)
			oddAvg = (int) Math.ceil(oddVal / countOdd);

		
		
		System.out.println(String.valueOf((evenAvg + oddAvg)));

	}

}
