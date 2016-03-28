package com.chris.oscjp.chapter7;
import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> test = new ArrayList<String>();
		String s = "hi";
		test.add("string");
		test.add(s);
		test.add(s+s);
		System.out.println(test.size());
		System.out.println(test.contains(42));	
		for(String str : test){
			System.out.println(" test = " + str);
		}
	}

}
