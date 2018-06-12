package com.test;

import java.util.*;

public class ListInterfaceExample {

	public static void main(String[] args) {
		List<String> listStrings = new ArrayList<String>();
		listStrings.add(null);
		listStrings.add("");
		listStrings.add("One");
		listStrings.add("Two");
		listStrings.add("Three");
		listStrings.add("Four");
		listStrings.add("Four");
		listStrings.add("");
		listStrings.add(null);
		System.out.println(listStrings);
		
		Iterator<String> it = listStrings.iterator();
		
		LinkedList<String> linkedlistStrings = new LinkedList<String>();
		linkedlistStrings.add(null);
		linkedlistStrings.add("");
		linkedlistStrings.add("Five");
		linkedlistStrings.add("Six");
		linkedlistStrings.add("Seven");
		linkedlistStrings.add("Eight");
		linkedlistStrings.add("Eight");
		linkedlistStrings.add("");
		linkedlistStrings.add(null);
		System.out.println(linkedlistStrings);
	}
}
