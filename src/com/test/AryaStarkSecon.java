package com.test;

import java.util.Scanner;

public class AryaStarkSecon {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		if (t < 0 || t > 10) {
			return;
		}

		for (int j = 0; j < t; j++) {
			int rounds = sc.nextInt(), points = sc.nextInt();
			Double s = 0.0;
			for (int i = 1; i < rounds; i++)
				s += java.lang.Math.pow((double) i / rounds, points);
			s = rounds - s;

			System.out.println(s.intValue());
		}
		
	}

}
