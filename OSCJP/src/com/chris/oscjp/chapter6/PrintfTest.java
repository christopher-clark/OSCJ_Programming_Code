package com.chris.oscjp.chapter6;

public class PrintfTest {

	public static void main(String[] args) {
		float f = -199.0987654f;
		int i = 1024;
		int neg = -998;
		String s = "Hello World";
		System.out.printf("Neg int =  %(d  \n",neg);
		System.out.printf("float =  %f ",f);
	}

}
