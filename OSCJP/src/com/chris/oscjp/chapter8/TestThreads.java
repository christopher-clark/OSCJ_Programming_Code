package com.chris.oscjp.chapter8;

public class TestThreads {
	public static void main (String [] args) {
		FooRunnable r = new FooRunnable();
		Thread t = new Thread(r);
		t.start();
	}
}
