package com.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_Val = br.readLine().split(" ");
            int[] Val = new int[N];
            for(int i_Val = 0; i_Val < arr_Val.length; i_Val++)
            {
            	Val[i_Val] = Integer.parseInt(arr_Val[i_Val]);
            }
            int Q = Integer.parseInt(br.readLine().trim());
            int[][] Queries = new int[Q][3];
            for(int i_Queries = 0; i_Queries < Q; i_Queries++)
            {
            	String[] arr_Queries = br.readLine().split(" ");
            	for(int j_Queries = 0; j_Queries < arr_Queries.length; j_Queries++)
            	{
            		Queries[i_Queries][j_Queries] = Integer.parseInt(arr_Queries[j_Queries]);
            	}
            }

            int[] out_ = HardQueries(N, Val, Q, Queries);
            System.out.print(out_[0]);
            for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
            {
            	System.out.print("\n" + out_[i_out_]);
            }
            
            System.out.println();
            
         }

         wr.close();
         br.close();
    }
    static int[] HardQueries(int N, int[] Val, int Q, int[][] Queries){
      return new int[Q];
    }
}