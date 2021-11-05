package com.array;

import java.util.ArrayList;

public class ArrayTst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList list = new ArrayList();
	       list.add("Alice");
	       list.add(Boolean.TRUE);
	       list.add(1, "bob");
	       list.remove("true");
	       list.add(1,"mike");
	       list.add(4, "Tara");
	       System.out.println(list);
	}

}
