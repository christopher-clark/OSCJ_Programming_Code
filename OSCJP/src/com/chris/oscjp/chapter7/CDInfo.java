package com.chris.oscjp.chapter7;

public class CDInfo implements Comparable<CDInfo>{
	private String genre;
	private String artist;
	private String title;
	private int rating;
	
	// Manual Comparable - doesn't work with int Instance variable as they do not implement Comparable like Strings do !!!!!!!
	public int compareTo(CDInfo cdInfo){
		return artist.compareTo(cdInfo.artist);
	}
		
	// Constructor(s)
	CDInfo(){
		super();
	}
	CDInfo(String genre, String artist, String title, int rating){
		this.genre = genre;
		this.artist = artist;
		this.title = title;
		this.rating = rating;
	}
	public String getGenre(){
		return genre;
	}
	public String getArtist(){
		return artist;
	}
	public String getTitle(){
		return title;
	}
	public Integer getRating(){
		return rating;
	}
	public void setGenre(String genre){
		this.genre = genre;
	}
	public void setArtist(String artist){
		this.artist = artist;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setRating(int rating){
		this.rating = rating;
	}
}
