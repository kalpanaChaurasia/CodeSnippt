package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* Java String Token
Given a string, find number of words in that string. For this problem a word is defined by a string of one or more 
english alphabets.
There are multiple ways to tokenize a string in java, learn how to tokenize a string in java and demonstrate your 
skill by solving this problem!
Input Format
A string not more than 400000 characters long. The string can be defined by following regular expression:
[A-Za-z !,?.\_'@]+
That means the string will only contain english alphabets, blank spaces and this characters: "!,?._'@".
Output Format
In the first line, print number of words n in the string. The words don't need to be unique. In the next n lines, 
print all the words you found in the order they appeared in the input.
Sample Input
He is a very very good boy, isn't he?
Sample Output
10
He
is
a
very
very
good
boy
isn
t
he
*/
public class StringTokenSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = "He is a very very good boy, isn't he?";
		if (s.trim().isEmpty()) {
			System.out.println("0");
			System.out.println(s);
		} else {
			String[] splitString = (s.replaceAll("^\\W+", "").split("[\\s!,?._'@]+"));
			System.out.println(splitString.length);

			for (String string : splitString) {
				System.out.println(string);
			}
		}
		method2(sc);
		
	}

	private static void method2(Scanner sc) {
		if (!sc.hasNext()) {
			System.out.println(0);
		} else {
			String input = sc.nextLine();
			String[] a = input.trim().split("[ !,?._'@]+");
			ArrayList<String> listOfStrings = new ArrayList<String>(Arrays.asList(a));
			System.out.println(listOfStrings.size());

			for (String str : listOfStrings) {
				System.out.println(str);
			}
		}
	}
}
