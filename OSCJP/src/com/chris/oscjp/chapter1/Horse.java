package com.chris.oscjp.chapter1;

public class Horse extends Animal{
	public void eat() {
		System.out.println("Horse Eating Hay and Oats");
	}
	public void eat(String s) {
		System.out.println("Horse eating " + s);
	}
	public void eat(int i) {
		System.out.println("Horse eating " + i + " bales of Hay");

	}
	public void eat(float f) {
		System.out.println("Horse eating " + f + " bales of Hay");

	}
}
