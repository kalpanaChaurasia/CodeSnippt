package com.test;

public class FactorialWithRecursion {

	static int display(int n) {
		if (n == 0)
			return 1;
		else
			return (n * display(n - 1));
	}

	public static void main(String args[]) {
		int i, fact = 1;
		int number = 5;// It is the number to calculate factorial
		fact = display(number);
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}