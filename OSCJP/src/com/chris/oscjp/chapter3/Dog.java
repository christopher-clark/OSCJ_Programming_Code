package com.chris.oscjp.chapter3;
class Dog {
	Collar c; // instance variable
	String name; // instance variable
	int weight;
	
	public static void main(String [] args) {

	Dog d; // local variable: d
		d = new Dog();
		d.go(d);
	}
	void go(Dog dog) { // local variable: dog
		c = new Collar();
		dog.setName("Aiko");
	}
	void setName(String dogName) { // local var: dogName
		name = dogName;
		System.out.println("Dog name = " + name);
	}
}
