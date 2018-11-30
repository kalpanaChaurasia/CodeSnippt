package com.test;

import java.util.Scanner;

public class DigitOddEvenSubtract {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int odd = 0, even = 0 ;

		while (n > 0) {
			int r = n % 10;		
			if(r % 2 == 0) {
				even += r;
			}else {
				odd += r;
			}
			n = n / 10;
		}
		
		int sub = (even > odd) ? even - odd : odd - even;
		System.out.println(String.valueOf(sub));

	}

}
