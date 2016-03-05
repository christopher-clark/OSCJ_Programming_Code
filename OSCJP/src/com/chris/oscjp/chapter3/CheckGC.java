package com.chris.oscjp.chapter3;

import java.util.Date;

import com.chris.oscjp.chapter2.Animal;
import com.chris.oscjp.chapter2.Horse;
 public class CheckGC {
 public static void main(String [] args) {
	 Runtime rt = Runtime.getRuntime();
	 Animal[] ani10 = new Animal[10];
	 for(int i = 0; i < ani10.length; i++ )
		 ani10[i] = new Animal();
	 
	 Animal[] ani5 = new Animal[5];
	 for(int i = 0; i < ani5.length; i++ )
		 ani5[i] = new Animal();
	 
	 ani5 = ani10;
	Horse[] hor = new Horse[10];
	// ani = hor;
	// hor = (Horse) ani;
	 System.out.println("Total JVM memory: " + rt.totalMemory());
	 System.out.println("Before Memory = " + rt.freeMemory());
	  Date d = null;
		  for(int i = 0;i<1000000;i++) {
		  d = new Date();
		  rt.gc(); // an alternate to System.gc()
			 System.out.println("After GC Memory = " + rt.freeMemory());
		  d = null;
		  }
	  System.out.println("After Memory = " + rt.freeMemory());
	  rt.gc(); // an alternate to System.gc()
	 //System.out.println("After GC Memory = " + rt.freeMemory());
	  }
}
