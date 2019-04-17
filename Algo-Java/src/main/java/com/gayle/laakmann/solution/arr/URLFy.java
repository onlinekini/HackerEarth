package com.gayle.laakmann.solution.arr;

public class URLFy {

	// static to save time
	
	public static String urlFyString(String str) {
		int spaceCount =  0;
		char [] charArrayFromStr = str.toCharArray();
		
		for (char c : charArrayFromStr) {
			if (c == ' ') {
				spaceCount ++;
			}
		}
		int finalStrCount = str.length() + (spaceCount  * 2); // additional 2 characters
		char[] newStrCharArr = new char[finalStrCount];
		String tp = finalStrCount + " : " + str.length() ;
		
		for (int i = str.length()-1 ; i >= 0 ; i-- ) {
			if (charArrayFromStr[i] != ' ') {
				newStrCharArr[--finalStrCount] = charArrayFromStr[i];
			} else {
				newStrCharArr[--finalStrCount] = '0';
				newStrCharArr[--finalStrCount] = '2';
				newStrCharArr[--finalStrCount] = '%';
			}
		}
		System.out.println(tp + " : " + newStrCharArr.length);
		return new String(newStrCharArr);
	}
	
	
	public static void main(String[] args) {
		System.out.println(URLFy.urlFyString(" This is a String with spacs in front"));
		System.out.println(URLFy.urlFyString(" This is a String with spacs in front and back"));
		System.out.println(URLFy.urlFyString("      "));
	}
}
