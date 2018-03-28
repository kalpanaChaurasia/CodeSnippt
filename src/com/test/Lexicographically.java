package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lexicographically {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		ArrayList<String> stringArray = new ArrayList<>();

		for (int i = 1; i <= m; i++) {
			stringArray.add(scanner.next());
		}
		
		System.out.println(String.valueOf(stringArray.size()));
		
		
		Collections.sort(stringArray);

		for (int i = 0; i < stringArray.size(); i++) {
			System.out.println(stringArray.get(i));
		}
	}
}
