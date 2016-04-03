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
		addCD(miles);
		addCD(weather_report);
		addCD(stanley);
		CDInfo[] cds = {miles,mingus,dylan,coltrane,dizzy,weather_report,stanley,clash};
		
		System.out.println("Unsorted ordered by addition");
		cdSort.displayDetails();
		System.out.println("Sorted by Ratings");
		CDRatingSort rs = new CDRatingSort();
		Collections.sort(cdCollection,rs);
		cdSort.displayDetails();
		System.out.println("Sorted by Genre");
		CDGenreSort gs = new CDGenreSort();
		Collections.sort(cdCollection,gs);
		cdSort.displayDetails();
		
		
		for(int i=0;i < cds.length;i++)
			System.out.println("CD = " + cds[i].getArtist() + cds[i].getGenre() + cds[i].getTitle() );
		System.out.println("Miles Davis = "
				+ Arrays.binarySearch(cds,miles));
		System.out.println("Weather Report = "
				+ Arrays.binarySearch(cds,weather_report));
		System.out.println("The Clash = "
				+ Arrays.binarySearch(cds,clash));
		
		Arrays.sort(cds);
		Animal[] ani = new Animal[2];
		Cat[] cat = new Cat[2];
		/*cat = ani;
		ani = cat;*/
		
		for(int i=0;i < cds.length;i++)
			System.out.println("Sorted by Artist = " + cds[i].getArtist() + cds[i].getGenre() + cds[i].getTitle() );
		
		System.out.println("Miles Davis = "
				+ Arrays.binarySearch(cds,miles));
		System.out.println("Weather Report = "
				+ Arrays.binarySearch(cds,weather_report));
		System.out.println("The Clash = "
				+ Arrays.binarySearch(cds,clash));
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
