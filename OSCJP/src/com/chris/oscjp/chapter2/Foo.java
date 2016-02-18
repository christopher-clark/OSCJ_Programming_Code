package com.chris.oscjp.chapter2;

class Foo {
	static int x = 3;
	static void main (String [] args) {
		//int x = 3;
		System.out.println("x is " + x);
		show();
	}
	static void show(){
		System.out.println("Show in main()");
	}
}