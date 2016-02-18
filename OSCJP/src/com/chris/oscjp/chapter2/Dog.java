package com.chris.oscjp.chapter2;

class Dog extends Animal {
	void makeNoise() 
	{
		System.out.println("bark");
	}
	void playDead() { 
		System.out.println("roll over"); 
	}
	public void bark() 
	{ 
		System.out.print("woof "); 
	}
	public void eat(){
		System.out.println("Overidden dog eating "); 
	}
}
