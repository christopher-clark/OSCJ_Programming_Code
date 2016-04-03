package com.chris.oscjp.chapter7;
import java.util.*;

public class GenericTest {

	static List<Dog> dogList = new ArrayList<Dog>();
	static List<Animal> aniList = new ArrayList<Animal>();
	static List<Cat> catList = new ArrayList<Cat>();
	static List<Bird> birdList = new ArrayList<Bird>();
	
	public static void main(String[] args) {
				
		Dog fido = new Dog();
		fido.setName("Fido");
		fido.setType("Irish Wolfhound");
		Dog tom = new Dog();
		tom.setName("Tom");
		tom.setType("Boxer");
		Dog miles = new Dog();
		miles.setName("Miles");
		miles.setType("Terrier");
		dogList.add(fido);
		dogList.add(tom);
		dogList.add(miles);
		
		Cat jerry = new Cat();
		jerry.setName("Jerry");
		jerry.setType("House Cat");
		Cat felix = new Cat();
		felix.setName("Felix");
		felix.setType("Cartoon Cat");
		Cat persian = new Cat();
		persian.setName("Persian");
		persian.setType("Persian");
		catList.add(jerry);
		catList.add(felix);
		catList.add(persian);
		
		Bird hawk = new Bird();
		hawk.setName("hawkeye");
		hawk.setType("Hawk");
		Bird eagle = new Bird();
		eagle.setName("Baldy");
		eagle.setType("Eagle");
		Bird robin = new Bird();
		robin.setName("Robin Redbreast");
		robin.setType("Robin");
		birdList.add(hawk);
		birdList.add(eagle);
		birdList.add(robin);
		
		aniList.add(fido);
		aniList.add(tom);
		aniList.add(miles);
		aniList.add(jerry);
		aniList.add(felix);
		aniList.add(persian);
		aniList.add(hawk);
		aniList.add(eagle);
		aniList.add(robin);

		GenericTest genTest = new GenericTest();
		genTest.showAnimals();
		System.out.println();
		Collections.reverse(aniList);
		genTest.showAnimals();
	}

	public void addAnimal(ArrayList<? extends Animal> ani){
		for(int i = 0;i < ani.size();i++ ){
			System.out.println("Animal name is " + aniList.get(i).getName() + "\n Animal Type = " + aniList.get(i).getType());
		}
	}
	public void showAnimals(){
		for(int i = 0;i < aniList.size();i++){
			System.out.println("Animal name is " + aniList.get(i).getName() + "\nAnimal Type = " + aniList.get(i).getType());
		}
	}
}
