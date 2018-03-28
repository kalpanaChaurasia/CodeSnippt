package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayCount {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int array[] = new int[number];
		
		for(int i=0; i< number; i++){
			array[i] = scanner.nextInt();
		
		}
		int find = scanner.nextInt();
		
		boolean isFind = false;
		for(int i=0; i< array.length; i++){
			if((array[i]+array[i+1]) == find){
				isFind = true;
				break;
			}
		}
		
		if(isFind){
			System.out.print("True");
		}else{
			System.out.print("False");
		}
		
		
	}
}
