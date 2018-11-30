package com.test;

import java.io.IOException;
import java.util.Scanner;


public class PatternsNumbers {

//	Write 4 programs called NumberPatternX (X = A, B, C, D) that prompts user for the size (a non-negative integer in int); and prints the pattern as shown:
//
//		Enter the size: 8
//
//		1                    1 2 3 4 5 6 7 8                    1      8 7 6 5 4 3 2 1
//		1 2                    1 2 3 4 5 6 7                  2 1      7 6 5 4 3 2 1
//		1 2 3                    1 2 3 4 5 6                3 2 1      6 5 4 3 2 1
//		1 2 3 4                    1 2 3 4 5              4 3 2 1      5 4 3 2 1
//		1 2 3 4 5                    1 2 3 4            5 4 3 2 1      4 3 2 1
//		1 2 3 4 5 6                    1 2 3          6 5 4 3 2 1      3 2 1
//		1 2 3 4 5 6 7                    1 2        7 6 5 4 3 2 1      2 1
//		1 2 3 4 5 6 7 8                    1      8 7 6 5 4 3 2 1      1
//		     (a)                  (b)                    (c)                (d)
		     
	public static void main(String[] args) throws IOException {
	
		String[] strings = {"5", "4", "3", "2", "1"};
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		5 4 3 2 1
//		5 4 3 2 1
//		5 4 3 2 1
//		5 4 3 2 1
//		5 4 3 2 1		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < strings.length; j++) {
				if (j == 4) {
					System.out.print(strings[j]);
				} else {
					System.out.print(strings[j]+" ");
				}
			}
			System.out.println();
		}
	}

}
