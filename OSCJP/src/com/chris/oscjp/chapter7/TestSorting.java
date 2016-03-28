package com.chris.oscjp.chapter7;

import java.util.ArrayList;
import java.util.Collections;

public class TestSorting {

	private static ArrayList<String> addresses =  new ArrayList<String>();
	
	public static void main(String[] args) {
		
		TestSorting ts = new TestSorting();
		ts.addAddress("Clapham");
		ts.addAddress("Brixton");
		ts.addAddress("Mayfair");
		ts.addAddress("Brixton");
		ts.addAddress("Belgravia");
		ts.addAddress("Notting Hill");
		ts.addAddress("Pimlico");
		ts.displayAdresses();
		ts.sortAddresses(addresses);
		ts.displayAdresses();

	}
	public void addAddress(String address){
		addresses.add(address);
	}
	public void displayAdresses(){
		for(String add : addresses){
			System.out.println("Address contains : " + add); 
		}
	}
	public void sortAddresses(ArrayList<String> addresses){
		Collections.sort(addresses);
	}
}
