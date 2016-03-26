package com.chris.oscjp.chapter7;
import java.util.*;

public class CDSortTest {
	
	private static List<CDInfo> cdCollection = new ArrayList<CDInfo>();
	
	public static void main(String[] args) {
		CDSortTest cdSort = new CDSortTest();
		CDInfo miles = new CDInfo("Jazz", "Miles Davis", "Kind of Blue", 99);
		CDInfo mingus = new CDInfo("Jazz", "Charle Mingus", "Mingus Ah Um", 89);
		CDInfo dylan = new CDInfo("Folk Music", "Bob Dylan", "Blonde on Blonde", 94);
		CDInfo coltrane = new CDInfo("Jazz", "John Coltrane", "A love Supreme", 100);
		CDInfo dizzy = new CDInfo("Jazz", "The Quintet", "The Quintet at Massey Hall", 95);
		CDInfo weather_report = new CDInfo("Jazz Fusion", "Weather Report", "Heavy Weather", 92);
		CDInfo stanley = new CDInfo("Jazz Rock", "Stanley Clarke", "School Days", 99);
		CDInfo clash = new CDInfo("New Wave", "The Clash", "London Calling", 100);
		addCD(miles);
		addCD(mingus);
		addCD(clash);
		addCD(coltrane);
		addCD(dizzy);
		addCD(dylan);
		addCD(weather_report);
		addCD(stanley);
		System.out.println("Unsorted ordered by addition");
		cdSort.displayDetails();
		System.out.println("Sorted by Ratings");
		RatingSort rs = new RatingSort();
		Collections.sort(cdCollection,rs);
		cdSort.displayDetails();
		System.out.println("Sorted by Genre");
		GenreSort gs = new GenreSort();
		Collections.sort(cdCollection,gs);
		cdSort.displayDetails();
	}
	
	public static void addCD(CDInfo details){
		cdCollection.add(details);
	}
	public static void displayDetails(){
		for(CDInfo info : cdCollection){
			System.out.println("CD contains : " + info.getGenre() + " " + info.getArtist() + " " + info.getTitle() + " " + info.getRating()); 
		}
	}
	public void sortCDs(ArrayList<CDInfo> CcdCollection){
		Collections.sort(cdCollection);
	}
}
