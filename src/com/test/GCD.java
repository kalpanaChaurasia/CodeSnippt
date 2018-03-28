package com.test;

import java.math.BigInteger;
import java.util.Scanner;

public class GCD {
	// Greatest common divisor

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		//1 way
//		BigInteger b1 = BigInteger.valueOf(a);
//		BigInteger b2 = BigInteger.valueOf(b);
//		BigInteger gcd = b1.gcd(b2);
//		System.out.println(String.valueOf(gcd.intValue()));
		
		//2 way
		int gcdVal = gcd(a, b%a);
		
		System.out.println(String.valueOf(gcdVal));
	}
	
	static int gcd(int a, int b)
	{
	  while(a!=0 && b!=0) // until either one of them is 0
	  {
	     int c = b;
	     b = a%b;
	     a = c;
	  }
	  return a+b; // either one is 0, so return the non-zero value
	}

}
