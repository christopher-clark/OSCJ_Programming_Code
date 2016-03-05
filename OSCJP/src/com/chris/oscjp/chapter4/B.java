package com.chris.oscjp.chapter4;

class B extends A {
	{ System.out.println("B Class");} 
	public static void main (String [] args) {
	A myA = new B();
	A myB = new A();
	m2(myA);
	m2(myB);
	}
	public static void m2(A a) {
	if (a instanceof B){
	((B)a).doBstuff(); // downcasting an A reference to a B reference
	}
	else{
		System.out.println("'a' refers to an A");
	}
	}
	
	public static void doBstuff() {
	System.out.println("'a' refers to a B");
	}
}
