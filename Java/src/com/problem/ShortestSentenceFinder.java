/**
 * 
 */
package com.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShortestSentenceFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int key1Counter = 0, key2Coutner = 0;

		// BufferedReader br = new BufferedReader(new InputStreamReader())
		String str = "There is no place for the audi in this world. audi is place of the world. world has place for the great audi";

		String[] words = str.split(" ");

		int len = words.length;

		// int[] key1C = new int[len];
		// int[] key2C = new int[len];

		String key1 = "place", key2 = "audi";
		//
		// for (int i = 0, j = 0, k = 0; i < len; i++) {
		//
		// if (key1.equals(words[i])) {
		// key1C[j] = i;
		// j++;
		// } else if (key2.equals(words[i])) {
		// key2C[k] = i;
		// k++;
		// }
		// }

//		List<String> ls = new ArrayList<String>(Arrays.asList(words));

		int count = 0;

		for (int i = 0; i < len; i++) {

			if (key1.equals(words[i])) {
				count++;
			} else if (key2.equals(words[i])) {
				count++;
			}
		}

		int[] counter = new int[count];

		for (int i = 0, j = 0; j < count && i < len; i++, j++) {
			if (key1.equals(words[i])) {
				counter[j] = i;
			} else if (key2.equals(words[i])) {
				counter[j] = i;
			}
		}

		for (Integer i : counter) {

			System.out.println(i);
		}
	}
}
