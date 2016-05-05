package com.chris.oscjp.chapter1;

public class StaticConstructor {
	static int counter;
	static StaticConstructor[] stats = new StaticConstructor[100];
	public StaticConstructor(){
		counter++;
		System.out.println("Constructor count = " + counter);
	}
	public static void main(String[] args){
		for(int i = 0; i < 100; i++){
			stats[i] = new StaticConstructor();
		}
	}
}
