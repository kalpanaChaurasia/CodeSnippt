package com.test;

import java.util.Scanner;

public class RiceSeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner s = new Scanner(System.in);

	        int count = s.nextInt();
	        s.nextLine(); // throw away the newline.

	        int [] numbers = new int[count];
	        Scanner numScanner = new Scanner(s.nextLine());
	        for (int i = 0; i < count; i++) {
	            if (numScanner.hasNextInt()) {
	                numbers[i] = numScanner.nextInt();
	            } else {
	                System.out.println("You didn't provide enough numbers");
	                break;
	            }
	        }

	}

}
