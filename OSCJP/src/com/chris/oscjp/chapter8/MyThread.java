package com.chris.oscjp.chapter8;

public class MyThread implements Runnable {
	public void run(){
		System.out.println("MyThread run ()");
		try {
			   // thread to sleep for 1000 milliseconds
			   Thread.sleep(1000);
			   } catch (Exception e) {
			   System.out.println(e);
		 }
	  }
}
