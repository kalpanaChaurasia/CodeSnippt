package com.techgig;

import java.util.ArrayList;
import java.util.Scanner;

public class StatusOfUnity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		if (t < 0 || t > 100) {
			return;
		}

		ArrayList<String> arrStr = new ArrayList<>();
		ArrayList<String> ans = new ArrayList<>();

		for (int i = 0; i < t; i++) {
			arrStr.add(sc.next());
		}

		for (int i = 0; i < arrStr.size(); i++) {
			int fwdCnt = 0;
			int bakCnt = 0;
			char[] chars = arrStr.get(i).toCharArray();

			for (int j = 0; j < chars.length - 1; j++) {
				if (chars[j] != chars[j + 1]) {
					if (chars[j] == 'F') {
						fwdCnt++;
					} else {
						bakCnt++;
					}
				}
			}
			if (chars[chars.length - 1] == 'F') {
				fwdCnt++;
			} else {
				bakCnt++;
			}

			if (fwdCnt > bakCnt) {
				ans.add("B");
			} else if (fwdCnt < bakCnt) {
				ans.add("F");
			} else {
				if (chars[0] == 'F') {
					ans.add("F");
				} else {
					ans.add("B");
				}
			}
		}

		for (int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}

	}

}
