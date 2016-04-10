package com.chris.oscjp.chapter9;

public class TimerThread implements Runnable{

	public void run() {
		for(int i = 0;i < 99;i++){
			try {
				Thread.sleep(10);
				if(i % 10 == 0)
					System.out.println(" I = " + i);
					System.out.println("Name of current Thread is " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(" Loop Over ");
		System.out.println("Name of current Thread is " + Thread.currentThread().getName());
	}

}
