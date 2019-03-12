package com.test;

import java.util.*;

/**
 * HashMap - java.util.HashMap class is a Hashing based implementation. 
 * We have key-value pair<key,value>, 
 * Unsynchronized - ie multiple threads can access it simultaneously.
 * 
 * Key points :-
 * 
 * 1. HashMap does not maintain the order. not by key or value, if we need ordered key then we need to use TreeMap
 * 2. Complexity - get/put/containsKey() operations are O(1) in average case but we can't guarantee that since its all depend on 
 * computation
 * 
 * 
 * Features :-
  
  		Hashing is a technique for converting large string into small string. A shorter value helps in indexing and faster searches.
  
  		HashSet also uses HashMap internally- it internally use link list to store key-value pair
  
  		HashMap doesn’t allow duplicate keys but allows duplicate values. That means A single key can’t contain more than 1 value but 
  		more than 1 key can contain a single value.
  
  		HashMap allows null key also but only once and multiple null values.
  
  		This class makes no guarantees as to the order of the map; in particular, it does not guarantee that the order will remain 
  		constant over time. It is roughly similar to HashTable but is unsynchronized.
  
  		HashMap extends an abstract class AbstractMap which also provides an incomplete implementation of Map interface.
  
  		It also implements Cloneable and Serializable interface. K and V in the above definition represent Key and Value respectively. 
  		
  		HashMap is an unordered collection. It does not guarantee any specific order of the elements.
  		
		HashMap is not thread-safe. You must explicitly synchronize concurrent modifications to the HashMap. Or you can use 
		Collections.synchronizedMap(hashMap) 	to get the synchronized version of HashMap.
		
		A value can be retrieved only using the associated key.
		
		HashMap stores only object references. So primitives must be used with their corresponding wrapper classes. Such as int
		will be stored as Integer.
 
  
  
 * Internal Structure of HashMap :-

	HashMap works on principle of hashing. Hashing is a way to assigning a unique code for any variable/object after applying any 
	formula/algorithm on its properties. Each object in java has it’s hash code in such a way that two equal objects must produce the 
	same hash code consistently.
	
	Internally HashMap contains an array of Node and a node is represented as a class which contains 4 fields :

		int hash
		K key
		V value
		Node next	
* 
  
 * Performance of HashMap depends on 2 parameters :-

		Initial Capacity	- Capacity of HashMap when its created (16)
		Load Factor			- Measure that when rehashing should be done. Rehashing is the process to increasing the capacity. 
							- HashMap capacity is multiplied by 2.
							- Most generally preffered load factor value is 0.75 which provides a good deal between time and space costs. 
							- Load factor’s value varies between 0 and 1.
		
 
 * Synchronized HashMap :-
 
 		Map m = Collections.synchronizedMap(new HashMap(...));
 	
 * Time complexity of HashMap :-

		HashMap provides constant time complexity for basic operations, get and put.
		Iteration over HashMap depends on the capacity of HashMap and number of key-value pairs. 
		Basically it is directly proportional to the capacity + size. Capacity is the number of buckets in HashMap. 
		So it is not a good idea to keep high number of buckets in HashMap initially.
		
		
 *
 *
 *
 *

 * @author kalpana.c
 *
 */
public class HashMapExample {

	public static void main(String[] args) {

		int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
		printFreq(arr);
		
		
	}

	// This function prints frequencies of all elements
	static void printFreq(int arr[]) {
		// Creates an empty HashMap
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {
			Integer c = hmap.get(arr[i]);

			// If this is first occurrence of element
			if (hmap.get(arr[i]) == null)
				hmap.put(arr[i], 1);

			// If elements already exists in hash map
			else
				hmap.put(arr[i], ++c);
		}

		// Print result
		for (Map.Entry m : hmap.entrySet())
			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
	}

}
