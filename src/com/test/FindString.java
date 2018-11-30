package com.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindString {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int output = 0;
		String ip1 = in.nextLine().trim();
		String ip2 = in.nextLine().trim();
		output = oneInAnother(ip1, ip2);
		System.out.println(String.valueOf(output));
	}

	public static int oneInAnother(String input1, String input2) {
		char[] char2 = input2.toCharArray();
		List<Integer> indexs = new ArrayList<Integer>();
		for (int i = 0; i < char2.length; i++) {
			int ind = input1.indexOf(char2[i]);
			if (ind != -1)
				indexs.add(ind);
		}
		Collections.sort(indexs);
		return indexs.get(0);
	}
}
