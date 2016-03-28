package com.chris.oscjp.chapter6;
import java.util.*;
import java.text.NumberFormat;

class Dates2 {
	public static void main(String[] args) {
		Date d1 = new Date(1000000000000L);
		System.out.println("1st date " + d1.toString());
		Calendar c = Calendar.getInstance();
		c.setWeekDate(1964, 7, 1);
		Date d4 = c.getTime(); // #5
		System.out.println("new date " + d4.toString() );
		c.setTime(d1); // #1
			if(Calendar.SUNDAY == c.getFirstDayOfWeek()) // #2
				System.out.println("Sunday is the first day of the week");
			
		System.out.println("trillionth milli day of week is " + c.get(Calendar.DAY_OF_WEEK)); // #3
		c.add(Calendar.MONTH, 1); // #4
		Date d2 = c.getTime(); // #5
		System.out.println("new date " + d2.toString() );
		
		Locale loc = new Locale("us");
		NumberFormat nf = NumberFormat.getCurrencyInstance(loc);
		System.out.println("Num format = " + nf.format(100.00));
	}
}
