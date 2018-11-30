package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayCalculation {
	
	// input
//	5
//	2 3 4 5 6
	//output
//	96

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int arr[] = new int[number];
		
		for(int i=0; i< number; i++){
			arr[i] = scanner.nextInt();			
		}
		
		int even =0, odd =0;
		for(int i=0; i< number; i++){
			if(arr[i]%2 == 0){
				even += arr[i];
			}else{
				odd += arr[i];
			}
		}		
		
		System.out.print(String.valueOf(even*odd));				
		
	}
}
