package com.chris.oscjp.chapter5;

import org.omg.CORBA.TRANSACTION_MODE;

public class StringTest {
	public static void main(String[] args){
		StringTest st = new StringTest();
		//st.conCat();
		//st.compSt//st.unassigned();
		st.chain();
	}
	public void conCat(){
		String s1 = "spring ";
		String s2 = s1 + "summer ";
		s1.concat("fall ");
		s2.concat(s1);
		s1 += "winter ";
		System.out.println(s1 + " " + s2);
	}
	public void compStr(){
		String s1 = "spring    ";
		String s2 = s1 + "summer ";
		String s3 = "SPRING";
		String s4 = s1.trim().toUpperCase();
	//	if(s1.trim().equalsIgnoreCase(s2))
		if(s4.equals(s3))
			System.out.println(s4 + "s1 == s3");
		 else 
			System.out.println(s4 +" s1 != s3");

		if(s1.trim().equalsIgnoreCase(s3))
			System.out.println("Trimmed s1 == s3");
		 else 
			System.out.println("s1 != s3");
	}
	public void unassigned() {
		String x = "abc";
		x.concat("def");
		System.out.println("x = " + x); // output is "x = abc"
	}
	public void chain(){
	String x = "abc";
	String y = x.concat("def").toUpperCase().replace('C','x');
	//chained methods
	System.out.println("Chained y = ABxDEF = " + y);
	}
}
