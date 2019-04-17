package com.gayle.laakmann.solution.arr;

import java.util.Hashtable;


public class StringDuplicateFind {
	
	/*
	 * O(N) for Search
	 * O(N) extra Space 
	 * Using an extra datastructure -> HashTable
	 */
	public boolean hasDuplicatesInStr (String inputStr, boolean ignoreCase) {
		Hashtable<Character, Integer> tbl = new Hashtable<>();
		char[] inputCharArr = ignoreCase ? inputStr.toLowerCase().toCharArray() : inputStr.toCharArray();
		for (char c : inputCharArr) {
			if (tbl.get(c) != null) {
				return true;
			}
			tbl.put(c, 0);
		}
		return false;
	}
	
	
	/*
	 * O(N2) for search
	 * (1) - no extra datastr used
	 */
	public boolean hasDuplicatesInStr2 (String inputStr, boolean ignoreCase) {
		char[] charsInInputStr = ignoreCase ? inputStr.toLowerCase().toCharArray() : inputStr.toCharArray();
		for (int i = 0; i < charsInInputStr.length - 1; i++) {
			for(int j = i+1; j <charsInInputStr.length; j++) {
				if (charsInInputStr[i] == charsInInputStr[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	/*
	 * O(128) for Search // max 128 chars
	 * O(128) extra Space
	 * (1) - no extra datastr used
	 */
	public boolean hasDuplicatesInStr3 (String inputStr) {
		int[] charCount = new int [128];
		for (char c : inputStr.toCharArray()) {
			if (charCount[c] > 0) {
				return true;
			}
			charCount[c]++;
		}
		return false;
	}
	
	
	public static void main (String args[]) {
		StringDuplicateFind sf = new StringDuplicateFind();
		
		System.out.println(sf.hasDuplicatesInStr("Vivek", false));
		System.out.println(sf.hasDuplicatesInStr2("Vivek", false));
		System.out.println(sf.hasDuplicatesInStr3("Vivek"));
		System.out.println();
		
		System.out.println(sf.hasDuplicatesInStr("Aabcd", false));
		System.out.println(sf.hasDuplicatesInStr2("Aabcd", false));
		System.out.println(sf.hasDuplicatesInStr3("Aabcd"));
		System.out.println();
		
		System.out.println(sf.hasDuplicatesInStr("Aabcd", true));
		System.out.println(sf.hasDuplicatesInStr2("Aabcd", true));
		System.out.println();
		
		System.out.println(sf.hasDuplicatesInStr("AaAcd", false));
		System.out.println(sf.hasDuplicatesInStr2("AaAcd", false));
		System.out.println(sf.hasDuplicatesInStr3("AaAcd"));
		System.out.println();
		
		System.out.println(sf.hasDuplicatesInStr("Abbcd", false));
		System.out.println(sf.hasDuplicatesInStr2("Abbcd", false));
		System.out.println(sf.hasDuplicatesInStr3("AaAcd"));
		
		System.out.println();
				
		System.out.println(sf.hasDuplicatesInStr("AAbcd", false));
		System.out.println(sf.hasDuplicatesInStr2("AAbcd", false));
		System.out.println(sf.hasDuplicatesInStr3("AAbcd"));
		System.out.println();
		
		System.out.println(sf.hasDuplicatesInStr("AbcdA", false));
		System.out.println(sf.hasDuplicatesInStr2("AbcdA", false));
		System.out.println();
		
		System.out.println(sf.hasDuplicatesInStr("Abcdb", false));
		System.out.println(sf.hasDuplicatesInStr2("Abcdb", false));
		System.out.println(sf.hasDuplicatesInStr3("Abcdb"));
		System.out.println();
		
		System.out.println(sf.hasDuplicatesInStr("Abbcdb", false));
		System.out.println(sf.hasDuplicatesInStr2("Abbcdb", false));
		System.out.println(sf.hasDuplicatesInStr3("Abbcdb"));
		System.out.println();
		
		System.out.println(sf.hasDuplicatesInStr("AAbbcdb", false));
		System.out.println(sf.hasDuplicatesInStr2("AAbbcdb", false));
		System.out.println();
		
		System.out.println(sf.hasDuplicatesInStr("Aacd", true));
		System.out.println(sf.hasDuplicatesInStr2("Aacd", true));
		System.out.println();
		
	}

}
