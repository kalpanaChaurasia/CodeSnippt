package com.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TransformedPalindrome {

	// The first line contains three space separated integers , and . The following
	// lines each contain two space separated integers and , denoting a
	// transformation from letter to letter . The last line contains positive
	// integers (elements of the string).
	// 10 7 6
	// 1 3
	// 5 7
	// 3 5
	// 2 6
	// 2 4
	// 8 4
	// 10 9
	// 1 9 2 3 10 3
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//in.nextLine();
		int m = in.nextInt();
	//	in.nextLine();
		int r = in.nextInt();
		//in.nextLine();
		int[] a = new int[m];
		int[] b = new int[m];
		for (int a0 = 0; a0 < m; a0++) {
			a[a0] = in.nextInt();
			b[a0] = in.nextInt();
		}

	//	in.nextLine();
	//	int r = in.nextInt();
	//	in.nextLine();

		int[] I = new int[r];
		for (int a_i = 0; a_i < r; a_i++) {
			I[a_i] = in.nextInt();			
		}

		if (isPalindrome(I)) {
			System.out.println(String.valueOf(I.length));
		} else {
			int output = traversePalindrome(I, a, b);
			System.out.println(String.valueOf(output));
		}

	}

	public static boolean isPalindrome(int[] value) {
		if (null == value)
			return false;

		for (int i = 0; i < value.length / 2; ++i) {
			if (value[i] != value[value.length - 1 - i]) {
				return false;
			}
		}

		// for (int i = 0, j = value.length-1; i < j; i++, j--) {
		// if (value[i] != value[j]) {
		// return false;
		// }
		// }

		return true;
	}

	public static int traversePalindrome(int[] I, int[] a, int[] b) {
		for (int i = 0, j = I.length - 1; i < j;) {
			if (I[i] != I[j]) {
				for (int as = 0; as < a.length; as++) {
					if (a[as] == I[i]) {
						I[i] = b[as];
						break;
					} else if (b[as] == I[i]) {
						I[i] = a[as];
						break;
					}
				}
			}
			i++;
			j--;
		}

		int[] newarr = possiblePlainByRemovingOneNum(I);

		return newarr.length;
	}

	public static int[] possiblePlainByRemovingOneNum(int[] I) {
		int low = 0, high = I.length - 1;
		int[] newarr = null;
		while (low < high) {
			if (I[low] == I[high]) {
				low++;
				high--;
			} else {
				newarr = removeElt(I, low);
				// System.out.println(Arrays.toString(newarr));
				if (isPalindrome(newarr)) {
					break;
				} else {
					newarr = removeElt(I, high);
					if (isPalindrome(newarr)) {
						break;
					}
				}
			}
		}

		return newarr;
	}

	public static int[] removeElt(int[] arr, int remIndex) {

		 System.out.println(Arrays.toString(arr));

		List<Integer> intList = new ArrayList<Integer>();
		for (int i : arr) {
			intList.add(i);
		}

		intList.remove(remIndex);

		int[] newarr = new int[intList.size()];
		for (int i = 0; i < intList.size(); i++) {
			newarr[i] = intList.get(i);
		}

		 System.out.println(Arrays.toString(newarr));

		return newarr;
	}
}