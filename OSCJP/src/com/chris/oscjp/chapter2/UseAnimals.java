package com.chris.oscjp.chapter2;

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
		Horse horseObj = new Horse();
		ua.doStuff(animalObj);
		ua.doStuff(horseObj);
		horseObj.eat();
		horseObj.eat("Hay");
		Animal an = new Horse();
		an.eat();
		
	}
}
