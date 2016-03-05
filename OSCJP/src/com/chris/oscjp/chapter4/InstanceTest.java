package com.chris.oscjp.chapter4;

class InstanceTest {
	public static void main(String [] args) {
	String a = null;
	boolean b = null instanceof String;
	boolean c = a instanceof String;
	System.out.println(b + " " + c);
	int [] nums = new int[1];
	System.out.println(nums instanceof Object);
	}
}
