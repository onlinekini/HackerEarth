package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tester {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(30);
		
		for (int t = 0; t < 20 ; t++) {
			executor.submit(() -> {
				MySingle singleton = MySingle.generateMySingle();
				singleton.process(Thread.currentThread().getName());
			});
		}
		
		executor.shutdown();
	}

}
