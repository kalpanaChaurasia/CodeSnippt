package com.techgig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// int[] maxSum = new int[n];

// for (int i = 0; i < n; i++) {
// if (list[i] > 0) {
// if (i < n - 2 && list[i + 2] > 0) {
// maxSum[i] = list[i] + list[i + 2];
// }
// else {
// maxSum[i] = list[i];
// }
// } else {
// maxSum[i] = 0;
// }
// }

// System.out.println("maxSum " + Arrays.toString(maxSum));

// // compare list and get max value
// int maxIndex = 0;
// int max = maxSum[0];
// for (int i = 1; i < maxSum.length; i++) {
// if (maxSum[i] > max) {
// max = maxSum[i];
// maxIndex = i;
// }
// }
//
// System.out.println("max " + max);
//
// System.out.println("maxIndex " + maxIndex);
//
// if (maxIndex > -1) {
// try {
// System.out.println(list[maxIndex] + "" + list[maxIndex + 2]);
// } catch (Exception e) {
// System.out.println(list[maxIndex]);
// }
// } else {
// System.out.println("0");
// }

public class NeighboursParty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		if (t < 0 || t > 10) {
			return;
		}

		for (int j = 0; j < t; j++) {
			int n = sc.nextInt();

			int[] list = new int[n];

			for (int i = 0; i < n; i++) {
				list[i] = sc.nextInt();
				if(list[i] == 0) {
					return;
				}
			}

			ArrayList<Integer> evenInt = new ArrayList();
			ArrayList<Integer> oddInt = new ArrayList();

			int even = 0, odd = 0;
			for (int i = 0; i < n; i++) {
				
					if (i % 2 == 0) {
						even += list[i];
						if (list[i] > 0) {
						evenInt.add(list[i]);
						}
					} else {
						odd += list[i];
						if (list[i] > 0) {
						oddInt.add(list[i]);
						}
					}
				
			}

			

			ArrayList<Integer> ansInt = new ArrayList();
			if (even > odd) {
				for (int i = 0; i < n; i++) {
					if (list[i] > 0) {
						if (i % 2 == 0) {
							ansInt.add(list[i]);
						}
					}
				}
			} else if (even < odd) {
				for (int i = 0; i < n; i++) {
					if (list[i] > 0) {
						if (i % 2 != 0) {
							ansInt.add(list[i]);
						}
					}
				}
			} else {
				Collections.sort(evenInt);
				Collections.sort(oddInt);
				if (evenInt.get(0) > oddInt.get(0)) {
					for (int i = 0; i < n; i++) {
						if (list[i] > 0) {
							if (i % 2 == 0) {
								ansInt.add(list[i]);
							}
						}
					}
				} else {
					for (int i = 0; i < n; i++) {
						if (list[i] > 0) {
							if (i % 2 != 0) {
								ansInt.add(list[i]);
							}
						}
					}
				}
			}

			Collections.sort(ansInt);
			for (int i = 0; i < ansInt.size(); i++) {
				System.out.print(ansInt.get(i));
			}
			System.out.println();
		}
	}

	public static void returnEvenArray() {

	}

	public static void returOddArray() {

	}

}
