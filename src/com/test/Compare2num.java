package com.test;

import java.util.Scanner;

//345678 444444
public class Compare2num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum1 = 0, sum2 = 0;

		int n1 = num1;
		int n2 = num2;
		

//		while (num1 > 0) {
//			sum1 += num1 % 10;
//			num1 = num1 / 10;
//		}
//
//		while (num2 > 0) {
//			sum2 += num2 % 10;
//			num2 /= 10;
//		}
		
		sum1 = getSum(num1);
		sum2 = getSum(num2);
		

		if (sum1 == sum2)
			System.out.println("Equal");
		else if (sum1 > sum2)
			System.out.println(String.valueOf(n1));
		else
			System.out.println(String.valueOf(n2));
	}

	static int getSum(int n) {
		int sum;

		/* Single line that calculates sum */
		for (sum = 0; n > 0; sum += n % 10, n /= 10)
			;

		return sum;
	}

}
