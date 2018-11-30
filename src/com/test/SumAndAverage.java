package com.test;

public class SumAndAverage {

	public static void main(String[] args) {
		int upperBoundNumber = 100;

		if (upperBoundNumber <= 0) {
			System.out.println("Error: upperbound less than 0!");
			return;
		}

		SumAndAverage aSumAndAverage = new SumAndAverage();
		aSumAndAverage.printSumNumbersUsingForLoop(upperBoundNumber);
		aSumAndAverage.printSumNumbersUsingDoWhileLoop(upperBoundNumber);
		aSumAndAverage.printSumNumbersUsingWhileDoLoop(upperBoundNumber);
		aSumAndAverage.printSumNumbersFromRange(111, 8899);
		aSumAndAverage.printSumOddNumbers(1, 100);
		aSumAndAverage.printSumNumbersDivisibleBySeven(1, 100);
		aSumAndAverage.printSumSquares(1, 100);

	}

	/**
	 * Find out the "sum of the squares" of all the numbers from 1 to 100, i.e. 1*1
	 * + 2*2 + 3*3 + ... + 100*100.
	 */
	private void printSumSquares(int lowerNumber, int upperNumber) {
		long count = 0L;
		long sum = 0L;

		for (int i = lowerNumber; i <= upperNumber; i++) {
			sum += i * i;
			System.out.println(i * i);
			count++;
		}
		System.out.println("7. Sum of the squares from " + lowerNumber + " to " + upperNumber + ".");
		System.out.println("The sum is " + sum);
		System.out.printf("The average is %.2f", ((double) sum / count));
		System.out.println();
	}

	private void printSumNumbersDivisibleBySeven(int lowerNumber, int upperNumber) {
		long count = 0L;
		long sum = 0L;

		for (int i = lowerNumber; i <= upperNumber; i++) {
			if (i % 7 != 0) {
				continue;
			}
			sum += i;
			count++;
		}

		System.out.println("6. Sum numbers from " + lowerNumber + " to " + upperNumber
				+ " that is divisible by 7, and compute the average.");
		System.out.println("The sum is " + sum);
		System.out.printf("The average is %.2f", ((double) sum / count));
		System.out.println();

	}

	private void printSumOddNumbers(int lowerNumber, int upperNumber) {
		long count = 0L;
		long sum = 0L;
		for (int i = lowerNumber; i <= upperNumber; i++) {
			if (i % 2 != 0) {
				continue;
			}
			sum += i;
			count++;
		}
		System.out.println("5. Sum only the odd numbers from " + lowerNumber + " to " + upperNumber
				+ ", and compute the average.");
		System.out.println("The sum is " + sum);
		System.out.printf("The average is %.2f", ((double) sum / count));
		System.out.println();

	}

	private void printSumNumbersFromRange(int lowerNumber, int upperNumber) {
		long count = 0L;
		long sum = 0L;
		for (int i = lowerNumber; i <= upperNumber; i++) {
			sum += i;
			count++;
		}
		System.out.println("4. Sum numbers from " + lowerNumber + " to " + upperNumber + ", and compute the average.");
		System.out.println("The sum is " + sum);
		System.out.printf("The average is %.2f", ((double) sum / count));
		System.out.println();

	}

	private void printSumNumbersUsingWhileDoLoop(int upperBoundNumber) {
		long sum = 0L;
		int i = 1;

		while (i <= upperBoundNumber) {
			sum += i;
			i++;
		}
		System.out.println("Sum the " + upperBoundNumber + " numbers use a \"while-do\" loop.");
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + ((double) sum / upperBoundNumber));

	}

	private void printSumNumbersUsingDoWhileLoop(int upperBoundNumber) {
		int i = 1;
		long sum = 0L;

		do {

			sum += i;
			i++;

		} while (i <= upperBoundNumber);
		System.out.println("Sum the " + upperBoundNumber + " numbers use a \"do-while\" loop.");
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + ((double) sum / upperBoundNumber));
	}

	private void printSumNumbersUsingForLoop(int upperBoundNumber) {
		long sum = 0L;

		for (int i = 1; i <= upperBoundNumber; i++) {
			sum += i;
		}
		System.out.println("Sum the " + upperBoundNumber + " numbers use a \"for\" loop.");
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + ((double) sum / upperBoundNumber));

	}

}
