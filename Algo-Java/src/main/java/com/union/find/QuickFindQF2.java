package com.union.find;

public class QuickFindQF2 {

	private int[] id;
	private int[] szId;
	
	public QuickFindQF2(int count) {
		id = new int[count];
		szId = new int[count];
		for (int i = 0; i < count; i++) {
			id[i] = i;
			szId[i] = 1;
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
		//System.out.println(i + " - " + j);
		if (i == j) {
			return;
		} 
		
		if(szId[i] < szId[j]){
			id[i] = j;
			szId[j] += szId[i];
		} else {
			id[j] = i;
			szId[i] += szId[j];
		}
	}
	
	public static void main (String args[]) {
		long t1 = System.nanoTime();
		QuickFindQF2 quickFinder = new QuickFindQF2(100000000);
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
