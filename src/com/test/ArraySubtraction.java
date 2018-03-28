package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraySubtraction {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int arr[] = new int[number];
		
		for(int i=0; i< number; i++){
			arr[i] = scanner.nextInt();			
		}
		
		int even =0, odd =0;
		for(int i=0; i< number; i++){
			if(i%2 == 0){
				even += arr[i];
			}else{
				odd += arr[i];
			}
		}		
		int sub;
		if(even > odd){
			sub = even-odd;
		}else{
			sub = odd-even;
		}
		
		System.out.print(String.valueOf(sub));				
		
	}
}
