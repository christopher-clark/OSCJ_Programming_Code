package com.chris.oscjp.chapter7;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<String> test = new Vector<String>();
		String s = "hi";
		test.add("string");
		test.add(s);
		test.add(2,"hello");
		test.add(1,s+s);
		if(test.contains("hello"))
			test.add("list contained hello");
		
		test.add(test.elementAt(0));
		
		Iterator<String> it = test.iterator();
		while(it.hasNext())
			System.out.println("Iterator = " + it.next());

		System.out.print("\n");
		Collections.sort(test);
		Iterator<String> its = test.iterator();
		while(its.hasNext())
			System.out.println("Iterator = " + its.next());
		
		
	}
}

