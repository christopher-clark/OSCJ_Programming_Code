package com.chris.oscjp.chapter7;
import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> test = new ArrayList<String>();
		String s = "hi";
		test.add("string");
		test.add(s);
		test.add(2,"hello");
		test.add(1,s+s);
		
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


