package com.chris.oscjp.chapter6;
import java.io.*;

import com.chris.oscjp.chapter5.Dog;

class SuperNotSerial {
	public static void main(String [] args) {
		Dog d = new Dog(12, "Fido");
		
		System.out.println("before: " + d.name + " " + d.weight);
		
		try {
		FileOutputStream fs = new FileOutputStream("testSer.ser");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(d);
		os.close();
		} catch (Exception e) { e.printStackTrace(); }
		
		try {
		FileInputStream fis = new FileInputStream("testSer.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		d = (Dog) ois.readObject();
		ois.close();
		} catch (Exception e) { e.printStackTrace(); }
		System.out.println("after: " + d.name + " "	+ d.weight);
	}
}
