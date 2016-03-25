package com.chris.oscjp.chapter5;

public class Cat extends Animal {
	
	String name;
	
	public Cat(){
		super();
	}
	public Cat(String name){
		this.name = name;
	}
	public void makeNoise(){
		System.out.println(" Meiow Meiow");
	}
}
