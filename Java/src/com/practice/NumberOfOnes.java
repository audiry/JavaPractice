/**
 * 
 */
package com.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author penchal
 * 
 */
public class NumberOfOnes {

	private static int sum = 0;

	public static void main(String[] args) throws IOException {

		int n = new Scanner(System.in).nextInt();

		findOnes(n);
	}

	/**
	 * @param n
	 */
	private static void findOnes(int n) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= n; i++) {
			countOnes(i);
		}

		System.out.println(count);

	}

	/**
	 * @param i
	 */

	static int count = 0;

	private static void countOnes(Integer num) {

		// TODO Auto-generated method stub

		char[] c = num.toBinaryString(num).toCharArray();

		for (char cc : c)
			if (cc == '1')
				count++;

	}
}
