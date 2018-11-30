package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RollMatrix {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int matrix[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		int[][] answer = trasposeMatrix(matrix);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println("");
		}

	}

	public static int[][] trasposeMatrix(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;

		int[][] trasposedMatrix = new int[n][m];

		for (int x = 0; x < n; x++) {
			for (int y = 0; y < m; y++) {
				trasposedMatrix[x][y] = matrix[y][x];
			}
		}

		return trasposedMatrix;
	}
}
