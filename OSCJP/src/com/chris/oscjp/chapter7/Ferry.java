package com.chris.oscjp.chapter7;
import java.util.*;

public class Ferry {
public static void main(String[] args) {
	TreeSet<Integer> times = new TreeSet<Integer>();
	
	times.add(1205); // add some departure times
	times.add(1505);
	times.add(2830);
	times.add(1830);
	times.add(2810);
	times.add(1545);
	times.add(1830);
	times.add(2010);
	
	times.add(2100);
	NavigableSet<Integer> timesDesc = times.descendingSet();

	
	
	System.out.println("J6 - last before 4pm is: " + times.lower(1600));
	System.out.println("J6 - first after 8pm is: " + times.higher(2000));
	
	Iterator<Integer> setIt = timesDesc.iterator(); 
		while(setIt.hasNext()){
			System.out.println("Iterator = " + setIt.next());
		}
	System.out.println("TreeMap methods ");
	System.out.println("Ceiling 1206 = " + times.ceiling(1206));	
	System.out.println("lower 1830 = " + times.lower(1830));
	System.out.println("floor 1830 = " + times.floor(1830));
	System.out.println("higher 1830 = " + times.higher(1830));
	System.out.println("ceiling 1830 = " + times.ceiling(1830));
	System.out.println("NavigableMap versions");
	
	}
}