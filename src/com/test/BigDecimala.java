package com.test;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimala {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double meal_cost = scanner.nextDouble();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tip_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tax_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		solve(meal_cost, tip_percent, tax_percent);

		scanner.close();

	}

	// Complete the solve function below.
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		BigDecimal value = new BigDecimal(meal_cost + ((meal_cost * tip_percent) / 100) + ((meal_cost * tax_percent) / 100));
		
		value = value.setScale(0, BigDecimal.ROUND_HALF_UP);
		value = value.setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println("" + value.intValue());
	}

}
