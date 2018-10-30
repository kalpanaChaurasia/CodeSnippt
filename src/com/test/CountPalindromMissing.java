package com.test;

import java.util.Scanner;

public class CountPalindromMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
		 int n = Integer.parseInt(in.nextLine());
	   
	     String str = in.nextLine();
	     
	      System.out.println(
	        findMinInsertionsDP(str.toCharArray(), str.length()));


	}
	
	 public static int findMinInsertionsDP(char str[], int n)
	    {
	      
	        int table[][] = new int[n][n];
	        int l, h, gap;
	 
	      
	        for (gap = 1; gap < n; ++gap) {
	        for (l = 0, h = gap; h < n; ++l, ++h) {
	            table[l][h] = (str[l] == str[h])?
	                           table[l+1][h-1] :
	                          (Integer.min(table[l][h-1],
	                                 table[l+1][h]) + 1);
	        }
	        }
	        // Return minimum number of insertions
	        // for str[0..n-1]
	        return table[0][n-1];
	    }

}
