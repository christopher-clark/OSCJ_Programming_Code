package com.chris.oscjp.chapter3;
import com.chris.oscjp.chapter2.*;
public class retOverload {
	
	static Animal a;
	static Cat c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = new Animal();
		overload(a);
		c = new Cat();
		overload(c);
	}
	public static Animal overload(Animal a){
		System.out.println("Returning an Animal");
		return a;
	}
	public static Animal overload(Cat c){
		System.out.println("Returning a Cat");
		return c;
	}
}
