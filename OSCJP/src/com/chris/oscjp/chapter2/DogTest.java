package com.chris.oscjp.chapter2;

class DogTest {
	public static void main(String [] args) {
		Animal animal = new Animal();
		Dog d = (Dog) animal; // compiles but fails later
	}
}
