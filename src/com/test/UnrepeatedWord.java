package com.test;

import java.util.Scanner;

public class UnrepeatedWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
				
		Character c = getFirstNotRepeatedChar(input);		
		System.out.println(String.valueOf(c));
		
	}
	
	public static Character getFirstNotRepeatedChar(String input) {

	    byte[] flags = new byte[256]; //all is initialized by 0 

	    for (int i = 0; i < input.length(); i++) { // O(n)
	        flags[(int)input.charAt(i)]++ ;
	    }

	    for (int i = 0; i < input.length(); i++) { // O(n)
	        if(flags[(int)input.charAt(i)] == 1)
	            return input.charAt(i);
	    }

	    return null;
	}
}
