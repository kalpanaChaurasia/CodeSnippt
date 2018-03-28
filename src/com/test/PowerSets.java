package com.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PowerSets {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int output = 0;
		int ip1_size = 0;
		ip1_size = Integer.parseInt(in.nextLine().trim());
		int[] ip1 = new int[ip1_size];
		int ip1_item;
		for (int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
			ip1_item = Integer.parseInt(in.nextLine().trim());
			ip1[ip1_i] = ip1_item;
		}
		int ip2 = Integer.parseInt(in.nextLine().trim());
		output = subsetToTarget(ip1, ip2);
		System.out.println(String.valueOf(output));
	}


	
	public static Set<Set<Integer>> powerSet(Set<Integer> originalSet) {
		
		 Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
	        if (originalSet.isEmpty()) {
	            sets.add(new HashSet<Integer>());
	            return sets;
	        }
	        List<Integer> list = new ArrayList<Integer>(originalSet);
	        Integer head = list.get(0);
	        Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
	        for (Set<Integer> set : powerSet(rest)) {
	            Set<Integer> newSet = new HashSet<Integer>();
	            newSet.add(head);
	            newSet.addAll(set);
	            sets.add(newSet);
	            sets.add(set);
	        }
	        return sets;
	   
	}
	public static int subsetToTarget(int[] input1, int input2) {
		int n = input1.length;
//		findNumbers(input1, 0, n, input2, "");
		int count = 0;
		
		for(int i=0; i<input1.length; i++){			
			int[] dummy = new int[input1.length];
			for(int j=i; j<input1.length; j++){			
				dummy[j] = input1[i]+input1[j];			
				if(dummy[j] == input2){
					count++;
				}
				if(input1[i] == input2){
					count++;	
				}
			}		
		
		}
		
		
		
//		Set<Integer> originalSet = new HashSet<>();
//		for (int integer : input1) {
//			originalSet.add(integer);
//		}
//			
//		int count = 0;
//		for (Set<Integer> s : powerSet(originalSet)) {
//		     System.out.println(s);
//		     count++;
//		 }
		
		return count;
	}

}
