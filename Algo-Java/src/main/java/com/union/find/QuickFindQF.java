package com.union.find;

public class QuickFindQF {

	private int[] id;
	
	public QuickFindQF(int count) {
		id = new int[count];
		for (int i = 0; i < count; i++) {
			id[i] = i;
		}
	}
	
	private int root(int i) {
		while (id[i] != i) {
			i = id[i];
		}
		return i;
	}
	
	
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		
		id[i] = j;		
	}
	
	public static void main (String args[]) {
		long t1 = System.nanoTime();
		QuickFindQF quickFinder = new QuickFindQF(100000000);
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
