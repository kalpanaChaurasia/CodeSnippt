package com.test;

import java.io.IOException;
import java.util.Scanner;

/*Number of jumps for a thief to cross walls
A thief trying to escape from a jail. He has to cross N walls each with varying heights (every height is greater than 0). 
He climbs X feet every time. But, due to the slippery nature of those walls, every time he slips back by Y feet. Now the task is 
to calculate the total number of jumps required to cross all walls and escape from the jail.
*/

public class jumpWall {

	// Input : heights[] = {11, 11}
	// X = 10;
	// Y = 1;
	// Output : 4
	// He needs to make 2 jumps for first wall
	// and 2 jumps for second wall.
	//
	// Input : heights[] = {11, 10, 10, 9}
	// X = 10;
	// Y = 1;
	// Output : 5

	static int output1 = 0;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int output = 0;
		int output2 = 0;
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = sc.nextInt();

		int[] height = new int[n];
		for (int i = 0; i < n; i++) {
			height[i] = sc.nextInt();
		}

		// output = GetJumpCounts(x, y, n, height);
		output = jumpcount3(x, y, n, height);

		System.out.println(String.valueOf(output));

		output2 = jumpcount4(x, y, n, height);

		System.out.println(String.valueOf(output2));
	}

	// Method 2
	public static void GetJumpCounts(int x, int y, int n, int[] wallHeights) {
		while (n > 0) {
			output1 = jumpAmount(output1, x, wallHeights[--n], y);
		}
	}

	private static int jumpAmount(int totalJump, int x, int hight, int y) {
		System.out.println("hight " + hight);
		if (hight <= x) {
			return ++totalJump;
		} else {
			hight = hight - (x - y);
			return jumpAmount(++totalJump, x, hight, y);
		}
	}

	// Method 3
	static int jumpcount3(int x, int y, int n, int height[]) {
		int jumps = 0;

		for (int i = 0; i < n; i++) {

			if (height[i] <= x) {
				jumps++;
				continue;
			}

			/*
			 * If height of wall is greater than up move
			 */
			int h = height[i];
			System.out.println(String.valueOf(i) + " : " + String.valueOf(h));

			while (h > x) {
				jumps++;
				h = h - (x - y);
			}
			jumps++;
			System.out.println(String.valueOf(jumps));
		}
		return jumps;
	}

	// Method 4
	static int jumpcount4(int x, int y, int n, int height[]) {
		int jumps = 0;
		for (int i = 0; i < n; i++) {

			// Since all heights are
			// greater than 1, at-least
			// one jump is always required
			jumps++;

			// More jumps required if height
			// is greater than x.
			if (height[i] > x) {
				// Since we have already counted
				// one jump
				int h = height[i] - (x - y);

				// Remaining jumps
				jumps += h / (x - y);

				// If there was a remainder greater
				// than 1. 1 is there to handle cases
				// like x = 11, y = 1, height[i] = 21.
				if (h % (x - y) > 1)
					jumps++;
			}
		}
		return jumps;
	}
}
