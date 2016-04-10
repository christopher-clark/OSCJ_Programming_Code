package com.chris.oscjp.chapter9;

import com.chris.oscjp.chapter7.GenericTest;
import java.util.*;

public class PrintThread implements Runnable{
	public void run(){
		Calendar cal = Calendar.getInstance();
		for(int i =0;i < 10;i++){
			try{
				System.out.println("Time = " + cal.getTimeInMillis());
				System.out.println("Name of current Thread is " + Thread.currentThread().getName());
				Thread.sleep(500);
			}
			catch (InterruptedException ie){
				ie.printStackTrace();
			}
			
		}
		System.out.println("End of PrintThread\n");
	}
}
