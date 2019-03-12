package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<String, Integer> personInfo = new HashMap();
		ArrayList<String> query = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			personInfo.put(name, phone);

		}
		while (in.hasNext()) {
			String s = in.next();
			query.add(s);			
		}
		
		
		for (int i = 0; i < query.size(); i++) {
			if (personInfo.containsKey(query.get(i))) {
				Integer num = personInfo.get(query.get(i));
				System.out.println(query.get(i)+"="+num);
			}else {
				System.out.println("Not found");
			}
		}
		
		in.close();

	}

}
