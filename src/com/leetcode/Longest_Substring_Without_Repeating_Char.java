package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Char {

	public static void main(String[] args) {
		String s = "pwwkew";

		int ans = 0;

		Map<Character, Integer> map = new HashMap<>();

		for (int j = 0, i=0; j < s.length(); j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j + 1);	
		}
//		Set set =	map.keySet();	
//		
//		System.out.println("" + set.toString());
		
		System.out.println("" + ans);

	}

}
