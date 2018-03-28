package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		ArrayList<Integer> array = new ArrayList<>();
		for(int i=0; i< number; i++){
			int arr = scanner.nextInt();
			array.add(arr);
		}
		
		Collections.sort(array);
		System.out.print(String.valueOf(array.get(number-2)));				
		
	}
}
