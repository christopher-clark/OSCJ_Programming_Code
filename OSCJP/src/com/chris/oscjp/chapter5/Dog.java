package com.chris.oscjp.chapter5;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
	String name; // instance variable
	
	
	public Dog(int i, String string) {
		weight = i;
		name = string;
	}

	public void makeNoise(){
		System.out.println(" Woof Woof");
	}
}
