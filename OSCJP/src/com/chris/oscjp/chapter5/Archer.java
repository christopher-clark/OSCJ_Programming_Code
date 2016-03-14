package com.chris.oscjp.chapter5;
import java.io.Serializable;

public class Archer extends GamePlayer implements Serializable {
	String name;
	String weapon;
	
	Archer(String name, int power){
		this.name = name;
		this.power = power;
	}
}
