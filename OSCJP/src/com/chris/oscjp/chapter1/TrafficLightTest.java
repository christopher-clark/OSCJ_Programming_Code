package com.chris.oscjp.chapter1;

enum WarningColours {RED, AMBER, GREEN}

class TrafficLight{
	Enum<WarningColours> colour;
}

public class TrafficLightTest {

	public static void main(String[] args) {
		TrafficLight tl = new TrafficLight();
		tl.colour = WarningColours.RED;
		for(WarningColours wc : WarningColours.values())
			System.out.println("Enum values are - " + wc);
	}

}
