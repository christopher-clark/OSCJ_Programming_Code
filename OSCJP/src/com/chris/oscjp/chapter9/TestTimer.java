package com.chris.oscjp.chapter9;

public class TestTimer {
	public static void main(String[] args){
		System.out.println("Name of current Thread is " + Thread.currentThread().getName());
		TimerThread timer = new TimerThread();
		PrintThread pt = new PrintThread();
		Thread t = new Thread(timer);
		Thread p = new Thread(pt);
		t.start();
		try {
			p.start();
			t.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("End of Main() ");
		System.out.println("Name of current Thread is " + Thread.currentThread().getName());
	}
}
