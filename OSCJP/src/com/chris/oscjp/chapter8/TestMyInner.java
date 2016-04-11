package com.chris.oscjp.chapter8;

public class TestMyInner {

	public static void main(String[] args) {
		NumAndCharGenerator randData = new NumAndCharGenerator();
		NumAndCharGenerator.NumGen num = randData.new NumGen();
		for(int i =0; i < 10;i++){
			randData.showName();
			num.showNum();
		}
	}
}
