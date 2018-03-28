package com.test;

import java.io.IOException;
import java.util.Scanner;

public class BalancedString {

	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        String ip1 = in.nextLine().trim();
        output = balancedStringOrNot(ip1);
        System.out.println(String.valueOf(output));
    }
	
	 public static int balancedStringOrNot(String input1)
	    {
		  if(input1.contains("{")){
			  char[] input = input1.toCharArray();
			  int countO =0, countC=0;
			  for(int i=0;i<input.length;i++){
				  char c = input[i];
				  if(c == '{')
				  {
					  countO++;
				  }
				  if(c == '}')
				  {
					  countC++;
				  }
			  }
			  if(countO == countC){
				  return 1;
			  }
		  }
		  
		  return -1;
	    }
}
