package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BalanacedExp {

	public static void main(String[] args) {

		// String firstString = "Test123";
		// String secondString = "Test" + 123;

		String firstString = "Test123";
		String secondString = "TEST123";

		if (firstString.equalsIgnoreCase(secondString)) {
			System.out.print("true");
		} else {
			System.out.print("false");
		}

		String text = "One fish, two fish, red fish, blue fish";
		System.out.println(countStringInString("fish", text)); 
		// prints 4 
		System.out.println(countStringInString(",", text)); 
		// prints 3

	}

	public static int countStringInString(String search, String text) {
		Pattern pattern = Pattern.compile(search);
		Matcher matcher = pattern.matcher(text);
		int stringOccurrences = 0;
		while (matcher.find()) {
			stringOccurrences++;
		}
		return stringOccurrences;
	}
}
