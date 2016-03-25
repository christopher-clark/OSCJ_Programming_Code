package com.chris.oscjp.chapter7;
import java.util.*;

class SearchObjArray {
		public static void main(String [] args) {
		String [] sa = {"zero","one", "two", "three", "four"};
		Arrays.sort(sa); 													// #1
		for(String s : sa)
			System.out.print(s + " ");
		System.out.println("\none = "+ Arrays.binarySearch(sa,"one")); 		// #2
		System.out.println("now reverse sort");
		ReSortComparator rs = new ReSortComparator();						 // #3
		Arrays.sort(sa,rs);
		for(String s : sa)
			System.out.print(s + " ");
		System.out.println("\none in binarySearch with no comparator = " + Arrays.binarySearch(sa,"one")); 	// #4
		System.out.println("one where search was passed the  resort comparator rs = " + Arrays.binarySearch(sa,"one",rs)); 	// #5
		}
	static class ReSortComparator implements Comparator<String> { // #6
			public int compare(String a, String b) {
			return b.compareTo(a); // #7
		}
	}
}
