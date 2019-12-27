package com.maths;

import java.util.Scanner;

public class FloydsTriangle {
	public static void main(String[] args) {

		int rows, number = 1, counter, j;

		// To get the user's input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows for floyd's triangle:");

		// Copying user input into an integer variable named rows
		rows = input.nextInt();
		System.out.println("Floyd's triangle");
		System.out.println("****************");

		for (counter = 1; counter <= rows; counter++) {
			for (j = 1; j <= counter; j++) {
				System.out.print(number + " ");
				// Incrementing the number value
				number++;
			}
			// For new line
			System.out.println();
		}
	}

}


/*
 * Ouput
 * =========
 * Floyd's triangle
****************
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
 * 
 */


