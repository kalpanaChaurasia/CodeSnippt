package com.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
         int N = Integer.parseInt(line[0]);
         int X = Integer.parseInt(line[1]);
         String[] arr_A = br.readLine().split(" ");
         int[] A = new int[N];
         for(int i_A = 0; i_A < arr_A.length; i_A++)
         {
         	A[i_A] = Integer.parseInt(arr_A[i_A]);
         }

         int[] out_ = solve(N, X, A);
         System.out.print(out_[0]);
         for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
         {
         	System.out.print(" " + out_[i_out_]);
         }

         wr.close();
         br.close();
    }
    
    
    static int[] solve(int N, int X, int[] A){
		return null;
       // Type your code here
       
    
    }
}