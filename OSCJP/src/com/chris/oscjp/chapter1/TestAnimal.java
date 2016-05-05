package com.chris.oscjp.chapter1;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a = new Animal();
		Cat c = new Cat();
		Dog d = new Dog();
		makeNoises(a);
		makeNoises(c);
		makeNoises(d);
		Animal felix = c;
		System.out.println(c.name);
		c.makeNoise();
		if(c instanceof Animal){
			System.out.println("cat is an Animal");
		}
	}
	public static void makeNoises(Animal a){
		//a.makeNoise();
		System.out.println(a.name);
	}

}
