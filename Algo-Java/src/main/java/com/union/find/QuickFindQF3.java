package com.union.find;

public class QuickFindQF3 {

	private int[] id;
	private int[] szId;
	
	public QuickFindQF3(int count) {
		id = new int[count];
		szId = new int[count];
		for (int i = 0; i < count; i++) {
			id[i] = i;
			szId[i] = 1;
		}
	}
	
	private int root(int i) {
		while (id[i] != i) {
			id[i] = id[id[i]];
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
	
	private int find(int i) {
		int max = 0;
		for (int j = 0; j < id.length; j++) {
			if (connected(i, j) && max < j) {
				max = j;
			}
		}
		return max;
	}
	
	public static void main (String args[]) {
		QuickFindQF3 quickFinder = new QuickFindQF3(100000000);
		quickFinder.union(3, 5);
		quickFinder.union(3, 8);
		quickFinder.union(9, 5);
		quickFinder.union(2, 75);
		quickFinder.union(75, 9999);
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
		long t1 = System.nanoTime();
		System.out.println("FIND : " + quickFinder.find(1));
		System.out.println("FIND : " + quickFinder.find(2));
		System.out.println("FIND : " + quickFinder.find(6772399));
		System.out.println(quickFinder.connected(53892,67742));
		System.out.println(quickFinder.connected(53892,67741));
		System.out.println((System.nanoTime() - t1));
	}
	
	
}
