package com.leetcode;

public class MaxConsecutiveOne {

	
//	Given a binary array nums, return the maximum number of consecutive 1's in the array.
//
//			 
//
//			Example 1:
//
//			Input: nums = [1,1,0,1,1,1]
//			Output: 3
//			Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
//			Example 2:
//
//			Input: nums = [1,0,1,1,0,1]
//			Output: 2
//			 
//
//			Constraints:
//
//			1 <= nums.length <= 105
//			nums[i] is either 0 or 1.
			
	public static void main(String[] args) {
		int arr[] = { 1,1,0,1,1,1};
//		int arr[] = { 1,0,1,1,0,1};
		MaxConsecutiveOne ed = new MaxConsecutiveOne();
		int ans = ed.findMaxConsecutiveOnes(arr);
		  System.out.println("ans "+ans);

	}
	
	 public int findMaxConsecutiveOnes(int[] nums) {
	        
	        int count=0;
	        int result=0;
	        
	        for(int i=0; i<nums.length; i++){
	            int val = nums[i];
	           
	            
	            if(val == 1){
	                count ++;
	                result = Math.max(result, count);
	            }else{
	                count = 0;
	            }
	            
	        }
	        return result;
	    }

}
