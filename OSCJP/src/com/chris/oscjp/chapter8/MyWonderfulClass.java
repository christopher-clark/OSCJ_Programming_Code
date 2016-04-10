package com.chris.oscjp.chapter8;

class MyWonderfulClass {
	void go() {
		Bar b = new Bar();
		
		b.doStuff(new Foo() {
			public void foof() {
					System.out.println("foofy");
			} // end foof method
		}); // end inner class def, arg, and b.doStuff stmt.
	} // end go()
} // end class
