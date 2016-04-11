package com.chris.oscjp.chapter8;

class FooRunnable implements Runnable {
	public void run() {
		for(int x = 1; x < 6; x++) {
			System.out.println("Runnable running");
		}
	}
}