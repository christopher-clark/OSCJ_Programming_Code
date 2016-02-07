package com.scjp.chapter1;

public class TrafficLightsTest {
	
	private String colour;
	
	public static void main(String[] args) {
		Light light = new Light();
		light.colour = TrafficLightColours.AMBER;
		String warning = light.colour.getWarning();
		System.out.println("Traffic light colour is " + light.colour + "\n");
		System.out.println("Traffic light warning is " + warning + "\n");
		
		for(TrafficLightColours traf: TrafficLightColours.values()){ 
			System.out.println("Traffic light colour enum values are : " + traf); 
		}
	}
}
