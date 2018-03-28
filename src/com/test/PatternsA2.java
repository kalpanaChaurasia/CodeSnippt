package com.test;

import java.io.IOException;
import java.util.Scanner;


public class PatternsA2 {

	public static void main(String[] args) throws IOException {
	
		String[] strings = {"5", "4", "3", "2", "1"};
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < strings.length; j++) {
				if (j == 4) {
					System.out.print(strings[j]);
				} else {
					System.out.print(strings[j]+" ");
				}
			}
			System.out.println();
		}
	}

}
