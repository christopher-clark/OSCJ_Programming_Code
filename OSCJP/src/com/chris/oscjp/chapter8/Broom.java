package com.chris.oscjp.chapter8;

class Broom {
	static int y = 25;
	static class B2 {
		void goB2() { 
			System.out.println("hi 2 + y = " + (2+y)); 
		} 
	}
	public static void main(String[] args) {
		BigOuter.Nest n = new BigOuter.Nest(); // both class names
		n.go();
		B2 b2 = new B2(); // access the enclosed class
		b2.goB2();
	}
}
