package com.test;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Print first 20 Fibonacci numbers and their average
 */
public class Fibonacci {

	// The first 20 Fibonacci numbers are:
	// 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
	// The average is 885.5

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		// The first 20 Fibonacci numbers are:
		for (int i = 0; i < 100; i++) {
			System.out.print(fibonacci.fibonacci(i)+" ");
		}
		
		
		fibonacci.fibonacci_while();
	}

	private Map<Integer, BigInteger> memoizeHashMap = new HashMap<>();
	{
		memoizeHashMap.put(0, BigInteger.ZERO);
		memoizeHashMap.put(1, BigInteger.ONE);
		memoizeHashMap.put(2, BigInteger.ONE);
	}

	private BigInteger fibonacci(int n) {
		if (memoizeHashMap.containsKey(n)) {
			return memoizeHashMap.get(n);
		} else {
			BigInteger result = fibonacci(n - 1).add(fibonacci(n - 2));
			memoizeHashMap.put(n, result);
			return result;
		}
	}

	private void fibonacci_while() {
		  int n = 3;          // The index n for F(n), starting from n=3, as n=1 and n=2 are pre-defined
	      int fn;             // F(n) to be computed
	      int fnMinus1 = 1;   // F(n-1), init to F(2)
	      int fnMinus2 = 1;   // F(n-2), init to F(1)
	      
	      System.out.println(" ");
	      System.out.print("\n0 ");
	      System.out.print(fnMinus1+" ");
	      System.out.print(fnMinus2+" ");
	      
	      int nMax = 20;      // maximum n, inclusive
	      int sum = fnMinus1 + fnMinus2;  // Need sum to compute average
	  
	      double average;
	      while (n <= nMax) {  // n starts from 3
	            // n = 3, 4, 5, ..., nMax
	         // Compute F(n), print it and add to sum
	    	  fn = fnMinus1 + fnMinus2;
	    	  System.out.print(fn+" ");
	    	  sum += fn;
	         // Increment the index n and shift the numbers for the next iteration
	         ++n;
	         fnMinus2 = fnMinus1;
	         fnMinus1 = fn;
	      }
	      
	      average =  sum/nMax;
	}

}
