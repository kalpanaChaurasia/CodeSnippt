package com.test;

public class OccurrencesOfChar {
	// Function to count the character 'a'
	static int countChar(String str, char x) {
		int count = 0;
		int n = 10;
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) == x)
				count++;

		// atleast k repetition are required
		int repititions = n / str.length();
		count = count * repititions;

		// if n is not the multiple of the
		// string size check for the remaining
		// repeating character.
		for (int i = 0; i < n % str.length(); i++) {
			if (str.charAt(i) == 'a')
				count++;
		}

		return count;
	}

	// Driver code
	public static void main(String args[]) {
		String str = "abcac";
		System.out.println(countChar(str, 'a'));
	}
}
