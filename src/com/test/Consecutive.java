package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Consecutive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
//		Arrays.sort(arr);
//
//		boolean isCons = true;
//		for (int i = 1; i < arr.length; i++) {			
//			if (arr[i] - arr[i - 1] != 1) {
//				isCons = false;
//				break;
//			}
//		}
//		if (isCons) {
//			System.out.println("True");
//		} else {
//			System.out.println("False");
//		}
		
		//Less time complexity
		if (areConsecutive(arr, n)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
	
	 static boolean areConsecutive(int arr[], int n)  
	    { 
	        if (n < 1) 
	            return false; 
	  
	        /* 1) Get the minimum element in array */
	        int min = getMin(arr, n); 
	  
	        /* 2) Get the maximum element in array */
	        int max = getMax(arr, n); 
	  
	        /* 3) max-min+1 is equal to n then only check all elements */
	        if (max - min + 1 == n)  
	        { 
	            int i; 
	            for (i = 0; i < n; i++)  
	            { 
	                int j; 
	  
	                if (arr[i] < 0) 
	                    j = -arr[i] - min; 
	                else
	                    j = arr[i] - min; 
	  
	                // if the value at index j is negative then 
	                // there is repitition 
	                if (arr[j] > 0)  
	                    arr[j] = -arr[j]; 
	                else
	                    return false; 
	            } 
	  
	            /* If we do not see a negative value then all elements 
	               are distinct */
	            return true; 
	        } 
	  
	        return false; // if (max-min+1 != n) 
	    } 
	  
	    static /* UTILITY FUNCTIONS */
	    int getMin(int arr[], int n)  
	    { 
	        int min = arr[0]; 
	        for (int i = 1; i < n; i++)  
	        { 
	            if (arr[i] < min) 
	                min = arr[i]; 
	        } 
	        return min; 
	    } 
	  
	    static int getMax(int arr[], int n)  
	    { 
	        int max = arr[0]; 
	        for (int i = 1; i < n; i++)  
	        { 
	            if (arr[i] > max) 
	                max = arr[i]; 
	        } 
	        return max; 
	    } 

}
