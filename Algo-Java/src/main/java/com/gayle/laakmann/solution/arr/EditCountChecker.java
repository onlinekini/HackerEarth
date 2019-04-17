package com.gayle.laakmann.solution.arr;

public class EditCountChecker {

	
	public static boolean exceedEditsCount(String str1, String str2) {
		if (Math.abs(str1.length() - str2.length()) > 1) {
			return false;
		}
		
		int lengthUsedForLoop = str1.length() > str2.length() ? str2.length() : str1.length();
		boolean isLengthSame = (str1.length() == str2.length());
		int countOfEdits = 0;
		
		for (int i = 0 ; i < lengthUsedForLoop; i++) {
			if(str1.charAt(i) != str2.charAt(i)) {
				countOfEdits++;
			}
			
			if(countOfEdits > 1 && isLengthSame) {
				return false;
			}
			
		}
		return true;		
		
	}
	
	public static void main(String[] args) {
		System.out.println(EditCountChecker.exceedEditsCount("pale", "ple"));
		
		System.out.println(EditCountChecker.exceedEditsCount("pales", "pale"));
		
		System.out.println(EditCountChecker.exceedEditsCount("pale", "bale"));
		
		System.out.println(EditCountChecker.exceedEditsCount("pale", "bake"));
		
		System.out.println(EditCountChecker.exceedEditsCount("pale", "paling"));
	}
}
