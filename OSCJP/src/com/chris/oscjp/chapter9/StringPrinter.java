package com.chris.oscjp.chapter9;

public class StringPrinter extends Thread{
	static StringBuffer sb;
		
	public void run(){
		synchronized (sb) {
			for(int i = 0 ; i < 3;i++){
				System.out.println("Printed by " + Thread.currentThread().getName());
				System.out.println("String Buffer = " + sb); 
			}
			sb = new StringBuffer("B");
		}
		System.out.println("sb = " + sb);
		if(sb.toString() == "B"){
			System.out.println("Changing sb from \"A\" to \"B\"");
		}
			
	}
	public StringPrinter() {
		super();
	}
	StringPrinter(StringBuffer sb){
	}
	public static void main(String[] args){
		
		sb = new StringBuffer("A");
		StringPrinter sp1 = new StringPrinter(sb);
		StringPrinter sp2 = new StringPrinter(sb);
		StringPrinter sp3 = new StringPrinter(sb);
		sp3.start();
		sp1.start();
		sp2.start();
	}
}
