package com.chris.oscjp.chapter8;

public class NumAndCharGenerator {
	int[] numbers = {1,2,3,4,5,6,7,8,9,0};
	String[] names = {"chris","liam","georgie","lil","brendan","snez","aj"};
	private String name;
	private int num;
	
	public String showName(){
		num = numbers[(int) (Math.random() * numbers.length)];
		System.out.println("Outer Number = " + num);
		name = names[(int) (Math.random() * names.length)];
		System.out.println("Name = " + name);
		return name;
	}
	public String toString(){
		return name;
	}
	class NumGen{
		public void showNum(){
			name = names[(int) (Math.random() * names.length)];
			num = numbers[(int) (Math.random() * numbers.length)];
			System.out.println("Inner Number = " + num);
		}
		public String toString(){
			return name;
		}
	}
}
