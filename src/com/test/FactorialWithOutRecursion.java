package com.test;

public class FactorialWithOutRecursion {

	static int display(int n) {
		if (n == 0)
			return 1;
		else {
			int a[] =new int[n];
			a[n-1] = n;
			for(int i=n-2; i>= 0; i--) {
				a[i] += a[i+1] * (i+1);				
			}
			return a[0];
		}
			
	}

	public static void main(String args[]) {
		int i, fact = 1;
		int number = 6;// It is the number to calculate factorial
		fact = display(number);
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}