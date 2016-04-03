package com.chris.oscjp.chapter8;

class MyOuter {
	private int x = 7;
	
	public void makeInner() {
		MyInner in = new MyInner(); // make an inner instance
		in.seeOuter();
	}
	// inner class definition
		class MyInner {
			String name = "MyInner";
			
			public void seeOuter() {
				System.out.println("Outer x is " + x);
				System.out.println("Inner class ref is " + this);
				System.out.println("Outer class ref is " + MyOuter.this);
			}
			public String toString(){
				return name;
			}
		
	} // close inner class definition
} // close outer class