package com.leetcode;

public class DuplicateZeros {
	
//	Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
//
//	Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
//
//	 
//
//	Example 1:
//
//	Input: arr = [1,0,2,3,0,4,5,0]
//	Output: [1,0,0,2,3,0,0,4]
//	Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
//	Example 2:
//
//	Input: arr = [1,2,3]
//	Output: [1,2,3]
//	Explanation: After calling your function, the input array is modified to: [1,2,3]

	public static void main(String[] args) {
		int arr[] = { 12,345,2,6,7896};
		DuplicateZeros ed = new DuplicateZeros();
		ed.duplicateZeros(arr);
		
	}
	
	 public void duplicateZeros(int[] arr) {
	        
		 int zereos = 0;
	        for(int ze : arr){
	            if(ze == 0){
	                zereos++;
	            }
	        }
	        
	        int i = arr.length-1, j = arr.length + zereos -1;
	        
	        while(i != j) {
	        	insert(arr, i, j--);
	        	if(arr[i] == 0) {
	        		insert(arr, i, j--);
	        	}	     
	        	i--;
	        }     	        
	        
	    }
	 
		 public void insert(int[] arr, int i, int j) {
			 if(j < arr.length) {
			 arr[j] = arr[i];
			 }
		 }
}
