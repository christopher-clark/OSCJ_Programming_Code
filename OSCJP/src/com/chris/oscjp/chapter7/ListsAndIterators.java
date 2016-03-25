package com.chris.oscjp.chapter7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListsAndIterators {

	public static void main(String[] args) {
		List<CDInfo> music = new ArrayList<CDInfo>();
		
		CDInfo miles = new CDInfo("Jazz", "Miles Davis", "Kind of Blue", 99);
		CDInfo mingus = new CDInfo("Jazz", "Charle Mingus", "Mingus Ah Um", 89);
		CDInfo dylan = new CDInfo("Folk Music", "Bob Dylan", "Blonde on Blonde", 94);
		CDInfo coltrane = new CDInfo("Jazz", "John Coltrane", "A love Supreme", 100);
		CDInfo dizzy = new CDInfo("Jazz", "The Quintet", "The Quintet at Massey Hall", 95);
		CDInfo weather_report = new CDInfo("Jazz Fusion", "Weather Report", "Heavy Weather", 92);
		CDInfo stanley = new CDInfo("Jazz Rock", "Stanley Clarke", "School Days", 99);
		CDInfo clash = new CDInfo("New Wave", "The Clash", "London Calling", 100);
		
		music.add(miles);
		music.add(mingus);
		music.add(clash);
		music.add(coltrane);
		music.add(dizzy);
		music.add(dylan);
		music.add(weather_report);
		music.add(stanley);
		
		System.out.println("music size = " + music.size());
		
		Iterator<CDInfo> it = music.iterator();
		while(it.hasNext()){
			System.out.println(" CD is " + it.next().getArtist());
		}
		
		music.remove(2);
		System.out.println();
		CDInfo[] sounds = new CDInfo[music.size()];
		sounds = music.toArray(sounds);
		for(CDInfo inf : sounds)
			System.out.println(" CD is " + inf.getTitle());
	}

}
