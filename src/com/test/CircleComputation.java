package com.test;

import java.util.Scanner;

public class CircleComputation {
	// radius of a circle in floating point number
	// The program shall read the input as double; compute the diameter,
	// circumference, and area of the circle in double;
	// and print the values rounded to 2 decimal places. Use System-provided
	// constant Math.PI for pi. The formulas are:

	// diameter = 2.0 * radius;
	// area = Math.PI * radius * radius;
	// circumference = 2.0 * Math.PI * radius;

	public static void main(String[] args) {
		// Declare variables
		double radius, diameter, circumference, area; // inputs and results - all in double

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		radius = in.nextDouble(); // read input as double
		
		diameter = 2.0 * radius;
		circumference =  2.0 * Math.PI * radius;
		area =  Math.PI * radius * radius;
		
		System.out.printf("Diameter is: %.2f%n", diameter);
		System.out.printf("circumference is: %.2f%n", circumference);
		System.out.printf("area is: %.2f%n", area);
		
	}
}
