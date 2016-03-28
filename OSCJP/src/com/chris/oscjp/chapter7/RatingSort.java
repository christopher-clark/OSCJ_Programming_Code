package com.chris.oscjp.chapter7;
import java.util.*;

public class RatingSort implements Comparator<CDInfo>  {
		public int compare(CDInfo one, CDInfo two) {
		return one.getRating().compareTo(two.getRating());
		}
}

