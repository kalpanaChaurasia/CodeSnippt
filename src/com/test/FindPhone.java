package com.test;

import java.util.HashMap;
import java.util.Scanner;

public class FindPhone {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		HashMap<String, Integer> allmap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			allmap.put(name, phone);
			in.nextLine();

		}
		while (in.hasNext()) {
			String s = in.nextLine();
			if (allmap.containsKey(s)) {
				Integer num = allmap.get(s);
				System.out.println(s + "=" + num);
			} else {
				System.out.println("Not found");
			}
		}

	}

}
