package com.test;

import java.util.Scanner;

public class AryaStark {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		
//		1<= T <=10
//		1<= R <=1000 1<= P <=R
				
		if (t < 1 || t > 10) {
			return;
		}

		for (int j = 0; j < t; j++) {
			int r = sc.nextInt(), p = sc.nextInt();
			if (r < 1 || r > 1000) {
				return;
			}
			
			if (p < 1 || p > r) {
				return;
			}
			
			System.out.println(new AryaStark().winsPossibilitiesCounter(p, r));
		}

	}

	public int winsPossibilitiesCounter(int p, int r) {
		int totalPossibilities = fight(p, 0, 0, p, r);
		return totalPossibilities % (10 ^ 9 + 7);
	}

	public int fight(int aryaWins, int sansaWins, int possibilities, final int p, final int r) {
		if (aryaWins < sansaWins * p) {
			return 0;
		}

		if (aryaWins + sansaWins == r) {			
			return 1;
		}
		return fight(aryaWins + 1, sansaWins, possibilities, p, r)
				+ fight(aryaWins, sansaWins + 1, possibilities, p, r);
	}
}
