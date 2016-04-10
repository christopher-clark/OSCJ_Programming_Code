package com.chris.oscjp.chapter8;

public class City {
	class Manhattan {
		void doStuff() throws Exception { 
			System.out.print("x "); 
		}
	}
	class TimesSquare extends Manhattan {
		void doStuff() throws Exception { 
		}
	}
	public static void main(String[] args) throws Exception {
		new City().go();
	}
	void go() throws Exception { 
		new TimesSquare().doStuff(); 
	}
}
