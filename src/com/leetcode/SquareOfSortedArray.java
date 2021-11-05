package com.leetcode;

import java.util.Arrays;

public class SquareOfSortedArray {

	// Given an integer array nums sorted in non-decreasing order, return an array
	// of the squares of each number sorted in non-decreasing order.

	// Example 1:
	//
	// Input: nums = [-4,-1,0,3,10]
	// Output: [0,1,9,16,100]
	// Explanation: After squaring, the array becomes [16,1,0,9,100].
	// After sorting, it becomes [0,1,9,16,100].
	// Example 2:
	//
	// Input: nums = [-7,-3,2,3,11]
	// Output: [4,9,9,49,121]

	public static void main(String[] args) {
		int arr[] = { -4, -1, 0, 3, 10 };
		SquareOfSortedArray ed = new SquareOfSortedArray();
		int ans[] = ed.sortedSquares(arr);
		
		System.out.println(Arrays.toString(ans));
//		for (int i = 0; i < ans.length; i++) {
//			System.out.println("ans " + ans[i]);
//		}
		
	}

	public int[] sortedSquares(int[] nums) {

		int result[] = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			result[i] = nums[i] * nums[i];
		}

		for (int i = 0; i < result.length - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < result.length; j++) {
				if (result[j] < result[min_idx]) {
					min_idx = j;
				}
			}
			
			int temp = result[min_idx];
			result[min_idx] = result[i];
			result[i] = temp;

		}

		return result;

	}
}
