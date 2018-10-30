/**
 * 
 */
package com.test;

import java.util.TreeSet;

/**
 * @author kalpana.c
 *
 */
public class TreeSetSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<String> ts1= new TreeSet<String>();
		 
	        // Elements are added using add() method
	        ts1.add("A");
	        ts1.add("B");
	        ts1.add("C");
	 
	        // Duplicates will not get insert
	        ts1.add("C");
	 
	        // Elements get stored in default natural
	        // Sorting Order(Ascending)
	        System.out.println(ts1); 
	}

}
