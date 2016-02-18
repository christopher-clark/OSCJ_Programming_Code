package com.chris.oscjp.chapter3;

public class Foo {
	Bar myBar = new Bar();
	
	void changeIt(Bar myBar){
		myBar.barNum = 99;
		System.out.println("myBar.barNum in changeIt is " + myBar.barNum);
		myBar = new Bar();
		System.out.println("myBar Bar Object Reference is now pointing to a new Bar Object");
		myBar.barNum = 240;
		System.out.println("myBar.barNum in changeIt is " + myBar.barNum);
	}
	public static void main(String[] args) {
		Foo f = new Foo();
		System.out.println("f.myBar.barNum is " + f.myBar.barNum);
		f.changeIt(f.myBar);
		System.out.println("f.myBar.barNum after call to changeIt is " + f.myBar.barNum);
	}
}
