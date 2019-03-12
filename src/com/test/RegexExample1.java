package com.test;

import java.util.regex.Pattern;

public class RegexExample1 {

	public static void main(String[] args) {
		String text = "~~abc~def~";
		// Pattern for delimiter
		String patternString = "~";
		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
		String[] myStrings = pattern.split(text);
		for (String temp : myStrings) {
			System.out.println(temp);
		}
		System.out.println("Number of split strings: " + myStrings.length);

	}

}
