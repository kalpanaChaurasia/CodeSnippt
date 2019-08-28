package com.test;

import java.util.Scanner;

//Program 1: Reverse a number using while Loop	
//Program 2: Reverse a number using for Loop
//Program 3: Reverse a number using recursion

/*In this program, while loop is used to reverse a number as given in the following steps:

First, the remainder of num divided by 10 is stored in the variable digit. Now, digit contains the last digit of num, i.e. 4.
digit is then added to the variable reversed after multiplying it by 10. Multiplication by 10 adds a new place in the reversed number. One-th place multiplied by 10 gives you tenth place, tenth gives you hundredth and so on. In this case, reversed contains 0 * 10 + 4 = 4.
num is then divided by 10 so that now it only contains first three digits: 123.
After second iteration, digit equals 3, reversed equals 4 * 10 + 3 = 43 and num = 12
After third iteration, digit equals 2, reversed equals 43 * 10 + 2 = 432 and num = 1
After fourth iteration, digit equals 1, reversed equals 432 * 10 + 1 = 4321 and num = 0
Now num = 0, so the test expression num != 0 fails and while loop exits. reversed already contains the reversed number 4321.


*/
public class ReverseNumberWhile {

	public static void main(String[] args) {
		int num = 0, reversenum = 0;

		Scanner in = new Scanner(System.in);
		num = in.nextInt();

//		////////// WHILE LOOP//////////////////
//		while (num != 0) {
//			reversenum *= 10;
//			reversenum = reversenum + num % 10;
//			num /= 10;
//		}
//
//		System.out.println("Reverse number is = " + reversenum);
//
//		while (num != 0) {
//			int digit = num % 10;
//			reversenum = reversenum * 10 + digit;
//			num /= 10;
//		}
//		System.out.println("Reverse number is = " + reversenum);
//
//		//////////////////// Using for loop/////////////////////
//		for (; num != 0; num /= 10) {
//			int digit = num % 10;
//			reversenum = reversenum * 10 + digit;
//		}
//
//		System.out.println("Reverse number is = " + reversenum);

		/////////////////// RECURSION/////////////////////////////
		reverseMethod(num);
		System.out.println();
	}

	//1234
	public static void reverseMethod(int num) {
		if (num < 10) {
			System.out.println(num);
			return;
		} else {
			System.out.print(num % 10);
			reverseMethod(num / 10);
		}

	}

}
