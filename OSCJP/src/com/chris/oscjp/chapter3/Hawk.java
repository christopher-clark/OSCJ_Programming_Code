package com.chris.oscjp.chapter3;

class Hawk extends Raptor {
	static { 
		System.out.println("first Hawk static init block "); 
	}
	public static void main(String[] args) {
		System.out.println("pre ");
		new Hawk();
		System.out.println("hawk ");
	}
}
