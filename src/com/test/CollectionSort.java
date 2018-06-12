package com.test;

import java.util.ArrayList; 
import java.util.Collections; 

public class CollectionSort {

	public static void main(String args[]) { 
	    
        //Creating and populating ArrayList in Java for Sorting 
        ArrayList<String> unsortedList = new ArrayList<String>(); 
        
        unsortedList.add("YATINMULTILAGNAGUE"); 
        unsortedList.add("SYNCTIMESADA"); 
        unsortedList.add("SYNCTIMEESHWAR"); 
        unsortedList.add("VEGETABLES"); 

     //   System.err.println("unsorted ArrayList in Java : " + unsortedList); 
        
        //Sorting ArrayList in ascending Order in Java 
        Collections.sort(unsortedList); 
        System.out.println("\nSorted ArrayList in Java - Ascending order : " + unsortedList); 
        
        //Sorting ArrayList in descending order in Java 
        Collections.sort(unsortedList, Collections.reverseOrder()); 
        System.err.println("\nSorted ArrayList in Java - Descending order : " + unsortedList); 
    } 


}
