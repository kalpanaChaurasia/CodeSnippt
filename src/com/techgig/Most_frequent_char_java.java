package com.techgig;

import java.util.HashMap;
import java.util.Map;

public class Most_frequent_char_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "FFBBBBF";
		Map<String, Long> charCount = new HashMap<>();
		for (char charcter : sentence.toCharArray()) {
			String charAsString = Character.toString(charcter);
			System.out.println(charAsString);
			if (charCount.containsKey(charAsString)) {
				long val = charCount.get(charAsString) + 1;
				charCount.put(charAsString, val);
			} else {
				charCount.put(charAsString, 1L);
			}
		}
		System.out.println(charCount);
	}

}
