package com.array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayTst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList list = new ArrayList();
	       list.add("Alice");
	       list.add("bob");	  
	       list.add(3,"mike");
	       list.add("Lisa");
	      // System.out.println(list);
	       
	       Iterator<String> itr = list.iterator();
	       while(itr.hasNext()) {
	    	   System.out.println(itr.next());
	       }
	       
	}

}
