package com.chris.oscjp.chapter7;

public class AtomicElement {
	private String name;
	private int number;
	
	AtomicElement(){
		super();
	}
	AtomicElement(String name, int num){
		this.name = name;
		this.number = num;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setNumber(int num){
		this.number = num;
	}
	public String getName(){
		return this.name;
	}
	public int getNumber(){
		return this.number;
	}
}
