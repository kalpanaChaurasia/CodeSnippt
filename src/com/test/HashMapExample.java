package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {

		Double double1 = new Double(1.1);
	    Double double2 = new Double(1.2);
	
	    System.out.println(double1.compareTo(double2));
		
		List<Double> hash1 = new LinkedList();
		hash1.add(10.0);
		hash1.add(30.0);
		hash1.add(50.0);
		hash1.add(70.0);
		
		
		List<Double> hash2 = new LinkedList();
		hash1.add(20.0);
		hash1.add(40.0);
		hash1.add(60.0);
		hash1.add(80.0);
		
		hash1.addAll(hash2);
		
		TreeMap<Double, Double> tree1 = new TreeMap();
		tree1.put(60.0, 25.0);		
		tree1.put(120.0, 25.0);
		tree1.put(180.0, 25.0);
		
		//hash1.addAll(tree1.);
		
		TreeMap<Double, Double> tree2 = new TreeMap();
		tree2.put(60.0, 35.0);		
		tree2.put(120.0, 35.0);
		tree2.put(180.0, 35.0);
		
		//System.out.println(tree1.toString());
		
	
//		hash1.put(240.0, 25.0);
//		hash1.put(300.0, 25.0);
//		hash1.put(360.0, 25.0);
		
		//System.out.println(hash1.toString());
		
		
		//hash1.putAll(tree2);
		
		System.out.println(hash1.toString());
		
//		tree1.putAll(hash1);
//		System.out.println(tree1.toString());
		
	}
}
