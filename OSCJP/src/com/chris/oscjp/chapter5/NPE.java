package com.chris.oscjp.chapter5;

class NPE {
	static String s;
	public static void main(String [] args) {
		if(s ==null)
			System.out.println("S is null !!! ");
	System.out.println(s.length());
	}
}