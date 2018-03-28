package com.test;

import java.io.IOException;
import java.util.Scanner;

public class jumpWall {
		static int output1 = 0;
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int output = 0;
		int ip1 = Integer.parseInt(in.nextLine().trim());
		int ip2 = Integer.parseInt(in.nextLine().trim());
		int ip3_size = 0;
		ip3_size = Integer.parseInt(in.nextLine().trim());
		int[] ip3 = new int[ip3_size];
		int ip3_item;
		for (int ip3_i = 0; ip3_i < ip3_size; ip3_i++) {
			ip3_item = Integer.parseInt(in.nextLine().trim());
			ip3[ip3_i] = ip3_item;
		}
		output = GetJumpCount(ip1, ip2, ip3);
		System.out.println(String.valueOf(output));
	}

	public static int GetJumpCount(int input1, int input2, int[] input3) {
		int noOfWalls = input3.length;
		int[] wallHeights = input3;
		   while(noOfWalls>0){
	            output1 = jumpAmount(output1, input1, wallHeights[--noOfWalls], input2);
	        }
		   
//		GetJumpCounts(input1, input2, input3.length, input3);
		return output1;
	}
	
	public static void GetJumpCounts(int climbUp,int climbDown,int noOfWalls,int[] wallHeights)
	{
	        while(noOfWalls>0){
	            output1 = jumpAmount(output1, climbUp, wallHeights[--noOfWalls], climbDown);
	        }
	}   

	private static int jumpAmount(int totalJump, int climbUp, int hight, int climbDown){
		System.out.println("hight "+hight);
	    if( hight <= climbUp){
	        return ++totalJump;
	    }
	    else{
	        hight = hight - (climbUp - climbDown);
	        return jumpAmount(++totalJump, climbUp, hight, climbDown);
	    }
	}
}
