package com.chris.oscjp.chapter1;

public class TestOverloadAndOverRide {

	public static void main(String[] args) {
		SuperClass sc = new SuperClass();
		SubClass subC = new SubClass();
		SuperClass superSub = new SubClass();
		TestOverloadAndOverRide toao = new TestOverloadAndOverRide();
		toao.showOverload(superSub);
		toao.showOverload(sc);
		toao.showOverload(subC);
		SuperClass c = new SuperClass();
		
		
		Animal [] a = {new Animal(), new Dog(), new Animal() };
		
		for(Animal ani : a){
			if(ani instanceof Dog) {
				Dog d = (Dog) ani; // casting the ref. var.
				d.woof();
			}
		}
		c.overRide();
	}
	public void showOverload(SuperClass s){
		s.overRide();
	}

}
