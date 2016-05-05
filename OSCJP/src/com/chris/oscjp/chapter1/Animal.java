package com.chris.oscjp.chapter1;

public class Animal {
	String name;
	 
	Animal(String name) {
	 this.name = name;
	}
	Animal(){
		this(makeRandomName());
	}
	
	static String makeRandomName() {
		 String [] name = {"Fluffy", "Fido","Rover", "Spike","Gigi"};
		 return name[(int) (Math.random() * name.length)];
	}
	public void makeNoise(){
		System.out.println("Animal Noise ");
	}
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}
	public void eat(int i) {
		System.out.println("Animal eating " + i + " pieces of Food");

	}
}
