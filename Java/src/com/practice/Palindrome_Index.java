package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome_Index {

	public static void main(String[] args) throws IOException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		String[] str = new String[N];
		int[] indexes = new int[N];

		for (int i = 0; i < N; i++) {
			str[i] = br.readLine().trim().toString();
		}

		for (int i = 0; i < N; i++) {
			indexes[i] = isPalindrome(str[i]);
		}

	}

	private static int isPalindrome(String string) {

		int length = string.length();
		int mid = length / 2;
		char[] c = string.toCharArray();

		for (int i = 0; i < mid + 1; i++) {

			if (string.charAt(i) == string.charAt(length - 1)) {
				return -1;
			}
		}

		return willItBePalindrome(string);
		// TODO Auto-generated method stub

	}

	private static int willItBePalindrome(String string) {
		// TODO Auto-generated method stub
		int position = -1;

		for (int i = 0; i < string.length(); i++) {
			isPalindrome(string.substring(i));

		}

		return position;
	}

}
