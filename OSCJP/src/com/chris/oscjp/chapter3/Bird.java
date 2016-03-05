package com.chris.oscjp.chapter3;

class Bird {
	static { 
		System.out.println("first Bird static init block "); 
	}
	{ 
		System.out.println("bird instance init block "); 	
	}
	public Bird() 
	{ System.out.println("bird Constructor "); }
}
