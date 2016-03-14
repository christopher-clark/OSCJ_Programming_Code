package com.chris.oscjp.chapter5;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.*;

public class LocaleTest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2010, 11, 14);
		Date dte = cal.getTime();
		System.out.println("Current date = " + dte);

		Locale locBR = new Locale("pt","BR"); // Portugal	
		DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, locBR);
		System.out.println("Brazil " + dfBR.format(dte));
		
		System.out.println("location " + locBR.getDisplayCountry());
		System.out.println("language " + locBR.getDisplayLanguage(locBR));
	}

}
