package com.chris.oscjp.chapter7;

import java.util.Arrays;

public class ArraySortTest {

	public static void main(String [] args){
		AtomicElement [] elements = {new AtomicElement("Helium",10), new AtomicElement("Oxygen",1), new AtomicElement("Nitrogen", 80),
									 new AtomicElement("Carbon", 12)};
		
		int [] intArr = new int[10];
		
		for(int i = 0; i < intArr.length; i++){
		intArr[i] = (int) (Math.random() * intArr.length )+1;
			System.out.println(" Array [] " + i + " = " + intArr[i]);
		}
		System.out.println();
		Arrays.sort(intArr);
		for(int i = 0; i < intArr.length; i++)
			System.out.println(" Array [] " + i + " = " + intArr[i]);
		
		System.out.println();
		for(int i = 0; i < elements.length;i++){
			System.out.println(" Element [] " + i + " name = " + elements[i].getName() + " number = " + elements[i].getNumber());
		}
	}
}
