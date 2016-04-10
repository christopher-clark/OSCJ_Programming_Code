package com.chris.oscjp.chapter8;

public class TestMyOuter {

	public static void main(String[] args) {
		
		MyOuter mo = new MyOuter();
		MyOuter.MyInner inner = mo.new MyInner();
		inner.seeOuter();
		System.out.print(inner.toString());
	}
}
