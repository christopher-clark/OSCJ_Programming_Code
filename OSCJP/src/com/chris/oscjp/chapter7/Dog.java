package com.chris.oscjp.chapter7;
import java.util.*;

class Dog extends Animal {
	
	// Constructor
	public Dog(){
		super();
	}
	public Dog(String n) {
		name = n; 
	}
	Dog(int s) { 
		size = s; 
	}
	public String name;
	public int size;
	
	public String toString(){
		return "Name = " + this.name + " Size = " + this.size;
	}
	public boolean equals(Object o) {
		if((o instanceof Dog) &&(((Dog)o).name == name)) {
			return true;
		} else {
			return false;
		}
	}
	public int hashCode(){
		return name.length(); 
	}
	public void checkup() { // implement Dog-specific code
		System.out.println("Dog checkup");
	}
}

