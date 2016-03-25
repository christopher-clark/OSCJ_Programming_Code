package com.chris.oscjp.chapter7;
import java.util.*;
public class ListToArrayTest {
	public static void main(String [] args){
		List<String> names = new ArrayList<String>();
		
		names.add("Georgie");
		names.add("Liam");
		names.add("Chris");
		names.add("Lil");
		names.add("Snez");
		names.add("Brendan");
		
		for(int i = 0; i < names.size(); i++)
			System.out.println("Names contains " + names.get(i));
		
		System.out.println();
		
		String[] sa = new String[names.size()];
		sa = names.toArray(sa);
		
		for(String str : sa)
			System.out.println("String array contains " + str);
		
			
	}
}
