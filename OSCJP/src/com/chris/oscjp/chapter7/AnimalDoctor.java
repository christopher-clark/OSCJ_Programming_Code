package com.chris.oscjp.chapter7;
import java.util.*;

public class AnimalDoctor {
	// method takes an array of any animal subtype
	public void checkAnimals(Animal[] animals) {
		for(Animal a : animals) {
		a.checkup();
		}
	}
	public static void main(String[] args) {
		
	List<Animal> ani = new ArrayList<Animal>();
	ani.add(new Cat()); // OK
	ani.add(new Dog()); // OK
	
	// test it
	Dog[] dogs = {new Dog(), new Dog()};
	Cat[] cats = {new Cat(), new Cat(), new Cat()};
	Bird[] birds = {new Bird()};
	Animal[] animals = {new Cat(), new Dog(),new Bird(),new Bird(),new Bird(), new Cat(), new Dog(),new Bird()};
	Animal[] c = birds;
	AnimalDoctor doc = new AnimalDoctor();
	doc.checkAnimals(dogs); // pass the Dog[]
	doc.checkAnimals(cats); // pass the Cat[]
	doc.checkAnimals(birds); // pass the Bird[]
	System.out.println();
	doc.checkAnimals(animals);
	System.out.println();
	doc.checkAnimals(c);
	Dog mutley = new Dog();
	mutley.setName("Mutley");
	mutley.setType("Cartoon Dog");
	System.out.println(mutley.toString());
	
	if(mutley instanceof Dog)
		System.out.println("mutley is a Dog");
	if(mutley instanceof Animal)	
		System.out.println("mutley is an Animal");

	}
}
