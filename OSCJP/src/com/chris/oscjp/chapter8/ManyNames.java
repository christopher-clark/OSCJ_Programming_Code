package com.chris.oscjp.chapter8;

public class ManyNames {
public static void main(String [] args) {
	// Make one Runnable
	NameRunnable nr = new NameRunnable();
	
	
	System.out.println("Name of current Thread is " + Thread.currentThread().getName());
	System.out.println("Id of current Thread is " + Thread.currentThread().getId());
	Thread one = new Thread(nr);
	Thread two = new Thread(nr);
	Thread three = new Thread(nr);

	one.setName("Fred");
	two.setName("Lucy");
	three.setName("Ricky");
	
	two.start();
	three.start();
	one.start();
	}
}
