package com.test;

//Given an array of integers where each element represents the max number of steps that can be made forward from that element. 
//Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element). 
//If an element is 0, then we cannot move through that element.
//
//Examples:
//
//Input :  arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
//Output :  3 (1-> 3 -> 8 -> 9)

public class JumpToReachEnd {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };

		// calling minJumps method
		System.out.println("Method 1 => " + minJumps(arr));

		System.out.println("Method 2 => " + minJumps(arr, 0, arr.length - 1));

	}

	// Method 1
	static int minJumps(int arr[]) {
		if (arr.length <= 1)
			return 0;

		// Return -1 if not possible to jump
		if (arr[0] == 0)
			return -1;

		// initialization
		int maxReach = arr[0];
		int step = arr[0];
		int jump = 1;

		// Start traversing array
		for (int i = 1; i < arr.length; i++) {

			// Check if we have reached the end of the array
			if (i == arr.length - 1) {
				return jump;
			}

			// updating maxReach
			maxReach = Math.max(maxReach, i + arr[i]);

			// we use a step to get to the current index
			step--;

			// If no further steps left
			if (step == 0) {
				// we must have used a jump
				jump++;

				// Check if the current index/position or lesser index
				// is the maximum reach point from the previous indexes
				if (i >= maxReach)
					return -1;

				// re-initialize the steps to the amount
				// of steps to reach maxReach from position i.
				step = maxReach - i;
			}
		}
		return -1;
	}

	// Method 2
	// Returns minimum number of
	// jumps to reach arr[h] from arr[l]
	static int minJumps(int arr[], int l, int h) {
		// Base case: when source
		// and destination are same
		if (h == l)
			return 0;

		// When nothing is reachable
		// from the given source
		if (arr[l] == 0)
			return Integer.MAX_VALUE;

		// Traverse through all the points
		// reachable from arr[l]. Recursively
		// get the minimum number of jumps
		// needed to reach arr[h] from these
		// reachable points.
		int min = Integer.MAX_VALUE;
		for (int i = l + 1; i <= h && i <= l + arr[l]; i++) {
			int jumps = minJumps(arr, i, h);
			if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
				min = jumps + 1;

		}
		return min;

	}
	
	//Method 3  Time Complexity: O(n^2)
	private static int minJumps(int[] arr, int n) {  
	    int jumps[] = new int[n];  // jumps[n-1] will hold the  
	                               // result 
	    int i, j; 
	           
	    if (n == 0 || arr[0] == 0) 
	         return Integer.MAX_VALUE;  // if first element is 0, 
	                                   // end cannot be reached 
	           
	    jumps[0] = 0; 
	           
	    // Find the minimum number of jumps to reach arr[i] 
	    // from arr[0], and assign this value to jumps[i] 
	    for (i = 1; i < n; i++) 
	    { 
	        jumps[i] = Integer.MAX_VALUE; 
	         for (j = 0; j < i; j++) 
	         { 
	              if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) 
	              { 
	                  jumps[i] = Math.min(jumps[i], jumps[j] + 1); 
	                  break; 
	              } 
	          } 
	    } 
	        return jumps[n-1]; 
	    } 

}
