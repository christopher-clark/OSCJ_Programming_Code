package com.chris.oscjp.chapter2;

class Frog {
	int frogSize = 0;
	public int getFrogSize() {
	return frogSize;
	}
	public Frog(int s) {
	frogSize = s;
	}
	public static void main (String [] args) {
		Frog f = new Frog(25);
		System.out.println(f.getFrogSize()); // Access instance
		// method using f
	}
}