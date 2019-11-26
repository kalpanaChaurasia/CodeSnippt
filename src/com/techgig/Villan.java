package com.techgig;

import java.util.Arrays;
import java.util.Scanner;

public class Villan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		if (t < 0 || t > 10) {
			return;
		}
		
				
		for (int j = 0; j < t; j++) {			
			int n = sc.nextInt();
			
			int [] villan = new int[n];
			
			int [] player = new int[n];
			
			 for(int i=0; i<n; i++ ) {
				 villan[i] = sc.nextInt();
		      }

			 for(int i=0; i<n; i++ ) {
				 player[i] = sc.nextInt();
		      }
			 
			 Arrays.sort(villan);
			 
			 Arrays.sort(player);
			 
			 boolean isWin =false;
			 
			 for(int i=0; i<n; i++ ) {
				 if(player[i] > villan[i]) {
					 isWin = true;
				 }else {
					 isWin = false;
					 break;
				 }
		      }
			 
			 if(isWin) {
				 System.out.println("WIN");
			 }else {
				 System.out.println("LOSE");
			 }	 
		}
		

	}

}
