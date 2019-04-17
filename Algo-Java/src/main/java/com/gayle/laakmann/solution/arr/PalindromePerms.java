package com.gayle.laakmann.solution.arr;

public class PalindromePerms {

	public static boolean palindromePermsCheck(String inputStr) {
		int [] alphaCountArr  = new int[128];
		int oddCharCount = 0;
		
		for (char c : inputStr.toCharArray()) {
			if (c != ' ') {
				alphaCountArr[c]++;
			}
		}
		
		for (int i : alphaCountArr) {
			if(i % 2 > 0) {
				oddCharCount++;
			}
			
			if (oddCharCount > 1) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		System.out.println(PalindromePerms.palindromePermsCheck("abba"));
		
		System.out.println(PalindromePerms.palindromePermsCheck("abab"));
		
		System.out.println(PalindromePerms.palindromePermsCheck("abrba"));
		
		System.out.println(PalindromePerms.palindromePermsCheck("abaabbrba"));
		
		System.out.println(PalindromePerms.palindromePermsCheck("abrcba"));
		
		System.out.println(PalindromePerms.palindromePermsCheck("abca ab br ccbac"));
		
		System.out.println(PalindromePerms.palindromePermsCheck("taco cat"));
	}
}
