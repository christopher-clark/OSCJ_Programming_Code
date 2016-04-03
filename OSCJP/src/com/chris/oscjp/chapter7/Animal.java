package com.chris.oscjp.chapter7;

abstract class Animal {
	private String name;
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		return "Name = " + name + " Type =  " + type + "\n";
	}
	public abstract void checkup();
}
