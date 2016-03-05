package com.chris.oscjp.chapter4;

class Salary {
	public static void main(String [] args) {
	/*int numOfPets = 3;
	String status = (numOfPets<4) ? "Pet limit not exceeded" : "too many pets";
	System.out.println("This pet status is " + status);*/
	
	String [] sNums = {"one", "two", "three"};
	int [][] twoDee = {{1,2,3}, {4,5,6}, {7,8,9}};
	
	for(int[] n : twoDee)
		System.out.println("twoDee = " + n);
	for(int n2 : twoDee[2])
		System.out.println("twoDee = " + n2);
	for(String s : sNums)
		System.out.println("sNums are = " + s);
	}
	
}
