package com.chris.oscjp.chapter8;

public class TestMyThread {

	public static void main(String[] args) {
		for(int i =0;i < 1000;i++){
			MyThread mt = new MyThread();
			mt.run();
			System.out.println("I = " + i);
		}

	}

}
