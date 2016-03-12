package com.chris.oscjp.chapter5;

public class MyException {

	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("Please enter a Food String");
		}
		try{echo $CLASSPATH
			checkFood(args[0]);
		} catch (BadFoodException bfe) {
			System.out.println("Dont like that Food String Try another");
			bfe.printStackTrace();
		} finally {
			System.out.println("Food String was " + args[0]);
		}

	}
	public static void checkFood(String food) throws BadFoodException {
		String[] badfoods = {"eggs", "veg","custard"};
		
		for(int i = 0; i < badfoods.length; i++){
			if(food == badfoods[i]){
				System.out.println("Dont like that so I'm throwing an Exception");
				throw new BadFoodException();
			}
			else {
				System.out.println("I like that Food String" + food);
			}
		}
	}
}

