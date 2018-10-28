package com.probs.prob1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[]) throws Exception {
		// Scanner
		boolean isPrime = true;
		Scanner s = new Scanner(System.in);
		Integer uptoInt = s.nextInt(); // Reading input from STDIN
		for (int i = 2; i <= uptoInt; i++) {
			isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
		}
		s.close();
	} 
}