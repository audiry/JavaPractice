package com.practice;

import java.io.*;

public class Solution {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */

		// reading a number
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		// constructing an array of number of bits to hold
		int[] d = new int[N];

		String[] str = br.readLine().trim().split(" ");

		// converting string into integer array
		for (int i = 0; i < N; i++) {
			d[i] = Integer.parseInt(str[i]);
		}

		// compute maximum number of flips and print
		flipBits(d);

	}

	private static void flipBits(int[] a) {

		int maxDiff = 0;
		int leftIndex = 0;
		int rightIndex = 0;
		int toBeFliped = 0;
		int totalFlipedOnes = 0;

		int currentDiff = 0;
		int currentStart = 0;
		int currentFlipedOnes = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				currentDiff -= 1;
			} else {
				currentDiff += 1;
				currentFlipedOnes++;
				totalFlipedOnes++;
			}
			if (currentDiff < maxDiff) {
				maxDiff = currentDiff;
				leftIndex = currentStart;
				rightIndex = i;
				toBeFliped = currentFlipedOnes;
			} else if (currentDiff > 0) {
				currentDiff = 0;
				currentStart = i + 1;
				currentFlipedOnes = 0;
			}
		}
		System.out.println(rightIndex - leftIndex + 1 - toBeFliped
				+ totalFlipedOnes - toBeFliped);
	}

}