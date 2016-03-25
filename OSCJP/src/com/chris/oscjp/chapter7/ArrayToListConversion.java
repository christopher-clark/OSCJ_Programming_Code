package com.chris.oscjp.chapter7;

import java.util.Arrays;
import java.util.List;

public class ArrayToListConversion {

	public static void main(String[] args) {
		String [] sa = {"zero","one", "two", "three", "four"};
		List<String> alist = Arrays.asList(sa);
		
		for(String str : sa)
			System.out.println("sa element = " + str);
		System.out.println();
		for(int i = 0; i < alist.size(); i++)
			System.out.println("list element = " + alist.get(i));
		
		//alist.set(3,"six"); // change List
	//	sa[1] = "five"; // change array
		alist.set(0,"twenty");
		sa[2] = "nine";
		
	//	Arrays.sort(sa);
		System.out.println();
		for(String str : sa)
			System.out.println("sa element = " + str);
		System.out.println();
		for(int i = 0; i < alist.size(); i++)
			System.out.println("list element = " + alist.get(i));
		
		Arrays.sort(sa);
		System.out.println();
			for(String str : sa)
				System.out.println("sa element = " + str);
			
			for(int i = 0; i < alist.size(); i++)
				System.out.println("list element = " + alist.get(i));
	}

}
