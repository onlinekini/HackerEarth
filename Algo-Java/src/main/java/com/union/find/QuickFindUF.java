package com.union.find;

public class QuickFindUF {

	private int[] id;
	
	public QuickFindUF(int count) {
		id = new int[count];
		for (int i = 0 ; i < count; i++) {
			id[i] = i;
		}
	}
	
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}
	
	public void union(int p, int q) {
		int pVal = id[p];
		int qVal = id[q];
		
		for (int i = 0; i < id.length; i++) {
			if (id[i] == pVal) {
				id[i] = qVal;
			}
		}
	}
	
	public static void main (String args[]) {
		long t1 = System.nanoTime();
		QuickFindUF quickFinder = new QuickFindUF(100000000);
		quickFinder.union(3, 5);
		quickFinder.union(3, 8);
		quickFinder.union(9, 5);
		quickFinder.union(9, 1);
		quickFinder.union(9, 70037);
		quickFinder.union(96553, 163287);
		quickFinder.union(9, 96553);
		quickFinder.union(163287, 75548);
		quickFinder.union(163287, 101);
		quickFinder.union(163287, 28735);
		quickFinder.union(28735,4653);
		quickFinder.union(53892,4653);
		quickFinder.union(28735,67742);
		quickFinder.union(53892,6772399);
		System.out.println(quickFinder.connected(3, 4653));
		System.out.println(quickFinder.connected(53892,67742));
		System.out.println(quickFinder.connected(53892,67741));
		System.out.println((System.nanoTime() - t1));
	}
}
