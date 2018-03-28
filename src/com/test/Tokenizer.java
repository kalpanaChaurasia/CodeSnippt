package com.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
//		  StringTokenizer st = new StringTokenizer(input, "( { [ } ] )");
//		     while (st.hasMoreElements()) {
//		         System.out.println(st.nextElement());
//		     }
		
		String[]	 output = separatersInString(input);
	        for(int output_i=0; output_i < output.length; output_i++) {
	            System.out.println(String.valueOf(output[output_i]));
	        }
		 
	}
	
	 public static String[] separatersInString(String input1)
	    {
		     ArrayList<String> output = new ArrayList<>();
			    int i=0;
			
			  StringTokenizer st = new StringTokenizer(input1, "( ) { } [ ]");
			     while (st.hasMoreTokens()) {
			    	 output.add(st.nextToken());			     
			     }
			     System.out.println(output.toString());
			     
			     String[] stockArr = new String[output.size()];
			     stockArr = output.toArray(stockArr);
			     
			     return stockArr;
	    }

}
