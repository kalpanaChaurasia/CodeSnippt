package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

//		153 = (1*1*1)+(5*5*5)+(3*3*3)  
//				where:  
//				(1*1*1)=1  
//				(5*5*5)=125  
//				(3*3*3)=27  
//				So:  
//				1+125+27=153  
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int c = 0, a, temp;		
		temp = number;
		while (number > 0) {
			a = number % 10;
			number = number/10;
			c = c+(a*a*a);
		}
		
		if (temp == c)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
