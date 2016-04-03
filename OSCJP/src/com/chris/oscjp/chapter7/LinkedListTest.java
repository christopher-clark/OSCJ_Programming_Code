package com.chris.oscjp.chapter7;

import java.util.*;


public class LinkedListTest {
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		String s = "hi";
		
		list.add("string");
		list.add(s);
		list.add("hello");
		list.add(s+s);
		
		if(list.contains("hello"))
			list.add("list contained hello");
		
				
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.println("Iterator = " + it.next());

		System.out.print("\n");
		
		Collections.sort(list);
	//	if(list.contains("hihi"))
	//		list.remove("hihi");
		
		Iterator<String> its = list.iterator();
		while(its.hasNext())
			System.out.println("Sorted Iterator = " + its.next());
		
		System.out.print("\n");
		Collections.reverse(list);
		Iterator<String> itss = list.iterator();
		while(itss.hasNext())
			System.out.println("reversed List = " + itss.next());
	}
}
