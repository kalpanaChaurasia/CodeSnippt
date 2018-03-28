package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Surpasser {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int[] output = null;
		int ip1_size = 0;
		ip1_size = Integer.parseInt(in.nextLine().trim());
		int[] ip1 = new int[ip1_size];
		int ip1_item;
		for (int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
			ip1_item = Integer.parseInt(in.nextLine().trim());
			ip1[ip1_i] = ip1_item;
		}
		output = countForSurpasser(ip1);
		for (int output_i = 0; output_i < output.length; output_i++) {
			System.out.println(String.valueOf(output[output_i]));
		}
	}

	public static int[] countForSurpasser(int[] input1) {
		System.out.println("length : "+input1.length);
		int[] output = new int[input1.length];
		HashMap<Integer, Integer> hm = new HashMap<>();
//		for (int i = 0; i < input1.length; i++) {			
//			int count = 0;
//			for (int j = i + 1; j < input1.length; j++) {
//				if (input1[j] > input1[i]) {
//					count++;
//				}
//			}
//			output[i] = count;
//		}
		//Merge sort
		int[] tmp = new int[input1.length];
		mergeSort(input1, tmp,  0,  input1.length - 1, hm);
		
		
		 for (int i = 0; i < input1.length; i++){
			 output[i] = ( (input1.length - 1) - i - hm.get(input1[i]));
		 }
		
		//third
		
//		 Queue<Integer> queue = new PriorityQueue<Integer>();
//	        Stack<Integer> stack = new Stack<Integer>();
//	 
//	        for ( int i = input1.length -1; i >= 0; i-- ){
//	            while (!queue.isEmpty()) {
//	                if (queue.peek() > input1[i]) {
//	                    output[i] = queue.size();
//	                    break;
//	                } else {
//	                    stack.push(queue.remove());
//	                }
//	            }
//	            if (queue.isEmpty())
//	                output[i]=0;
//	 
//	            while (!stack.isEmpty()){
//	                queue.add(stack.pop());
//	            }
//	 
//	            queue.add(input1[i]);
//	        } 
	     
		return output;
	}

	


	
	private static void mergeSort(int[ ] a, int[ ] tmp, int left, int right,HashMap<Integer, Integer> hm )
	{
//		length : 7
//		0 : 6
//		center : 2
//		3 : 4
//		0 : 2 : 6
		if( left < right )
		{
			int center =left + (right- left) / 2;			
			mergeSort(a, tmp, left, center, hm);
			mergeSort(a, tmp, center + 1, right, hm);
			merge(a, tmp, left, center, right, hm);
		}
	}
	 
	 private static void merge(int[ ] arr, int[ ] tmp, int l, int m, int r ,HashMap<Integer, Integer> hm )
	    {
	        int n1 = m - l + 1;	    
	        int n2 = r - m;
	        int c = 0, i = 0, j = 0, k = l;
	    
	        System.out.println(n1+" : "+n2);
	        System.out.println(l+" : "+m+ " : "+r);
	        
	        /* create temp arrays */
	        int[] L = new int[n1];
	        int[] R = new int[n2];
	     
	        /* Copy data to temp arrays L[] and R[] */
	        for (i = 0; i < n1; i++)
	            L[i] = arr[l + i];
	     
	        for (j = 0; j < n2; j++)
	            R[j] = arr[m + 1 + j];
	               

	       
	       
	        while (i < n1 && j < n2)
	        {
	            if (L[i] <= R[j])
	            {
	                // increment inversion count of L[i]
	            	hm.put(L[i], L[i]+c);	                
	                arr[k++] = L[i++];
	            }
	            else
	            {
	                arr[k++] = R[j++];
	     
	                // inversion found
	                c++;
	            }
	        }
	     
	        /* Copy the remaining elements of L[], if
	        there are any */
	        while (i < n1)
	        {
	        	hm.put(L[i], L[i]+c);	  
	            arr[k++] = L[i++];
	        }
	     
	        /* Copy the remaining elements of R[], if
	        there are any */
	        while (j < n2)
	            arr[k++] = R[j++];
	        
	        
	       
	    }

}
