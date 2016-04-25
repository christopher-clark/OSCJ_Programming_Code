package com.chris.oscjp.chapter1;
import prot_test.*;

public class extProt extends AccessTest{
	public void displayProtVar(){
		System.out.println("Protected Method's String  = " + protString);
		AccessTest at = new AccessTest();
		
	}
	
}
