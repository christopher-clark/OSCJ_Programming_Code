package com.scjp.chapter1;

enum TrafficLightColours { RED("Danger"), AMBER("Warning"), GREEN("Safe");

	private TrafficLightColours(String warning) {
		this.warning = warning;
	}
	
	private String warning;
	public String getWarning(){
		return warning;
	}
}
class Light {
	TrafficLightColours colour;

}
