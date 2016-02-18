package com.chris.oscjp.chapter2;

public class TestOverride {
	public static void main(String[] args){
		Animal ani = new Animal();
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal kitten = new Kitten();
		Kitten olkitten = new Kitten();
		Animal horse = new Horse();
		ani.eat();
		dog.eat();
		cat.eat();
		kitten.eat();
		olkitten.eat(1);
		horse.eat();
//		Horse h = (Horse) ani;  // Downcast of Animal-->Horse fails at runtime
	}
}
