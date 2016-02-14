package com.chris.oscjp.chapter2;

public class AnimalTest {

	public static void main(String[] args) {
		LeadRope rope = new LeadRope();
		Animal horse = new Horse();
		Animal a = new Animal();
		horse.eat();
		a.eat();
		Animal cat = new Cat();
		cat.eat();
		Animal kit = new Kitten();
		kit.eat();
	}

}
