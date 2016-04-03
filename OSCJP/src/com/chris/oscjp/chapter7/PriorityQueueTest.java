package com.chris.oscjp.chapter7;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueueTest {
	public static void main(String[] args){
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("2");
		pq.add("4");
		System.out.print(pq.peek() + " ");
		pq.offer("1");
		pq.add("3");
		pq.remove("1");
		System.out.print(pq.poll() + " ");
		if(pq.remove("2")) 
		System.out.print(pq.poll() + " ");
		
		System.out.println(pq.poll() + " " + pq.peek());
		System.out.println();
		
		TreeSet<String> s = new TreeSet<String>();
		TreeSet<String> subs = new TreeSet<String>();
		 s.add("a"); 
		 s.add("b"); 
		 s.add("c"); 
		 s.add("d"); 
		 s.add("e");
		
		 subs = (TreeSet)s.subSet("b", true, "d", true);
		 
		 s.add("g");
		 
		 s.pollFirst();
		 s.pollFirst();
		 s.add("c2");
		 System.out.println(s.size() +" "+ subs.size());
	}
}
