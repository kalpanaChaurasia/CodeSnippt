package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	/*
	 * Given an array of integers, return indices of the two numbers such that they
	 * add up to a specific target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * Example:
	 * 
	 * Given nums = [2, 7, 11, 15], target = 9,
	 * 
	 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
	 */

	public static void main(String[] args) {

		int nums[] = {2, 7, 11, 15};
		int target = 9;
		
		int[]  ans = twoSum(nums, target);
		
		//Print int array with out for loop
		System.out.println(Arrays.toString(ans));
		
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> maps = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (maps.containsKey(complement)) {
				return new int[] { maps.get(complement), i };
			}
			maps.put(nums[i], i);

		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
