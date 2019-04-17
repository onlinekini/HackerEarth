package com.gayle.laakmann.solution.arr;

public class StringCompressor {

	public static String compress(String str) {
		StringBuilder strBuff = new StringBuilder();
		int charCount = 1;
		char prevChar = str.charAt(0);
		boolean hasDuplicate = false;
		
		for (int i = 1; i < str.length(); i++) {
			if(prevChar != str.charAt(i)) {
				strBuff.append(str.charAt(i-1)).append(charCount);
				charCount = 1;
				prevChar = str.charAt(i);
			} else {
				charCount++;
				hasDuplicate = true;
			}			
		}
		strBuff.append(prevChar).append(charCount);

		return hasDuplicate ? strBuff.toString() : str;
	}
	
	public static void main (String args[]) {		
		System.out.println(StringCompressor.compress("aabbccddeef"));
		System.out.println(StringCompressor.compress("aabccdef"));
		System.out.println(StringCompressor.compress("abcdffffffff"));
		System.out.println(StringCompressor.compress("abcdf"));
	}
	
}
