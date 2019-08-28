package com.test;

public class Test {

	Test(int a, int b) {
		System.out.println("a = " + a + " b = " + b);
	}

	Test(int a, float b) {
		System.out.println("a = " + a + " b = " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EXAMPLE 1

		// for (int i = 0; 0; i++) {
		// System.out.println("Hello Javatpoint");
		// }

		// The above code will give the compile-time error because the for loop demands
		// a boolean value in the second part and
		// we are providing an integer value, i.e., 0.

		// EXAMPLE 2

		//Here, the data type of the variables a and b, i.e., byte gets promoted to int, and the first parameterized constructor with the two integer parameters is called.
		
		byte a = 10;
		byte b = 15;
		Test test = new Test(a, b);

	}

}
