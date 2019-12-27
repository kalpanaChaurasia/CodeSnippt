package com.maths;

public class GCDSample {

	public static void main(String[] args) {
		//int a = 98, b = 56;
		int a = 55, b = 121;
		
		System.out.println("GCD of using Euclidean algorithm - recursion " + a + " and " + b + " is " + gcd(a, b));
		
		System.out.println("GCD of using Euclidean algorithm " + a + " and " + b + " is " + gcd_method1(a, b));
		
		System.out.println("GCD of using while loop " + a + " and " + b + " is " + gcd_while(a, b));
	}

	// Effective solution - Euclidean algorithm -with module
	static int gcd(int a, int b) {
		System.out.println(a + " - " + b);
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	// Effective solution - Euclidean algorithm - recursion
	static int gcd_method1(int a, int b) {
		System.out.println(a + " - " + b);
		// Everything divides 0
		if (a == 0)
			return b;
		if (b == 0)
			return a;

		// base case
		if (a == b)
			return a;

		// a is greater
		if (a > b)
			return gcd_method1(a - b, b);
		return gcd_method1(a, b - a);
	}
	
	
	//Using while loop
	static int gcd_while(int num1, int num2) {
		  while (num1 != num2) {
			  System.out.println(num1 + " - " + num2);
	        	if(num1 > num2)
	                num1 = num1 - num2;
	            else
	                num2 = num2 - num1;
	        }
		  
		  return num2;

	}

}
