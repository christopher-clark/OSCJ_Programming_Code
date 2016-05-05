package com.chris.oscjp.chapter1;
import prot_test.*;
public class ProtectedTest {

	public static void main(String[] args) {
			extProt ep = new extProt();
			ep.displayProtVar();
			Access access = new Access();
			access.showDefString();
	}

}
