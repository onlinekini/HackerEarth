package com.onk.probs.classical;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArr {

	public static void main(String[] arr) {
		//Scanner
        Scanner s = new Scanner(System.in);
        int i = -1;
        int count = s.nextInt();
        int[] intArr = new int[count];
        while(s.hasNext()) {
            i = s.nextInt();
            intArr[count-1] = i;
            count --;
        }
        s.close();
        Arrays.stream(intArr).forEach(System.out::println);

	}
}
