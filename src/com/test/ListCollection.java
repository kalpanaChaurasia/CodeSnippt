package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listAray = new ArrayList<String>();
		listAray.add("Geeks");
		listAray.add("For");
		listAray.add("Geeks");
		listAray.add(null);
		listAray.add("Example");
					
		System.out.println("listAray =>"+listAray);
		
		LinkedList linkedListArray = new LinkedList<String>();
		linkedListArray.add("Geeks");
		linkedListArray.add("For");
		linkedListArray.add("Geeks");
		linkedListArray.add(null);
		linkedListArray.add("Example");
		
		System.out.println("linkedListArray =>"+linkedListArray);
	}

}
