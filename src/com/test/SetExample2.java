package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class SetExample2 {

//Set is an interface which extends Collection. It is an unordered collection of objects in which duplicate values cannot be stored.
//Basically, Set is implemented by HashSet, LinkedSet or TreeSet (sorted representation).
//	Set has various methods to add, remove clear, size, etc to enhance the usage of this interface
	
	public static void main(String[] args) {
		

		//set denostartion using hashset
		
		List<String> listAray = new ArrayList<String>();
		listAray.add("Geeks");
		listAray.add("For");
		listAray.add("Geeks");
		listAray.add("Example");
		listAray.add("Set");
		listAray.add("Set");
		listAray.add("Example");
		
		Set<String> hash_set = new HashSet<String>();
//		hash_set.addAll(listAray);
		hash_set.add("Geeks");
		hash_set.add("For");
		hash_set.add("Geeks");
		hash_set.add("Example");
		hash_set.add("Set");
		hash_set.add("Sasdasdsdet");
		hash_set.add("sdExampadle");
		
//		hash_set.retainAll(listAray);
		
		System.out.println(hash_set);
		
		hash_set.removeAll(listAray);
		
		
		System.out.println(hash_set);
		
//		TreeSet<String> tree_set = new TreeSet<String>();
//		tree_set.addAll(hash_set);
//		System.out.println(tree_set);
		
		
//		
//		
//		Set<Integer> a = new HashSet<Integer>();
//		a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
//		
//		Set<Integer> b = new HashSet<Integer>();
//		b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));
//		
//		//Union
//		
//		Set<Integer> unionSet = new HashSet<Integer>(a);
//		unionSet.addAll(b);
//		
//		System.out.print("Union of the two Set");
//	    System.out.println(unionSet);
//	    
//	    Set<Integer> intersection = new HashSet<Integer>(a);
//	    intersection.retainAll(b);
//	    
//	    System.out.print("Intersection of the two Set");
//        System.out.println(intersection);
// 
//        Set<Integer> differences = new HashSet<Integer>(a);
//        differences.removeAll(b);
//        
//        System.out.print("Difference of the two Set");
//        System.out.println(differences);
		
	}
	
	
	static Comparator descComp = new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}
	};
	
}
