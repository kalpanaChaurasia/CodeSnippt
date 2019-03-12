package com.test;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		String name = "kalpanan";

		char[] nameChar = name.toCharArray();
		HashMap<Character, Integer> cntMap = new HashMap<>();
		String newStr = new String();

		for (int i = 0; i < nameChar.length; i++) {
			if (cntMap.containsKey(nameChar[i])) {
				cntMap.put(nameChar[i], cntMap.get(nameChar[i]) + 1);
			} else {
				cntMap.put(nameChar[i], 1);
			}

			
			if (newStr.indexOf(nameChar[i]) < 0) {
				newStr += nameChar[i];
			}
		}

		// print
		Set<Character> keys = cntMap.keySet();
		for (Character ch : keys) {
			if (cntMap.get(ch) > 1) {
				System.out.println(ch + "--->" + cntMap.get(ch));
			}
		}

		System.out.println("Removed duplicate=> " + newStr);
	}

	// second way

	public void findDuplicateChars(String ch) {
		int count = 0, len = 0;
		do {
			try {
				char name[] = ch.toCharArray();
				len = name.length;
				count = 0;
				for (int j = 0; j < len; j++) {
					if ((name[0] == name[j]) && ((name[0] >= 65 && name[0] <= 91) || (name[0] >= 97 && name[0] <= 123)))
						count++;
				}
				if (count != 0)
					System.out.println(name[0] + " " + count + " Times");
				ch = ch.replace("" + name[0], "");
			} catch (Exception ex) {
			}
		} while (len != 1);
	}

}
