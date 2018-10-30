package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SumOddFrequency {

	public static void main(String[] args) {

		LinkedHashMap<Integer, Integer> freq = new LinkedHashMap();

		int arr[] = { 10, 20, 20, 10, 40, 40, 10 };
	//	int arr[] = {1, 1, 2, 2, 3, 3, 3};
	//	int arr[] = {10, 20, 30, 40, 40};

		int n = arr.length;
		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			if (freq.containsKey(arr[i]))
				freq.put(arr[i], freq.get(arr[i]) + 1);
			else
				freq.put(arr[i], 1);
		}

		List<Integer> allOdds = new ArrayList<Integer>();
		for(int key: freq.keySet()) {
			if(freq.get(key) % 2 == 1 ) {
				allOdds.add(key);
			}
		}
		
		int sum = 0;		
		for(Integer ans: allOdds) {
			sum += (ans * freq.get(ans));			
		}
		System.out.println(sum);

	}

}
