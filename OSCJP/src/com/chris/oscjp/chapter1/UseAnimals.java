package com.chris.oscjp.chapter1;

class UseAnimals {
	public void doStuff(Animal a) {
		System.out.println("In the Animal version");
	}
	public void doStuff(Horse h) {
		System.out.println("In the Horse version");
	}
	public static void main (String [] args) {
		UseAnimals ua = new UseAnimals();
		Animal animalObj = new Animal();
		Horse horserObj = new Horse();
		Animal aniHorse = new Horse();
		ua.doStuff(animalObj);
		ua.doStuff(horserObj);
		ua.doStuff(aniHorse);
	}
}
