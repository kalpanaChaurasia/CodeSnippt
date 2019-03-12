package com.test;

import java.util.*;


/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, 
 * the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Input Format

The first line contains a string denoting . 
The second line contains a string denoting .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Output Format

Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Sample Input 0

anagram
margana
Sample Output 0

Anagrams*/
public class AnagramsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		// scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

	public static boolean isAnagram(String a, String b) {
		// Complete the function

		if (a.length() != b.length()) {
			return false;
		}

		char[] one = a.toLowerCase().toCharArray();
		char[] sec = b.toLowerCase().toCharArray();

		java.util.HashMap<Character, Integer> freq1 = new HashMap<>();
		java.util.HashMap<Character, Integer> freq2 = new HashMap<>();

		for (int i = 0; i < a.length(); i++) {
			if (freq1.containsKey(one[i]))
				freq1.put(one[i], freq1.get(one[i]) + 1);
			else
				freq1.put(one[i], 1);

			if (freq2.containsKey(sec[i]))
				freq2.put(sec[i], freq2.get(sec[i]) + 1);
			else
				freq2.put(sec[i], 1);
		}

		if (freq1.equals(freq2)) {
			return true;
		} else {
			return false;
		}

	}

}
