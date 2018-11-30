package com.test;

public class Swap2Integers {

	public static void main(String[] args) {
		int x = 9, y = -9;
		
		int z = x;
		x = y;
		y = z;
		
		System.out.println(String.valueOf(x));
		
		System.out.println(String.valueOf(y));

	}

}
