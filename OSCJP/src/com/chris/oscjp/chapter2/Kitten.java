package com.chris.oscjp.chapter2;

public class Kitten extends Cat {
	public void eat() {
		System.out.println("Overridden Kitten Eating");
	}
	public void eat(int i) {
		System.out.println("Overloaded Kitten Eating");
	}
}
