package com.array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayTst3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList list = new ArrayList();
	       list.add("Alice");
	       list.add("bob");	  
	       list.add(1,"mike");
	       list.add(3, "Tara");
	      
	       
	       list.remove(3);
	       list.remove("Tara");
	       System.out.println(list);
	       
//	       Iterator<String> itr = list.iterator();
//	       while(itr.hasNext()) {
//	    	   System.out.println(itr.next());
//	       }
	       
	}

}
