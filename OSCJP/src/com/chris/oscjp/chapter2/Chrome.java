package com.chris.oscjp.chapter2;

class Chrome {
public static void main(String [] args) {
	X x1 = new X();
	X x2 = new Y();
	Y y = new Y();
	((Y)x2).do2();
	y.do1();
	y.do2();
	} 
}
