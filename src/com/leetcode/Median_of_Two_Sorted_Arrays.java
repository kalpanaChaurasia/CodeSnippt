package com.leetcode;

import java.util.Arrays;

/*There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5*/

public class Median_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2 , 4};
		double ans  = findMedianSortedArrays(nums1, nums2);
		System.out.println("The median is "+ans);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double medianNum = 0.0d;

		int m = nums1.length;
		int n = nums2.length;
		int[] newArr = new int[nums1.length + nums2.length];
		System.arraycopy(nums1, 0, newArr, 0, nums1.length);
		System.arraycopy(nums2, 0, newArr, nums1.length, nums2.length);
		Arrays.sort(newArr);

		int medianIndex = newArr.length / 2;
		if (((newArr.length) % 2) == 0) {
			// Even number
			medianNum = (newArr[medianIndex] + newArr[medianIndex - 1]) / 2.0;
		} else {
			medianNum = newArr[medianIndex];
		}

		return medianNum;

	}

}
