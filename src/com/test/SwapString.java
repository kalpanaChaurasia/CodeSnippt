package com.test;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Hello";
		String b = "world";
		System.out.println("Before swap: " + a + " " + b);
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After swap: " + a + " " + b);
	}

}
