package com.chris.oscjp.chapter7;
import java.util.Comparator;

public class CDGenreSort implements Comparator<CDInfo>  {
	public int compare(CDInfo one, CDInfo two) {
		return one.getGenre().compareTo(two.getGenre());
	}
}

