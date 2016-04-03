package com.chris.oscjp.chapter7;
import java.util.Comparator;

public class BookAuthorSort implements Comparator<Book>  {
	public int compare(Book one, Book two) {
		return one.getAuthor().compareTo(two.getAuthor());
	}
}

