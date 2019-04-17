package com.test;

public class MySingle {
	
	private static MySingle ms;
	
	private MySingle() {
		System.out.println("Generating the class");
	}
	
	public static MySingle generateMySingle() {
		synchronized (ms) {
			if (ms == null) {
				ms = new MySingle();
			}
		}
		return ms;
	}
	
	
	public void process(String val) {
		for (int i = 0 ; i <100000; i++) {
			if (i % 50000 == 0) {
				System.out.println(" Printing : " + i + " => " + val);
			}
		}
	}
	
}
