package com.test;

public class RepeatElement {

	// Method 1 (Basic)
	// Use two loops. In the outer loop, pick elements one by one and count the
	// number of occurrences of the picked element in the inner loop.
	// Time Complexity: O(n*n)
	// Auxiliary Space: O(1)
	void printRepeating1(int arr[], int size) {
		int i, j;
		System.out.println("Repeated Elements are :");
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (arr[i] == arr[j])
					System.out.print(arr[i] + " ");
			}
		}
	}

	// Method 2 (Use Count array)
	// Traverse the array once. While traversing, keep track of count of all
	// elements in the array using a temp array count[] of size n, when you see an
	// element whose count is already set, print it as duplicate.
	// Time Complexity: O(n)
	// Auxiliary Space: O(n)
	void printRepeating2(int arr[], int size) {
		int count[] = new int[size];
		int i;

		System.out.println("Repeated elements are : ");
		for (i = 0; i < size; i++) {
			if (count[arr[i]] == 1)
				System.out.print(arr[i] + " ");
			else
				count[arr[i]]++;
		}
	}

	// Method 3 (Make two equations)
	// Let the numbers which are being repeated are X and Y. We make two equations
	// for X and Y and the simple task left is to solve the two equations.
	// We know the sum of integers from 1 to n is n(n+1)/2 and product is n!. We
	// calculate the sum of input array, when this sum is subtracted from n(n+1)/2,
	// we get X + Y because X and Y are the two numbers missing from set [1..n].
	// Similarly calculate product of input array, when this product is divided from
	// n!, we get X*Y. Given sum and product of X and Y, we can find easily out X
	// and Y.
	//
	// Let summation of all numbers in array be S and product be P
	//
	// X + Y = S – n(n+1)/2
	// XY = P/n!
	//
	// Using above two equations, we can find out X and Y. For array = 4 2 4 5 2 3
	// 1, we get S = 21 and P as 960.
	//
	// X + Y = 21 – 15 = 6
	//
	// XY = 960/5! = 8
	//
	// X – Y = sqrt((X+Y)^2 – 4*XY) = sqrt(4) = 2
	//
	// Using below two equations, we easily get X = (6 + 2)/2 and Y = (6-2)/2
	// X + Y = 6
	// X – Y = 2

	// Time Complexity: O(n)
	// Auxiliary Space: O(1)

	void printRepeating3(int arr[], int size) {
		/* S is for sum of elements in arr[] */
		int S = 0;

		/* P is for product of elements in arr[] */
		int P = 1;

		/* x and y are two repeating elements */
		int x, y;

		/* D is for difference of x and y, i.e., x-y */
		int D;

		int n = size - 2, i;

		/* Calculate Sum and Product of all elements in arr[] */
		for (i = 0; i < size; i++) {
			S = S + arr[i];
			P = P * arr[i];
		}

		/* S is x + y now */
		S = S - n * (n + 1) / 2;

		/* P is x*y now */
		P = P / fact(n);

		/* D is x - y now */
		D = (int) Math.sqrt(S * S - 4 * P);

		x = (D + S) / 2;
		y = (S - D) / 2;

		System.out.println("The two repeating elements are :");
		System.out.print(x + " " + y);
	}

	int fact(int n) {
		return (n == 0) ? 1 : n * fact(n - 1);
	}

	// Method 4 (Use XOR)
	// Thanks to neophyte for suggesting this method.
	// The approach used here is similar to method 2 of this post.
	// Let the repeating numbers be X and Y, if we xor all the elements in the array
	// and all integers from 1 to n, then the result is X xor Y.
	// The 1’s in binary representation of X xor Y is corresponding to the different
	// bits between X and Y. Suppose that the kth bit of X xor Y is 1, we can xor
	// all the elements in the array and all integers from 1 to n, whose kth bits
	// are 1. The result will be one of X and Y.

	void printRepeating4(int arr[], int size) {
		/* Will hold xor of all elements */
		int xor = arr[0];

		/* Will have only single set bit of xor */
		int set_bit_no;

		int i;
		int n = size - 2;
		int x = 0, y = 0;

		/* Get the xor of all elements in arr[] and {1, 2 .. n} */
		for (i = 1; i < size; i++)
			xor ^= arr[i];
		for (i = 1; i <= n; i++)
			xor ^= i;

		/* Get the rightmost set bit in set_bit_no */
		set_bit_no = (xor & ~(xor - 1));

		/*
		 * Now divide elements in two sets by comparing rightmost set bit of xor with
		 * bit at same position in each element.
		 */
		for (i = 0; i < size; i++) {
			int a = arr[i] & set_bit_no;
			if (a != 0)
				x = x ^ arr[i]; /* XOR of first set in arr[] */
			else
				y = y ^ arr[i]; /* XOR of second set in arr[] */
		}
		for (i = 1; i <= n; i++) {
			int a = i & set_bit_no;
			if (a != 0)
				x = x ^ i; /* XOR of first set in arr[] and {1, 2, ...n } */
			else
				y = y ^ i; /* XOR of second set in arr[] and {1, 2, ...n } */
		}

		System.out.println("The two reppeated elements are :");
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		RepeatElement repeat = new RepeatElement();
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr_size = arr.length;
		repeat.printRepeating1(arr, arr_size);
	}

}
