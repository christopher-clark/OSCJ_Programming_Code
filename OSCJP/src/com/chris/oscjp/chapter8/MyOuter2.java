package com.chris.oscjp.chapter8;

class MyOuter2 {
	
	private String x = "Outer2";
	
	void doStuff() {
	String z = "local variable";
		class MyInner {
			public void seeOuter() {
				System.out.println("Outer x is " + x);
				System.out.println("Local variable z is " + z); // Won't Compile!
			} // close inner class method
		} // close inner class definition
		MyInner min = new MyInner();
		System.out.println("In doStuff-->MyInner");
		min.seeOuter();
	} // close outer class method doStuff()
}
