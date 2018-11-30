package com.test;

public class OddAppearingElement {

//	We strongly recommend you to minimize your browser and try this yourself first.
//
//	A Simple Solution is to sort the array and then traverse the array from left to right. Since the array is sorted, we can easily figure out the required element. Time complexity of this solution is O(n Log n)
//
//
//
//	A Better Solution is to do XOR of all elements, result of XOR would give the odd appearing element. Time complexity of this solution is O(n). See XOR based solution for add apearing for more details.
//
//	An Efficient Solution can find the required element in O(Log n) time. The idea is to use Binary Search. Below is an observation in input array.
//	Since the element appears odd number of times, there must be a single occurrence of the element. For example, in {2, 1, 1, 2, 2), the first 2 is the odd occurrence. So the idea is to find this odd occurrence using Binary Search.
//	All elements before the odd occurrence have first occurrence at even index (0, 2, ..) and next occurrence at odd index (1, 3, �). And all elements afterhave first occurrence at odd index and next occurrence at even index.
//
//	1) Find the middle index, say �mid�.
//
//	2) If �mid� is even, then compare arr[mid] and arr[mid + 1]. If both are same, then there is an odd occurrence of the element after �mid� else before mid.
//
//	3) If �mid� is odd, then compare arr[mid] and arr[mid � 1]. If both are same, then there is an odd occurrence after �mid� else before mid.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 2, 2, 1, 1, 2, 2, 13, 1, 1, 40, 40 };
		int len = arr.length;
		search(arr, 0, len - 1);
	}
	
	static void search(int arr[], int low, int high) 
    { 
        // Base cases 
        if (low > high) 
        return; 
        if (low == high) 
        { 
            System.out.printf("The required element is %d "
                              , arr[low]); 
            return; 
        } 
      
        // Find the middle point 
        int mid = (low + high)/2; 
      
        // If mid is even and element next to mid is 
        // same as mid, then output element lies on 
        // right side, else on left side 
        if (mid % 2 == 0) 
        { 
            if (arr[mid] == arr[mid + 1]) 
                search(arr, mid + 2, high); 
            else
                search(arr, low, mid); 
        } 
          
        // If mid is odd 
        else 
        { 
            if (arr[mid] == arr[mid - 1]) 
                search(arr, mid + 1, high); 
            else
                search(arr, low, mid - 1); 
        } 
    } 

}
