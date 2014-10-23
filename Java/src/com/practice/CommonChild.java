package com.practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CommonChild {

	public static void main(String[] args) throws IOException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		// read two strings
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string1 = br.readLine().toUpperCase().trim().replaceAll(" ", "");
		String string2 = br.readLine().toUpperCase().trim().replaceAll(" ", "");

		// convert into char arrays
		char[] str1 = string1.toCharArray();
		char[] str2 = string2.toCharArray();

		int length = str1.length;
		StringBuffer sb = new StringBuffer();

		// compare char by char
		for (int i = 0; i < length; i++) {

			for (int j = 0; j < length; j++) {

				if (str1[i] == str2[j]) {

					sb.append(str1[i]);

				}
			}
		}

		System.out.println(sb.length());

	}
}