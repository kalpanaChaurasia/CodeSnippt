package com.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MinimumLengthAndIndex {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String output;
		int ip1_size = 0;
		ip1_size = Integer.parseInt(in.nextLine().trim());
		int[] ip1 = new int[ip1_size];
		int ip1_item;
		for (int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
			ip1_item = Integer.parseInt(in.nextLine().trim());
			ip1[ip1_i] = ip1_item;
		}
		int ip2_size = 0;
		ip2_size = Integer.parseInt(in.nextLine().trim());
		int[] ip2 = new int[ip2_size];
		int ip2_item;
		for (int ip2_i = 0; ip2_i < ip2_size; ip2_i++) {
			ip2_item = Integer.parseInt(in.nextLine().trim());
			ip2[ip2_i] = ip2_item;
		}
		output = minimumLengthAndIndex(ip1, ip2);
		System.out.println(String.valueOf(output));
	}

	public static String minimumLengthAndIndex(int[] input1, int[] input2) {
		int indexCount = 0;
		// int[] indexs = new int[input2.length];
		HashMap<Integer, HashSet<Integer>> Disc = new HashMap<>();

		int index = 0;
		for (int j = 0; j < input2.length; j++) {
			HashSet<Integer> ind = new HashSet<>();
			for (int i = 0; i < input1.length; i++) {
				index++;
				if (input1[i] == input2[j]) {
					ind.add(i);
				}
			}
			Disc.put(j, ind);
			index = 0;
		}
		
		for (Integer name: Disc.keySet()){
	        System.out.println(Disc.get(name).toString());
		} 
		return Disc.get(0).toString();
	}
}
