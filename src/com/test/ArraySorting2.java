package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraySorting2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] arrInt = new int[number];
		int s = 0, e= number-1, max, min , i;
		
		//ArrayList<Integer> array = new ArrayList<>();
		for(i= 0; i< number; i++){
			arrInt[i] = scanner.nextInt();			
		}
		
		int index1 = 0, index2 = 0;
		
		for(s= 0; s < number-1; s++){
			if(arrInt[s] > arrInt[s+1]){
			//	index1 = s;
				break;
			}			
		}
		
		if(s == number-1){
			System.out.println("The complete array is sorted");
			    return;
		}
		
		
		for(e= number-1; e> 0; e--){
			if(arrInt[e] < arrInt[e-1]){
				//index2 = e;
				break;
			}			
		}
		
		
		  max = arrInt[s]; min = arrInt[s];
		  for(i = s + 1; i <= e; i++)
		  {
		    if(arrInt[i] > max)
		      max = arrInt[i];
		    if(arrInt[i] < min)
		      min = arrInt[i];
		  }
		  
		  // step 2(b) of above algo
		  for( i = 0; i < s; i++)
		  {
		    if(arrInt[i] > min)
		    {  
		      s = i;
		      break;
		    }      
		  } 
		  
		  // step 2(c) of above algo
		  for( i = number -1; i >= e+1; i--)
		  {
		    if(arrInt[i] < max)
		    {
		      e = i;
		      break;
		    } 
		  }  
			
			for(i = s; i<= e; i++){
				System.out.print(String.valueOf(arrInt[i])+" "); 
			}
		
	}
}
