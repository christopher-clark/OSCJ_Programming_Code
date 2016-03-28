package com.chris.oscjp.chapter5;
import java.io.Serializable;

public class Animal implements Serializable {
	int weight = 55;
	
	public void makeNoise(){
		System.out.println(" Animal Noise");
	}
}
