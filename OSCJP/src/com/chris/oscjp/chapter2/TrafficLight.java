package com.chris.oscjp.chapter2;

public class TrafficLight {

	enum Status { RED("Danger"), AMBER("Warning"), GREEN("Safe to Go"); 
	
	private String warningMessage;
	private Status(String warningMessage){
	this.warningMessage = warningMessage;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Status stat : Status.values()){
			System.out.println("Statuses are : " + stat);
			System.out.println("Warnings are : " + stat.warningMessage);
		}

	}

}
