package com.classes;

public class Hackerath3 {

	public static void main(String[] args) {

		try {
		Integer hack[] = new Integer[1];
		hack[0] = null;
		System.out.println(hack.length);
		}catch(NullPointerException e) {
			System.out.println("hello");
		}catch(Exception h2) {
			System.out.println("hi");
		}
		System.out.println("hackerat");
	}

}
