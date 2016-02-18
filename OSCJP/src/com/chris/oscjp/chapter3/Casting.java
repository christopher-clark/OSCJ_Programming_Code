package com.chris.oscjp.chapter3;

class Casting {
	public static void main(String [] args) {
		int x = (int) 3957.229; // illegal
		System.out.println("int x = " + x);
		byte b = (byte) 773957.229;
		System.out.println("byte b  = " + b);
		float f = 1024.0124f;
		short s = (short) f;
		System.out.println("float f  = " + f);
		System.out.println("short s  = " + s);
		double d = f;
		System.out.println("double d  = " + d);
		byte tiny = (byte) 128;
		System.out.println("tiny  = " + tiny);
		byte B = 3;
		B += 7;
		byte g = 3;
		g = (byte) (g + 7);
	}
}
