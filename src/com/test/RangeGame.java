package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RangeGame {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int range1_1 = scanner.nextInt();
		int range1_2 = scanner.nextInt();
		
		int range2_1 = scanner.nextInt();
		int range2_2 = scanner.nextInt();
		
		int find = scanner.nextInt();
		
	
		if(find > range1_1 && find < range1_2){
			System.out.println("1");
		}else if(find > range2_1 && find < range2_2){
			System.out.println("2");
		}else{
			System.out.println("-1");
		}		
	}

}
