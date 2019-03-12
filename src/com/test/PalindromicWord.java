package com.test;

import java.util.Scanner;

public class PalindromicWord {

	// e.g., "mom", "dad", "racecar", "madam", and "Radar" (case-insensitive). 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); 
		int strLen = str.length();
		sc.close();
		
		int fIdx = 0, bIdx = strLen - 1;
		while (fIdx < bIdx) {
		 
		   ++fIdx;
		   --bIdx;
		}
		// or
		for (fIdx = 0, bIdx = strLen - 1; fIdx < bIdx; ++fIdx, --bIdx) {
		  
		}
	}

}
