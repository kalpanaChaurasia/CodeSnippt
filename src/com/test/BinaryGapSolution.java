package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/*A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in 
 * the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 
1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a 
binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary 
gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].*/
public class BinaryGapSolution {
	
//	expected worst-case time complexity is O(log(N)); expected worst-case space complexity is O(1)

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		method1(N);

		// OTHER BEST WAY
		// NOTES:
		// 1. Converting to a binary string and then operating on the string is much slower
		// and more laborious than operating on the bytes directly.
		// 2. There is no need to collect all counts and then take the largest as we can
		// just calculate the largest as we go.
		// 3. Give your class and method appropriate names.
		// 4. Check the precondition that the input is positive in the beginning of the
		// method.

		method2(N);

	}

	public static void method1(int num) {
		String binaryval = Integer.toBinaryString(num);
		System.out.println(binaryval);
		ArrayList<Integer> countsAll = new ArrayList();
		int count = 0;
		for (int i = 0; i < binaryval.length(); i++) {
			if (binaryval.charAt(i) == '0') {
				count += 1;
			} else if (count > 0) {
				countsAll.add(count);
				count = 0;
			}
		}

		if (countsAll.size() > 0) {
			Collections.sort(countsAll, Collections.reverseOrder());
			System.out.println("" + countsAll.get(0));
		} else {
			System.out.println("0");
		}
	}

	public static void method2(int n) {
		if (n <= 0)
			throw new IllegalArgumentException("n must be positive; was " + n);
		final int start = Integer.lowestOneBit(n), end = Integer.highestOneBit(n);
		int curRun = 0, longestRun = 0;
		for (int bitmask = start; bitmask != end; bitmask <<= 1) {
			final int bit = n & bitmask;
			if (bit == 0)
				++curRun;
			else {
				longestRun = Math.max(longestRun, curRun);
				curRun = 0;
			}
		}
		System.out.println("" + Math.max(longestRun, curRun));
	}

}
