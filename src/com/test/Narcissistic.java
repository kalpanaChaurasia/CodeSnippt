package com.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Narcissistic {

	public static void main(String[] args) {

//		153 = 13+53+33
//		1634 = 14+64+34+44
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
			if(isNarc(number)){
				System.out.print("True");				
			}else{
				System.out.print("False");
			}
			
			//java 8 code
			
//			  IntStream.iterate(0, n -> n + 1).limit(Integer.MAX_VALUE).boxed().forEach(i -> {
//		            int length = i.toString().length();
//		            int addedDigits = 0;
//		 
//		            for (int count = 0; count < length; count++) {
//		                int value = Integer.parseInt(String.valueOf(i.toString().charAt(count)));
//		                addedDigits += Math.pow(value, length);
//		            }
//		 
//		            if (i == addedDigits) {
//		                numbersCalculated++;
//		                System.out.print(addedDigits + " ");
//		            }
//		 
//		            if (numbersCalculated == numbersToCalculate) {
//		                System.exit(0);
//		            }
//			        });

	}
	
	public static boolean isNarc(long x){
		if(x < 0) return false;
 
		String xStr = Long.toString(x);
		int m = xStr.length();
		long sum = 0;
 
		for(char c : xStr.toCharArray()){
			sum += Math.pow(Character.digit(c, 10), m);
		}
		return sum == x;
	}
 
	
	public static Long[] getNumbers(long N) {
	    int porog = 10;
	    LinkedList<Long> list = new LinkedList<>();
	    // initial powers for the number 0-9
	    long[] powers = { 0l, 1l, 2l, 3l, 4l, 5l, 6l, 7l, 8l, 9l };

	    for (long i = 1; i < N; i++) {
	        if (i == porog) {
	            porog *= 10;
	            // calculate i^length
	            for (int pi = 1; pi < 10; pi++) {
	                powers[pi] *= pi;
	            }
	        }
	        long s = i;
	        long k = 0;
	        while (s > 0) {
	            int r = (int)(s % 10);
	            k += powers[r];
	            if (k > i)
	                break;
	            s /= 10;
	        }

	        if (k == i)
	            list.add(i);
	    }

	    return list.toArray(new Long[]{});
	}


}
