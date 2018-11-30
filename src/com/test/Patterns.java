package com.test;

public class Patterns {
	
//	Notes
//	You should name the loop indexes row and col, NOT i and j, or x and y, or a and b, which are meaningless.
//	The row and col could start at 1 (and upto size), or start at 0 (and upto size-1). As computer counts from 0, 
	//it is probably more efficient to start from 0. However, since humans counts from 1, it is easier to read if you start from 1.

	public static void main(String[] args) {
		// Patern 1
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		
	
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		
//		*********
//		 *******
//		  *****
//		   ***
//		    *

//		*
//		**
//		***
//		****
//		*****
//		*****
//		****
//		***
//		**
//		*
//		    *
//		   **
//		  ***
//		 ****
//		*****
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 4) {
					System.out.print("*");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		// Pattern2 - StarTriangle

		int i, j, k;
		for (i = 5; i >= 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Pattern3 - Star reverse

		for (i = 5; i >= 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Pattern 4
		for (i = 1; i <= 6; i++) {
			for (j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Pattern 5
		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Pattern 6

		for (i = 5; i >= 1; i--) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Pattern 7

		for (i = 5; i >= 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Pattern 8
		for (i = 1; i <= 5; i++) {
			for (j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 4; i >= 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
