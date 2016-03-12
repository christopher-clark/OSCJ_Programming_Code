package com.chris.oscjp.chapter5;

class DownCastTest{
	public static void main(String [] args) {
	Animal animal = new Animal();
	Dog d = (Dog) animal; // compiles but fails later
	}
}
