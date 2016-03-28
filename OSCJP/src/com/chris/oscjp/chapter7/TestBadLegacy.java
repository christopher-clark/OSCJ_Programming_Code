package com.chris.oscjp.chapter7;
import java.util.*;

public class TestBadLegacy {
	public static void main(String[] args) {
		int j = 0;
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(4);
		myList.add(6);
		Inserter in = new Inserter();
		in.insert(myList); // pass List<Integer> to legacy code
		System.out.println("myList = " + myList.toString());
		for(int i = 0;i < myList.size(); i++){
			System.out.println("myList = " + myList.get(i));
			j += myList.get(i);
		}
	}
}
