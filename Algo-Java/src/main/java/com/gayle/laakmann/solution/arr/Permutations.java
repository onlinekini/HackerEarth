package com.gayle.laakmann.solution.arr;

import java.util.Arrays;
import java.util.Hashtable;

public class Permutations {

	/*
	 * With hashtable
	 */
	public boolean chckPermutationBetweenStr(String inputStr, String inputStr2, boolean ignoreCase) {
		Hashtable<Character, Integer> tbl = new Hashtable<>();
		
		if (inputStr.length() != inputStr2.length()) {
			return false;
		}
		
		for (Character chr : inputStr.toCharArray()) {
			char c = ignoreCase ? Character.toUpperCase(chr) : chr;
			if (tbl.containsKey(c)) {
				tbl.put(c, tbl.get(c) + 1);
			} else {
				tbl.put(c, 1);
			}
		}
		
		
		for (char chr : inputStr2.toCharArray()) {
			char c = ignoreCase ? Character.toUpperCase(chr) : chr;
			
			if(!tbl.containsKey(c) || tbl.get(c) <= 0) {
				return false;
			}
			tbl.put(c, tbl.get(c) - 1);
		}
		
		return true;
	}
	
	public boolean chckPermutationBetweenStr2(String inputStr, String inputStr2, boolean ignoreCase) {
		if (inputStr.length() != inputStr2.length()) {
			return false;
		}
		
		char[] inputStrCharArr = inputStr.toCharArray();
		Arrays.sort(inputStrCharArr);
		
		char[] inputStrCharArr2 = inputStr2.toCharArray();
		Arrays.sort(inputStrCharArr2);
		
		// Bad duplicate code, doing so to save time
		if (ignoreCase) {
			for (int i = 0 ; i < inputStrCharArr.length ; i++) {
				if (Character.toUpperCase(inputStrCharArr[i]) != Character.toUpperCase(inputStrCharArr2[i])) {
					return false;
				}
			}
		} else {
			for (int i = 0 ; i < inputStrCharArr.length ; i++) {
				if (inputStrCharArr[i] != inputStrCharArr2[i]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	/*
	 * With char array
	 */
	public boolean chckPermutationBetweenStr3(String inputStr, String inputStr2) {
		if (inputStr.length() != inputStr2.length()) {
			return false;
		}

		int[] charContentInStr = new int[128];
		for (Character chr : inputStr.toCharArray()) {
			charContentInStr[chr]++;
		}
		
		for (char chr : inputStr2.toCharArray()) {		
			charContentInStr[chr]--;
			if(charContentInStr[chr] < 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main (String args[]) {
		Permutations sf = new Permutations();
		
		System.out.println(sf.chckPermutationBetweenStr("AABBCCDD", "AABBBBCD", false));
		System.out.println(sf.chckPermutationBetweenStr2("AABBCCDD", "AABBBBCD", false));
		System.out.println(sf.chckPermutationBetweenStr3("AABBCCDD", "AABBBBCD"));
		System.out.println();
		
		
		System.out.println(sf.chckPermutationBetweenStr("Vivek", "Vivek", false));
		System.out.println(sf.chckPermutationBetweenStr2("Vivek", "Vivek", false));
		System.out.println(sf.chckPermutationBetweenStr3("Vivek", "Vivek"));
		System.out.println();
		
		System.out.println(sf.chckPermutationBetweenStr("ABCD", "ACDB", false));
		System.out.println(sf.chckPermutationBetweenStr2("ABCD", "ACDB", false));
		System.out.println();
		
		System.out.println(sf.chckPermutationBetweenStr("AABBCCDD", "BCBDCADA", false));
		System.out.println(sf.chckPermutationBetweenStr2("AABBCCDD", "BCBDCADA", false));
		System.out.println();
		
		System.out.println(sf.chckPermutationBetweenStr("AABBCCDD", "AABBCCDD", false));
		System.out.println(sf.chckPermutationBetweenStr2("AABBCCDD", "AABBCCDD", false));
		System.out.println(sf.chckPermutationBetweenStr3("AABBCCDD", "AABBCCDD"));
		System.out.println();
		
		System.out.println(sf.chckPermutationBetweenStr("AABBCCDD", "ABCD", false));
		System.out.println(sf.chckPermutationBetweenStr2("AABBCCDD", "ABCD", false));
		System.out.println(sf.chckPermutationBetweenStr3("AABBCCDD", "ABCD"));
		System.out.println();
		
		
		System.out.println(sf.chckPermutationBetweenStr("AABBCCDD", "aabbccdd", true));
		System.out.println(sf.chckPermutationBetweenStr2("AABBCCDD", "aabbccdd", true));
		System.out.println();
	}
	
	
	
	
}
