package com.test;

import java.util.Scanner;
import java.math.*;

public class GCDSample {
	//public static int count =1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  int count =0;
		  
		  int a, b, x, y, t, hcf, lcm;
	        
//	        long a= sc.nextLong();
//	        long b = sc.nextLong();
	        
		  x = sc.nextInt();
	        y = sc.nextInt();
	        
	        a = x;
	        b = y;
			
	        while(b != 0)
	        {
	            t = b;
	            b = a%b;
	            a = t;
	        }
			
	        hcf = a;
	      //  lcm = (x*y)/hcf;
			
	        System.out.print("HCF = " +hcf);
	     //   System.out.print("\nLCM = " +lcm);
	
	}
	
	private static int findGCD(long number1, long number2, int count) {
		//base case 
	if(number2 == 0)
	 { 
		return count; 
	} else {
	count++;
	}
	
//	System.out.println(count++);
		return findGCD(number2, number1%number2, count); 
	}
	

		
	
	public    static int gcd(int a, int b)
    {
        if (a == 0) 
            return b;
         
        return gcd(b%a,a);
    }
    // method to calculate all common divisors
    // of two given numbers
    // a, b --> input integer numbers
  public static int commDiv(int a,int b)
    {
        // find gcd of a,b
    	
        int n = gcd(a, b);
        
        System.out.println("n"+n);
        
       System.out.println("sqrt"+Math.sqrt(n));
        
      
        // Count divisors of n.
        int result = 0;
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            // if 'i' is factor of n
            if (n%i==0)
            {
                // check if divisors are equal
                if (n/i == i)
                    result += 1;
                else
                    result += 2;
            }
        }
        
        System.out.println("result"+result);
        
        return result;
    }

}
