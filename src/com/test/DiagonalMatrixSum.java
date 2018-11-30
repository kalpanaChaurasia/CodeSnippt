package com.test;

import java.util.Scanner;

public class DiagonalMatrixSum {
//	3 3
//	1 2 3 
//	4 5 6 
//	7 8 9 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();

		int total1 = 0;
		int total2 = 0;

		int[][] matrix = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix[i][j] = sc.nextInt();
			}
			total1 += matrix[i][i];
			total2 += matrix[i][r - 1 - i];
		}

		if (total1 > total2) {
			System.out.println("Diagonal 1");
		} else if (total1 < total2) {
			System.out.println("Diagonal 2");
		} else {
			System.out.println("Equal");
		}

	}

}
