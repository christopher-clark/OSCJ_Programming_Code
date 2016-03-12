package com.chris.oscjp.chapter5;

import java.io.IOError;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		ExceptionTest excTest = new ExceptionTest();
		
			try {
				System.out.println("String before swap was test = after = " + excTest.swapString("test"));
				excTest.swapString("");
			} catch (IOException e) {
				
				e.printStackTrace();
			} finally {
				System.out.println("Ended main()");
			}
	}
	public String swapString (String s) throws IOException{
		String reverseStr = "";
		if(s.length() == 0)
			throw new IOException();
		
		for(int i=s.length()-1;i>=0;--i) {
		reverseStr += s.charAt(i);
		}
		return reverseStr;
	}

}
