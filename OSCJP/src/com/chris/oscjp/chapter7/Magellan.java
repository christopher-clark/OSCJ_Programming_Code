package com.chris.oscjp.chapter7;
import java.util.*;

 public class Magellan {
 public static void main(String[] args) {
	 TreeMap<String, String> myMap = new TreeMap<String, String>();
	 myMap.put("a", "apple"); 
	 myMap.put("d", "date");
	 myMap.put("f", "fig"); 
	 myMap.put("p", "pear");
	 SortedMap<String, String> sub;
	 System.out.println("1st after mango: " + // sop 1
	 myMap.higherKey("f"));
	/* System.out.println("1st after mango: " + // sop 2
	 myMap.ceilingKey("f"));
	 System.out.println("1st after mango: " + // sop 3
	 myMap.floorKey("f"));
	 sub = new TreeMap<String, String>();
	 sub = myMap.tailMap("f");
	 System.out.println("1st after mango: " + // sop 4
	 sub.firstKey());*/
	 }
}
