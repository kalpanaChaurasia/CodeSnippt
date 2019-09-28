package com.test;

import java.util.Scanner;
import java.util.*;

//INPUT
/*2
gqtrawq
fnaxtyyzz*/

//OUTPUT

//q
//y

public class Savethecity {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> output = new ArrayList();
		
		if (n < 0 || n > 10) {
			return;
		}

		for(int i=0; i<n; i++) {
			HashMap<Character,Integer> hashCompare = new HashMap();
			HashMap<Integer,ArrayList<Character>> saveLatestHash = new HashMap();
			String val = sc.next();
			char[] valChar = val.toCharArray();
			for(int j=0; j<valChar.length; j++) {
				if(hashCompare.containsKey(valChar[j])) {
					hashCompare.put(valChar[j], hashCompare.get(valChar[j])+1);
				}else {
					hashCompare.put(valChar[j], 1);
				}				
			}	
			
			  // Printing the charCountMap 
			
			//ArrayList<Character> charArr = new ArrayList<>();
	        for (Map.Entry entry : hashCompare.entrySet()) { 
	        	if(saveLatestHash.containsKey(entry.getValue())) {
	        		ArrayList<Character> charArr1 = saveLatestHash.get((Integer)entry.getValue());
	        		charArr1.add((Character)entry.getKey());
	        		saveLatestHash.put((Integer)entry.getValue(), charArr1);
				}else {
					ArrayList<Character> charArr = new ArrayList<>();
					charArr.add((Character)entry.getKey());
					saveLatestHash.put((Integer)entry.getValue(), charArr);
				}		           
	        } 
	        
	        //Ascending order
	     //   Map<Integer,ArrayList<Character>> sortyByKeymap = new TreeMap<Integer,ArrayList<Character>>(saveLatestHash); 
	       
	        //Descending order
	        Map<Integer,ArrayList<Character>> sortyByKeymap = new TreeMap<Integer,ArrayList<Character>>(Collections.reverseOrder());
	        sortyByKeymap.putAll(saveLatestHash);
	        
	        List keys = new ArrayList(sortyByKeymap.keySet());  
	        
	        ArrayList<Character> charArr = sortyByKeymap.get((Integer) keys.get(0));
	        Collections.sort(charArr);
	        
	        System.out.println(charArr.get(0));
	        
//	        for (Map.Entry entry : sortyByKeymap.entrySet()) { 
//	        	 System.out.println(entry.getKey() + " " + entry.getValue()); 
//	        }
	        
	        
	      
		}

	}
	
	//Map<Character,Integer> map = new TreeMap<Character,Integer>(hashCompare); 
			//	Map<Character,Integer> map = sortByValues(hashCompare); 
				
//				HashMap<Character,Integer> sorted = hashCompare
//				        .entrySet()
//				        .stream()
//				        .sorted(comparingByValue())
//				        .collect(
//				            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
//				                LinkedHashMap::new));
				 
				
	
	private static HashMap sortByValues(HashMap map) { 
	       List list = new LinkedList(map.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o2)).getValue())
	                  .compareTo(((Map.Entry) (o1)).getValue());
	            }
	       });

	       // Here I am copying the sorted list in HashMap
	       // using LinkedHashMap to preserve the insertion order
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap;
	  }

}
