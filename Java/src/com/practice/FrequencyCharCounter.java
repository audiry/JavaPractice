package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xml.sax.HandlerBase;

public class FrequencyCharCounter {

	public static void main(String[] args) throws IOException {

		// read characters in line
		// example: a c a s f b b m m f d

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] c = br.readLine().trim().toString().replace(" ", "")
				.toCharArray();

		// Map<Character, Integer> map = new HashMap<Character, Integer>();
		//
		// for (char ch : c) {
		//
		// if (map.containsKey(ch)) {
		// map.put(ch, map.get(ch) + 1);
		// } else {
		// map.put(ch, 1);
		// }
		//
		// }

		// print only if key appears more than once with number of times
		// for (char ch : map.keySet()) {
		// if (map.get(ch) > 1)
		// System.out.println(ch + ":" + map.get(ch));
		// }

		List<Character> ls = new ArrayList<Character>();

		for (char ch : c) {
			if (ls.contains(ch)) {

			} else {
				ls.add(ch);
			}
		}
		
		if(ls.size()==26){
			
		}
		for (char cc : ls) {
			System.out.println(cc);
		}

	}

}
