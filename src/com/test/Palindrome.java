package com.test;

import java.io.IOException;
import java.util.Scanner;

public class Palindrome {

	 public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        int output = 0;
	        int ip1 = Integer.parseInt(in.nextLine().trim());
	        String ip2 = in.nextLine().trim();
	        output = openingRightDoor(ip1,ip2);
	        System.out.println(String.valueOf(output));
	    }
	 
	 public static int openingRightDoor(int input1,String input2)
	    {		  
		 char[] str = input2.toCharArray();
		 int [][] table= new int[input1][input1];
		 
		 for(int i = input1-2; i >= 0; i-- )
			{
				for(int j = i+1; j < input1; j++ )
				{
			//		System.out.println(str[i]+":"+str[j]);
				 if( str[i] == str[j] ) //if first and last letters are equal
					{	
						if( j-i > 2 ){
							table[i][j] = table[i+1][j-1];
						}
					}
					else
					{					
						table[i][j] = 1;
						if( j-i > 1 ){						
							table[i][j] += Math.min(table[i][j-1], table[i+1][j]);
						}
					}
			 }
		 }		
		 
		 for(int i =0; i<input1; i++)
			{
				for(int j=0; j<input1; j++){
					System.out.print(table[i][j]+" ");
				}
				System.out.println("");
			}
		 
		 
		 return table[0][input1-1];		 
	    }
}
