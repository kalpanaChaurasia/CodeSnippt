package com.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
	     al.add("Ajay");
	     al.add("Becky");
	     al.add("Chaitanya");
	     al.add("Ajay");
	     al.add("Rock");
	     al.add("Becky");
	     
	     System.out.println("Before ArrayList contains: "+al);
	     
	     LinkedHashSet<String> linkedSet = new LinkedHashSet();
	     linkedSet.addAll(al);
	     
	     al.clear();
	     
	     al.addAll(linkedSet);
	     
	     System.out.println("After ArrayList contains: "+al);
	}

}
