package com.chris.oscjp.chapter6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.chris.oscjp.chapter5.Archer;
import com.chris.oscjp.chapter5.GamePlayer;
import com.chris.oscjp.chapter5.Swordsman;

public class TestSerialise {

	public static void main(String[] args) {
		GamePlayer gp = new GamePlayer();
		System.out.println("gp power " + gp.power);
		Archer archer = new Archer("achilles", 1);
		Swordsman swordsman = new Swordsman(1014, "Excalibur");
	//	Swordsman swordsman = new Swordsman();
		
		
		System.out.println(" Archer constructor name =  " + archer.name + " Archer instance weapon = " + archer.weapon + " Archer contructor power = " + archer.power);
		System.out.println(" Swordsman contructor  power =  " + swordsman.power + " Swordsman name = " + swordsman.name + " Swordsman constructor weapon = " + swordsman.weapon);

		try {
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(archer);
			os.close();
			} catch (Exception e) { e.printStackTrace(); }
			
			try {
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			archer = (Archer) ois.readObject();
			ois.close();
			} catch (Exception e) { e.printStackTrace(); }
			System.out.println("Afterwards Archer name =  " + archer.name + " Archer instance  weapon = " + archer.weapon + " Archer inherited power = " + archer.power);
			System.out.println(" Swordsman contructor power =  " + swordsman.power + " Swordsman inherited name = " + swordsman.name + " Swordsman constructor weapon = " + swordsman.weapon);

	}

}
