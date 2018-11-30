package com.test;

import java.util.Scanner;

public class CylinderComputation {

	//Write a program called CylinderComputation that prompts user for the base radius and height of a cylinder in floating point number.
	//The program shall read the inputs as double; compute the base area, surface area, and volume of the cylinder; 
	//and print the values rounded to 2 decimal places. The formulas are:
	
	public static void main(String[] args) {
		double radius, height, surfaceArea, volume, baseArea 	;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		radius = in.nextDouble(); // read input as double
		
		System.out.print("Enter the height: ");
		height = in.nextDouble(); // read input as double

		baseArea = Math.PI * radius * radius;
		surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
		volume = baseArea * height;
		
		System.out.printf("surfaceArea is: %.2f%n", surfaceArea);
		System.out.printf("volume is: %.2f%n", volume);
		System.out.printf("baseArea is: %.2f%n", baseArea);
		
	}

}
