package com.techgig;

import java.util.Scanner;

public class TestArmstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		while(num > 0) {
			int a = num %10;
			sum += a*a*a;
			num /= 10;
		}
		
		if(temp == sum) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
