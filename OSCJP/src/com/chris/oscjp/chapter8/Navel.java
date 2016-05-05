package com.chris.oscjp.chapter8;
import com.chris.oscjp.chapter9.BankDeposit;

public class Navel {
	private int size = 7;
	private static int length = 3;
	
	public static void main(String[] args) {
		new Navel().go();
		BankDeposit bd = new BankDeposit();
	}
	void go() {
		System.out.println(new Gazer().adder());
	}
	class Gazer {
		int adder() { 
			return size * length; 
		}
	}
}
