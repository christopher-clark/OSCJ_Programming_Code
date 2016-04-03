package com.chris.oscjp.chapter7;
import java.util.Comparator;

public class BookIsbnSort implements Comparator<Book>  {
	public int compare(Book one, Book two) {
		return one.getIsbn().compareTo(two.getIsbn());
	}
}

