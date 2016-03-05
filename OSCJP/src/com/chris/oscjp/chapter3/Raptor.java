package com.chris.oscjp.chapter3;

class Raptor extends Bird {
	static { 
		System.out.println("first Raptor static init block "); 
	}
	static { 
		System.out.println("second Raptor static init block"); 
	}
	{ 
		System.out.println("Raptor Instance init block "); 
	}
	public Raptor() { 
		System.out.println("Raptor constructor "); 
	}
}
