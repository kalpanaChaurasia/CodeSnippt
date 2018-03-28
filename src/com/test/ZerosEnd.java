package com.test;

import java.io.IOException;
import java.util.Scanner;

public class ZerosEnd {

	 public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        int[] output = null;
	        int ip1_size = 0;
	        ip1_size = Integer.parseInt(in.nextLine().trim());
	        int[] ip1 = new int[ip1_size];
	        int ip1_item;
	        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
	            ip1_item = Integer.parseInt(in.nextLine().trim());
	            ip1[ip1_i] = ip1_item;
	        }
	        output = unityInZeros(ip1);
	        for(int output_i=0; output_i < output.length; output_i++) {
		        	System.out.println(String.valueOf(output[output_i]));
		            }
	    }
	 
	  public static int[] unityInZeros(int[] input1)
	    {
	
		   int count = 0;
		   int n=input1.length;
		   
		   for(int i=0; i<n; i++){			   
			   if(input1[i] != 0){
				   input1[count++] = input1[i];				   
			   }		   			  
		   }
		   
		   while(count < n){
			   input1[count++] = 0;
		   }
		   return input1;
	    }

}
