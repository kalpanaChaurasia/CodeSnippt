package com.test;

import java.util.Scanner;

public class SphereComputation {

	//Write a program called SphereComputation that prompts user for the radius of a sphere in floating point number. 
	//The program shall read the input as double; compute the volume and surface area of the sphere in double; and print the values 
	//rounded to 2 decimal places. The formulas are:
		
//	surfaceArea = 4 * Math.PI * radius * radius;
//	volume = 4 /3 * Math.PI * radius * radius * radius;   // But this does not work in programming?! Why?
	//Take note that you cannot name the variable surface area with a space or surface-area with a dash. 
	//Java's naming convention is surfaceArea. Other languages recommend surface_area with an underscore.
	public static void main(String[] args) {
		double radius, surfaceArea, volume;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		radius = in.nextDouble(); // read input as double
		
		surfaceArea = 4 * Math.PI * radius * radius;
		volume =   4 /3 * Math.PI * radius * radius * radius;
		
		
		System.out.printf("surfaceArea is: %.2f%n", surfaceArea);
		System.out.printf(" volume is: %.2f%n", volume);
		

	}

}
