package com.probs.prob1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimeMinistersNumber {

	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int startInt  = s.nextInt();
		int endInt = s.nextInt();
		s.close();
		int sumPrime = 0;
		boolean isPrime = false;
		int num = 0;

		Set<Integer> primeValues = new HashSet<>();
		primeValues.addAll(Arrays.asList(1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53));
		//11 23 29 41 43 47
		for (int i = startInt; i <= endInt; i++) {
			//System.out.println(i);
			isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++ ) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				num = i;
				while (num > 0) {
					sumPrime += (num % 10);
					num = num / 10;
				}
				if (primeValues.contains(sumPrime)) {
					System.out.print(i + " ");
				} 
				sumPrime = 0;
			}
		}
	}
}
