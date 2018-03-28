package com.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int output = 0;
		int ip1 = Integer.parseInt(in.nextLine().trim());
		int ip2 = Integer.parseInt(in.nextLine().trim());
		String ip3 = in.nextLine().trim();
		String ip4 = in.nextLine().trim();
		output = appearanceCount(ip1, ip2, ip3, ip4);
		System.out.println(String.valueOf(output));
	}

	public static int appearanceCount(int input1, int input2, String input3,
			String input4) { 
		   Map<Character, Integer> occurencesMap = new HashMap<>();
		    char[] chars = input3.toCharArray();
		    for (char c : chars) {
		        if (occurencesMap.containsKey(c)) {
		            occurencesMap.put(c, occurencesMap.get(c) + 1);
		        } else {
		            occurencesMap.put(c, 1);
		        }
		    }
		   // System.out.println(""+occurencesMap.toString());
		    
		    int matchCount = 0;
		    int count = 0;
		    char[] sChars = input4.toCharArray();
		    for (int i = 0; i < sChars.length; i++) {
		        char c = sChars[i];
		        if (occurencesMap.containsKey(c) && occurencesMap.get(c) > 0) {
		            count++;
		            occurencesMap.put(c, occurencesMap.get(c) - 1);
		        }

		        if (i >= input1) {
		            if (count == input1) {
		                matchCount++;
		                System.out.println("Match found @ " + i + ": " + input4.subSequence(i - input1 + 1, i + 1));
		            }
		            System.out.println("i "+i);
		            char nextCharToRemove = input4.charAt(i - input1+1);
		        //    System.out.println("nextCharToRemove "+nextCharToRemove);
		            if (occurencesMap.containsKey(nextCharToRemove)) {
		                count--;
		                occurencesMap.put(nextCharToRemove, occurencesMap.get(nextCharToRemove) + 1);
		            }
		        }
		    }
		return matchCount;
	}
}
