package com.onk.probs.classical;

import java.util.Scanner;

public class GoddnessArr {

	public static void main(String[] arr) throws Exception {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] intArr = new int[count];
		int i = 0;
		
		int start = 0;
		int end = 1;
		int maxOneCount = 0;
		boolean isZero = true;
		
		int tempStart = 0;
		int tempEnd = 1;
		int TempMaxOneCount = 0;		
		
		while (i < count) {
        	intArr[i] = sc.nextInt();
        	i++;
        	if (start == 0 && intArr[i -1] == 1) {
        		start = i -1;
        		tempStart = i-1;
        	} 
        	
        	if(intArr[i -1] == 1) {
        		maxOneCount++;
        	} else {
        		isZero = true;
        	}
        	
        	
        	
        }
        
	}
}
