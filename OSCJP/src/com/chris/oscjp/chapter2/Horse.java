package com.chris.oscjp.chapter2;

public class Horse extends Animal {
	private Halter myHalter = new Halter();
	public void tie(LeadRope rope) {
	myHalter.tie(rope); // Delegate tie behavior to the
	// Halter object
	}
	public void buck(){
	}
	public void eat() {
		//super.eat();
		System.out.println("Overidden horse eating");
	}
	public void eat(String s) {
		System.out.println("Horse eating " + s);
	}
}
