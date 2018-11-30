package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class StringPrefix {

//	Two strings  and  comprising of lower case English letters are compatible if they are equal or can be made equal by following this step any number of times:
//
//		Select a prefix from the string  (possibly empty), and increase the alphabetical value of all the characters in the prefix by the same valid amount. For example if the string is  and we select the prefix  then we can convert it to  by increasing the alphabetical value by 1. But if we select the prefix  then we cannot increase the alphabetical value.
//		Your task is to determine if given strings  and  are compatible.
//
//		Input format
//
//		First line: String  
//
//		Next line: String 
//
//		Output format
//
//		For each test case, print  if string  can be converted to string  , otherwise print .

//	Explanation
//	The string  can be converted to  in one move and to  in the next move
	
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String a = br.readLine();
			String b = br.readLine();
			boolean flag = true;

			if (a.length() != b.length())
				flag = false;
			else {
				for (int i = 0; i < a.length(); i++) {
					if (a.charAt(i) > b.charAt(i)) {
						flag = false;
						break;
					}
				}
			}

			if (flag == false)
				System.out.println("NO");
			else
				System.out.println("YES");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
