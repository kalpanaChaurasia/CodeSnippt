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
		int result[][] = new int[m][n];
		
		for(int i=0; i<m;i++){
			for(int j=0; j<n;j++){
				matrix[i][j] = scanner.nextInt(); 
			}
		}
	
		
		//Other way
		for(int i = 0; i < m; i++) {
			  for(int j = i+1; j < n; j++) {
			    int temp = matrix[i][j];
			    matrix[i][j] = matrix[j][i];
			    matrix[j][i] = temp;			   
			  }				
			}

//		for(int i=0; i<m;i++){
//			for(int j=0; j<n;j++){			
//				System.out.print(matrix[j][i]+" ");
//				if(j != n-1){
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}	
		
	}
	
	public static int[][] trasposeMatrix(int[][] matrix)
	{
	    int m = matrix.length;
	    int n = matrix[0].length;

	    int[][] trasposedMatrix = new int[n][m];

	    for(int x = 0; x < n; x++)
	    {
	        for(int y = 0; y < m; y++)
	        {
	            trasposedMatrix[x][y] = matrix[y][x];
	        }
	    }

	    return trasposedMatrix;
	}
}
