package com.test;

public class Pattern12 {

//	1*2*3*4*17*18*19*20
//	  5*6*7* 14*15*16
//	    8*9*12*13
//	      10*11
	public static void main(String[] args) {
		int a = 0, b = 0, i, j, Num = 4, k, l;

		for (i = Num; i >= 1; i--) {
			for (j = Num; j > i; j--)
				System.out.print(" ");
			for (k = 1; k <= i; k++)
				System.out.print((++a) + "*");

			for (l = 1; l <= i; l++) {
				System.out.println(++b + (i * i));
				if (l != i)
					System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
