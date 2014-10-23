package com.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import junit.framework.Assert;

import org.junit.Test;

public class NewSol {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter a sentence:");

		String line = readStringFromUser();

		System.out.println("Enter word1:");

		String word1 = readStringFromUser();

		System.out.println("Enter word2:");

		String word2 = readStringFromUser();

		String str = getShortest(line, word1, word2);

		System.out.println(str);

	}

	private static String getShortest(String line, String word1, String word2)
			throws IOException {

		String[] words = line.split(" ");

		int len = words.length;

		int count = 0;

		for (int i = 0; i < len; i++) {

			if (word1.equals(words[i])) {
				count++;
			} else if (word2.equals(words[i])) {
				count++;
			}
		}

		int[] counter = new int[count];

		for (int i = 0, j = 0; i < len; i++) {

			if (word1.equals(words[i])) {
				counter[j++] = i;
				count++;
			} else if (word2.equals(words[i])) {
				counter[j++] = i;
				count++;
			}
		}

		int min = Integer.MAX_VALUE;
		int k1 = 0;
		int k2 = 0;

		for (int k = 1; k < counter.length; k++) {
			if (min > Math.abs(counter[k - 1] - counter[k])) {
				min = Math.abs(counter[k - 1] - counter[k]);
				k1 = counter[k - 1];
				k2 = counter[k];
			}
		}

		StringBuffer sb = new StringBuffer();
		while (k1 <= k2) {
			sb.append(words[k1++]).append(" ");
		}

		return sb.toString();
	}

	private static String readStringFromUser() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine().toString();

		return s;
	}

	@Test
	public void testWithValiddata() {

		String line = "There is no place for the audi in this world. audi is place of the world. world has place for the great audi";
		String word1 = "place", word2 = "audi";

	}

}
