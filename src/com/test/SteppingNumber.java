package com.test;

import java.io.IOException;
import java.util.Scanner;

public class SteppingNumber {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int output = 0;
		int ip1 = Integer.parseInt(in.nextLine().trim());
				
		output = steppingNumber(ip1);
		System.out.println(String.valueOf(output));
	}

	public static int steppingNumber(int input1) {
				
		int prevDigit = -1;

		// Iterate through all digits of n and compare
		// difference between value of previous and
		// current digits
		while (input1 > 0) {
			
			// Get Current digit
			int curDigit = input1 % 10;		
					
			// Single digit is consider as a
			// Stepping Number
			if (prevDigit != -1) {				
				// Check if absolute difference between
				// prev digit and current digit is 1
				if (Math.abs(curDigit - prevDigit) != 1) {
					return -1;
				}
			}
			input1 /= 10;		
			prevDigit = curDigit;
		}
		return 1;
	}
}
