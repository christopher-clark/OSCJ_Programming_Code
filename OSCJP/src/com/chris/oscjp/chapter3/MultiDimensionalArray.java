package com.chris.oscjp.chapter3;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		final int SIZE = 5;
		int[][] multi = new int[SIZE][SIZE];
		
		for(int i = 0; i < SIZE; i++){
			for(int y = 0; y < SIZE; y++){
				multi[i][y] = y * i;
				System.out.println(" i = " + i + " y = " + y + " multi[i][y] = " + multi[i][y]);
			}
		}
		

	}

}
