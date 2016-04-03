package com.chris.oscjp.chapter7;

public class ArrayTest {
	
	private Animal[] ani = new Animal[3];
	
	public static void main(String [] args){
		ArrayTest at = new ArrayTest();
		Dog d = new Dog();
		at.addAnimal(d);
		
	}
	public void addAnimal(Animal a){
		ani[0] = (Cat) a;
		System.out.println("Adding a new Cat");
	}
}
