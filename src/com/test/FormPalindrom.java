package com.test;

import java.util.Arrays;

public class FormPalindrom {
	//Check if characters of a given string can be rearranged to form a palindrome
	//Solution: A set of characters can form a palindrome if at most one character occurs odd number of times and all characters 
	//occur even number of times.

//A simple solution is to run two loops, the outer loop picks all characters one by one, the inner loop counts number of 
	//occurrences of the picked character. We keep track of odd counts. Time complexity of this solution is O(n2).
//
//We can do it in O(n) time using a count array. Following are detailed steps.
//1) Create a count array of alphabet size which is typically 256. Initialize all values of count array as 0.
//2) Traverse the given string and increment count of every character.
//3) Traverse the count array and if the count array has more than one odd values, return false. Otherwise return true.


	static int NO_OF_CHARS = 256;
	
	public static void main(String args[]) {
		
		
		if (canFormPalindrome("geeksforgeeks"))
			System.out.println("Yes");
		else
			System.out.println("No");

		if (canFormPalindrome("geeksogeeks"))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	  /* function to check whether characters  
    of a string can form a palindrome */
    static boolean canFormPalindrome(String str) { 
    	int count[] = new int[NO_OF_CHARS]; 
        Arrays.fill(count, 0); 
        for(int i=0; i<str.length(); i++) {
        	count[((int)str.charAt(i))]++;
        }
        
        // Count odd occurring characters 
        int odd = 0; 
        for (int i = 0; i < NO_OF_CHARS; i++)  
        { 
        if ((count[i] & 1) == 1) 
            odd++; 
      
        if (odd > 1) 
            return false; 
        } 
      
        // Return true if odd count is 0 or 1, 
        return true; 
        
    }
}
