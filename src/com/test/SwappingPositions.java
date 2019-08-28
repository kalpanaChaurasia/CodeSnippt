package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//You are given two strings s and t of length n. You can select any two positions (can be from the same or different strings) and 
//swap the characters at those two positions. You have to perform this operation exactly once in such a way that there exists maximum 
//one position i(1<=i<=n)  such that si != ti. 
//Determine whether it is possible to perform the operation such that the given condition holds or not.
//
//Input format
//
//First line: A single integer T  that denotes the number of test cases 
//For each test case:
//First line: An integer  n
//Next two lines: Strings s  and t respectively
//Output format
//
//For each test case, print YES if a valid operation exists otherwise print NO in a single line.
//
//Input constraints
// 1 <= T <= 50
// 1 <= n <= 10 ^ 3
//
//Both the strings  and  contain only lowercase English alphabets
//2
//8
//mrxismrx
//mryismry
//8
//iamnomrx
//iamdamry
//
//Explanation
//In the first test case, we can get a valid result by swapping the characters  and  (1 based indexing).

public class SwappingPositions {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		if (T > 50) {
			return;
		}

		for (int k = 0; k < T; k++) {
			int n = s.nextInt();
			String val1 = s.next();
			String val2 = s.next();
			System.out.println(areMetaStringNew(n, val1, val2) ? "Yes" : "No");
		}
		
		// for (int i = 0; i < indexs.size(); i++) {
		// for (int j = i + 1; j < indexs.size(); j++) {
		// if (first[indexs.get(i)] == first[indexs.get(j)]) {
		// c1++;
		// }
		//
		// if (sec[indexs.get(i)] == sec[indexs.get(j)]) {
		// c2++;
		// }
		// }
		// }



	}

	public static void swap(char S, char T) {

	}

	private static boolean areMetaStringNew(int n, String val1, String val2) {
		if (val1.length() != val2.length()) {
			return false;
		}

		char[] first = val1.toCharArray();
		char[] sec = val2.toCharArray();

		ArrayList<Integer> indexs = new ArrayList<>();
		for (int i = 0; i < first.length; i++) {
			if (first[i] != sec[i]) {
				indexs.add(i);
			}
		}

		if (indexs.size() > 3) {
			return false;
		} else {
			if (indexs.size() <= 1) {
				return true;
			} else {				
				int c1 = 0, c2 = 0, c3 = 0;
				for (int i = 0; i < indexs.size(); i++) {
					System.out.println(""+indexs.get(i));
					for (int j = i; j < indexs.size(); j++) {
						if (first[indexs.get(i)] == sec[indexs.get(j)]) {
							c3++;
						}
						if (j < indexs.size()-1) {
							if (first[indexs.get(i)] == first[indexs.get(j + 1)]) {
								c1++;
							}

							if (sec[indexs.get(i)] == sec[indexs.get(j + 1)]) {
								c2++;
							}
						}
					}
				}	
				
				System.out.println("c1 "+c1);
				System.out.println("c2 "+c2);
				System.out.println("c3 "+c3);

				if ((c1 == c2 && c1 != 0 && c2 != 0) || c3 == indexs.size()-1) {
					return true;
				} else {
					return false;
				}

			}
		}
	}

	private static boolean editDist(char[] first, char[] sec, int i, int j) {
		int count = 0;
		if (first[i] != sec[j]) {
			count++;
		}
		if (first[i] != first[j]) {
			count++;
		}
		if (count > 1) {
			return editDist(first, sec, j, i);
		}
		return true;
	}

	private static boolean areMetaString3(int n, String val1, String val2) {
		if (val1.length() != val2.length()) {
			return false;
		}

		char[] first = val1.toCharArray();
		char[] sec = val2.toCharArray();

		HashMap<Integer, Character> map = new HashMap<>();
		for (int i = 0; i < first.length; i++) {
			if (first[i] != sec[i]) {
				map.put(i, first[i]);
			}
		}

		if (map.size() > 2) {
			return false;
		} else if (map.size() <= 1) {
			return true;
		} else {
			StringBuilder sb = new StringBuilder(val2);
			for (Map.Entry m : map.entrySet()) {
				if (val2.indexOf((char) m.getValue()) != -1) {
					break;
				}
				// sec[(int) m.getKey()] = (char) m.getValue();

				sb.setCharAt((int) m.getKey(), (char) m.getValue());
			}
			if (val1.equalsIgnoreCase(sb.toString()))
				return true;
			else
				return false;
		}

	}

	private static boolean areMetaString(int n, String val1, String val2) {
		if (val1.length() != val2.length()) {
			return false;
		}

		char[] first = val1.toCharArray();
		char[] sec = val2.toCharArray();

		HashMap<Integer, Character> map = new HashMap<>();
		for (int i = 0; i < first.length; i++) {
			if (first[i] != sec[i]) {
				map.put(i, first[i]);
			}
		}

		if (map.size() > 2) {
			return false;
		} else {
			StringBuilder sb = new StringBuilder(val2);
			for (Map.Entry m : map.entrySet()) {
				// sec[(int) m.getKey()] = (char) m.getValue();

				sb.setCharAt((int) m.getKey(), (char) m.getValue());
			}
			if (val1.equalsIgnoreCase(sb.toString()))
				return true;
			else
				return false;
		}

	}

	// wrong
	private static boolean areMetaString2(int n, String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();

		// Return false if both are not of equal length
		if (len1 != len2)
			return false;

		// To store indexes of previously mismatched
		// characters
		int prev = -1, curr = -1;
		StringBuilder sb = new StringBuilder(str2);
		int count = 0;
		for (int i = 0; i < len1; i++) {
			// If current character doesn't match
			if (str1.charAt(i) != str2.charAt(i)) {
				// Count number of unmatched character
				count++;

				// If unmatched are greater than 2,
				// then return false
				if (count > 2)
					return false;

				// Store both unmatched characters of
				// both strings
				prev = curr;
				curr = i;
				sb.setCharAt(i, str1.charAt(i));
			}
		}
		// System.out.println(prev + " - " + curr);

		// Check if previous unmatched of string1
		// is equal to curr unmatched of string2
		// and also check for curr unmatched character,
		// if both are same, then return true
		return (count <= 2 && str1.equalsIgnoreCase(sb.toString()));

	}

}
