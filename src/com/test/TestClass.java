package com.test;


//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        
        int a= sc.nextInt();
        int b = sc.nextInt();
        int answer = commDiv(a,b);
        System.out.println(""+answer);
       
    //      List<Integer> commonDivisor = getCommonDivisor(a, b);
    // System.out.println(commonDivisor.size());
    }
    
    public static List<Integer> getCommonDivisor(int num1, int num2) {

    List<Integer> list = new ArrayList<Integer>();

    //   int gcd = 1;
	//	int min = Math.min(num1, num2);
// 		for(int i=1; i<= minimum; i++){
// 		  if(num1%i == 0 && num2%i ==0)
// 		   list.add(i);
// 		}
		
    int min = minimum(num1, num2);
    System.out.println("min"+min);
    

    for(int i = 1; i <= min / 2; i++) { 
        if (num1 % i == 0 && num2 % i == 0) {
            list.add(i);
        }
    }

    if (num1 % min == 0 && num2 % min == 0) {
        list.add(min);
    }

    return list;
}

public static int minimum(int num1, int num2) {
    return num1 <= num2 ? num1 : num2;
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
  public  static int commDiv(int a,int b)
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
