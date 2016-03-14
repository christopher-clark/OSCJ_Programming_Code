package com.chris.oscjp.chapter5;

public class OverRideTest {

	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.makeNoise();
		Dog d = new Dog();
		d.makeNoise();
		Cat c = new Cat();
		c.makeNoise();
		Animal aniKitten = new Kitten();
		aniKitten.makeNoise();
		ani.makeNoise();
		//Cat cat = (Cat) ani;
	}

}
