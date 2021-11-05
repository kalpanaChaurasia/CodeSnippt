package com.leetcode;

public class EvenNumDigit {
	
//	Time and space complexity
//	Time complexity
//	We are looping over the nums array once and have a nested while loop inside the outer loop. On the first look, the complexity looks quadratic. If we look closely, each number is the array is in the range 1 to 100000 i.e. the while loop will run maximum 6 times for the largest number in the array. In the worst case the complexity would be O(6*n), here 6 is a constant, so time complexity would be O(n).
//
//	Space complexity
//	We are using extra space to store a couple of variables. So space complexity would be constant, O(1).
	
//	Given an array nums of integers, return how many of them contain an even number of digits.
//			 
//
//			Example 1:
//
//			Input: nums = [12,345,2,6,7896]
//			Output: 2
//			Explanation: 
//			12 contains 2 digits (even number of digits). 
//			345 contains 3 digits (odd number of digits). 
//			2 contains 1 digit (odd number of digits). 
//			6 contains 1 digit (odd number of digits). 
//			7896 contains 4 digits (even number of digits). 
//			Therefore only 12 and 7896 contain an even number of digits.
//			Example 2:
//
//			Input: nums = [555,901,482,1771]
//			Output: 1 
//			Explanation: 
//			Only 1771 contains an even number of digits.

	public static void main(String[] args) {
		int arr[] = { 12,345,2,6,7896};
		EvenNumDigit ed = new EvenNumDigit();
		int ans = ed.findNumbers(arr);
		  System.out.println("ans "+ans);
	}
	
	 public int findNumbers(int[] nums) {
	        
	        int result=0;
	        
	        for(int i=0; i<nums.length; i++){       	
	           
	          
	            int val = nums[i];
	            int dc =0;
	                while(val > 0){
	                    val /= 10;
	                    dc++;
	                   
	                }
	                
	              
	                if(dc % 2 == 0){
	                	result++;
	                }
	            
	        }       
	        return result;
	        
	    }
}
