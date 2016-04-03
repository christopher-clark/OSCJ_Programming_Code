package com.chris.oscjp.chapter7;
import java.util.*;

public class Inserter {
	// method with a non-generic List argument
	void insert(List list) {
	list.add(new Integer(42)); // adds to the incoming list
	System.out.println("List = " + list.toString());
	list.add("Hello World"); // adds to the incoming list
	System.out.println("List = " + list.toString());
	}
}
