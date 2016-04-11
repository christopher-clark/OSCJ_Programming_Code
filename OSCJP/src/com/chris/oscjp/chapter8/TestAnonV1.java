package com.chris.oscjp.chapter8;

public class TestAnonV1 {

	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.setType("Animal");
		AnonAnimal anon = new AnonAnimal();
		System.out.println("Animal type = " + ani.getType());
		System.out.println("Anonymous Animal type = " + anon.a.getType());
		System.out.println("Anonymous Animal name = " + anon.getName() + " Name ");
		

	}

}
