package com.chris.oscjp.chapter7;

public class Book implements Comparable<Book> {
	private String genre;
	private String author;
	private String title;
	private Integer isbn;
	private enum status {NEW ,SECOND_HAND, EX_LIBRIS , FIRST_EDITION };
	
	Book(){
		super();
	}
	Book(String genre, String author, String title, int isbn){
		this.genre = genre;
		this.author = author;
		this.title = title;
		this.isbn = isbn;
	}
	
	public int compare(Book one, Book two) {
		return one.getIsbn().compareTo(two.getIsbn());
	}
	public void setGenre(String genre){
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public String getGenre() {
		return genre;
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
