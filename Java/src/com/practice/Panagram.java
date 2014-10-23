//package com.practice;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Panagram {
//
//	static final char[] alp = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
//			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
//			'w', 'x', 'y', 'z' };
//
//	static int[] number = new int[26];
//
//	static int count = 0;
//
//	static char match;
//
//	public static void main(String[] args) throws IOException {
//		/*
//		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
//		 * Your class should be named Solution.
//		 */
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String[] str = br.readLine().trim().split(" ");
//		//
//		// for (int i = 0; i < length(str); i++) {
//		// match = str[i];
//		// for (int j = 0; j < length(alp); j++) {
//		// if (match == alp[j]) {
//		// number[j]++;
//		// }
//		// }
//		// }
//		List<Character> ls = new ArrayList<Character>();
//
//		for (char ch : c) {
//			if (ls.contains(ch)) {
//
//			} else {
//				ls.add(ch);
//			}
//		}
//
//		if (ls.size() == 26)
//
//			System.out.println("pangram");
//		else
//			System.out.println("not pangram");
//	}
//
//	// private static int length() {
//	// return alp.length;
//	// }
//
//	private static int length(char[] str) {
//		return str.length;
//	}
//}