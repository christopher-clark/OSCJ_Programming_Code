package com.chris.oscjp.chapter7;
import java.util.*;

public class BookSortTest {
	
	private static List<Book> library = new ArrayList<Book>();
	
	public static void main(String[] args) {
		BookSortTest bookSort = new BookSortTest();
		Book miles = new Book("Jazz", "Miles Davis", "Kind of Blue", 99);
		Book mingus = new Book("Jazz", "Charle Mingus", "Mingus Ah Um", 89);
		Book dylan = new Book("Folk Music", "Bob Dylan", "Blonde on Blonde", 94);
		Book coltrane = new Book("Jazz", "John Coltrane", "A love Supreme", 100);
		Book dizzy = new Book("Jazz", "The Quintet", "The Quintet at Massey Hall", 95);
		Book weather_report = new Book("Jazz Fusion", "Weather Report", "Heavy Weather", 92);
		Book stanley = new Book("Jazz Rock", "Stanley Clarke", "School Days", 99);
		Book clash = new Book("New Wave", "The Clash", "London Calling", 100);
		addBook(miles);
		addBook(mingus);
		addBook(clash);
		addBook(coltrane);
		addBook(dizzy);
		addBook(dylan);
		addBook(weather_report);
		addBook(stanley);
		System.out.println("Unsorted ordered by addition");
		bookSort.displayDetails();
		System.out.println("Sorted by Author");
		BookAuthorSort authorSort = new BookAuthorSort();
		Collections.sort(library,authorSort);
		bookSort.displayDetails();
		
		System.out.println("Sorted by ISBN");
		BookIsbnSort isbnSort = new BookIsbnSort();
		Collections.sort(library,isbnSort);
		bookSort.displayDetails();
		
	}
	
	public static void addBook(Book details){
		library.add(details);
	}
	public static void displayDetails(){
		for(Book info : library){
			System.out.println("CD contains : " + info.getGenre() + " " + info.getAuthor() + " " + info.getTitle() + " " + info.getIsbn()); 
		}
	}
	public void sortCDs(ArrayList<Book> library){
		Collections.sort(library);
	}
}
