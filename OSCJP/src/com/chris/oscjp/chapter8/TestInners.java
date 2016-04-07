package com.chris.oscjp.chapter8;

public class TestInners {
	public static void main(String[] args) {
		new TestInners().go();
	}
	void go() {
		new A().m();
		class A { 
			void m() { 
			System.out.println("inner"); 
			} 
		}
	}
	class A { 
		void m() { 
			System.out.println("middle"); 
			} 
	}
}