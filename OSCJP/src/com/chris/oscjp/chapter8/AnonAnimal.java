package com.chris.oscjp.chapter8;

public class AnonAnimal {
	Animal a = new Animal(){public String getType(){
		return "Anonymous Animal";
		}
	public void checkup(){}
	};
	public String getName(){
		return a.getType();
	}
	
}
