package com.test;

public class ComputePI {

	//(piComputed / Math.PI) * 100. PI (=3.141592653589793).
	
	//Write a program called ComputePI to compute the value of π, using the following series expansion. Use the maximum denominator
	//(maxDenominator) as the terminating condition. Try maxDenominator of 1000, 10000, 100000, 1000000 and compare the PI obtained.
	//Is this series suitable for computing PI? Why?

		
	public static void main(String[] args) {
		double sum = 0.0;
		
		
		//One way
		int maxDenominator = 1000; // Try 10000, 100000, 1000000
		for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {
			// denominator = 1, 3, 5, 7, ..., maxDenominator
			if (denominator % 4 == 1) {
				sum += 1.0 / denominator;
			} else if (denominator % 4 == 3) {
				sum -= 1.0 / denominator;
			} else { // remainder of 0 or 2
				System.out.println("Impossible!!!");
			}
		}
		  System.out.println(String.valueOf(sum));
		  
		//other way
		  int maxTerm = 10000;  // number of terms used in computation
	      sum = 0.0;
	      for (int term = 1; term <= maxTerm; term++) {  // term = 1, 2, 3, ..., maxTerm
	            // term = 1, 2, 3, 4, ..., maxTerm
	         if (term % 2 == 1) {  // odd term number: add
	            sum += 1.0 / (term * 2 - 1);
	         } else {              // even term number: subtract
	        	 sum -= 1.0 / (term * 2 - 1);
	         }
	      }
	      System.out.println(String.valueOf(sum));
	}

}
