package com.chris.oscjp.chapter3;

public class ShadowLocalVar {
	static int size = 1;
	
	public static void main(String [] args){
		ShadowLocalVar shad = new ShadowLocalVar();
		System.out.println("size in main = " + size);
		shad.changeSize(size);
		System.out.println("size in main 2 = " + size);
	}
	public void changeSize(int size){
		size = size + 12;
		System.out.println("size = " + size);
	}
}
