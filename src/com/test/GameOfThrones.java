package com.test;

public class GameOfThrones {

	/**
	 * Calculates the total possibilities of Arya winning the battle satisfying the
	 * given condition.
	 *
	 * @param p
	 * @param r
	 * @return
	 */
	public int winsPossibilitiesCounter(int p, int r) {

		/**
		 * Arya always has to win first p number of rounds.
		 */
		int totalPossibilities = fight(p, 0, 0, p, r);
		return totalPossibilities % (10 ^ 9 + 7);
	}

	/**
	 * Recursive function that simulates all possible combinations for N (i.e. r-p
	 * in our case) number of rounds.
	 * <p>
	 * The first call this function should always aryaWins = p, sansaWins = 0.
	 * Meaning Arya wins first 'p' rounds
	 * <p>
	 * For remaining 'r-p' rounds, each round can have either Arya or Sansa as
	 * winner.
	 *
	 * @param aryaWins
	 *            number of Arya wins so far
	 * @param sansaWins
	 *            number of Samza wins so far
	 * @param possibilities
	 *            number of possibilities
	 * @param p
	 *            fix number used for battle victory criteria for Arya.
	 * @param r
	 *            number of rounds.
	 * @return total number of possibilities
	 */
	public int fight(int aryaWins, int sansaWins, int possibilities, final int p, final int r) {

		/**
		 * If Arya victory criteria fails then return current possibilities count.
		 */
		if (aryaWins < sansaWins * p) {
			return possibilities;
		}

		/**
		 * Arya victory criteria is satisfied at this point in code execution. If all
		 * rounds are completed then simply bump up the possibilities by 1.
		 */
		if (aryaWins + sansaWins == r) {
			possibilities += 1;
			return possibilities;
		}
		return fight(aryaWins + 1, sansaWins, possibilities, p, r)
				+ fight(aryaWins, sansaWins + 1, possibilities, p, r);
	}

	public static void main(String[] args) {
		System.out.println("Possibilities: " + new GameOfThrones().winsPossibilitiesCounter(2, 4));
	}
}