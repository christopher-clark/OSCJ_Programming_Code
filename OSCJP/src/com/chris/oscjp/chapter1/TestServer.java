package com.chris.oscjp.chapter1;

class TestServer {
	int count = 9; // Declare an instance variable named count
	
	public void logIn() {
	int count = 100; // Declare a local variable named count
		System.out.println("local variable count is " + count);
	}
	public void count() {
		System.out.println("instance variable count is " + count);
	}
	public static void main(String[] args) {
		new TestServer().logIn();
		new TestServer().count();
	}
}