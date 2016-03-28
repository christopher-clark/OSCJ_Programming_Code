package com.chris.oscjp.chapter6;
import java.util.regex.*;

public class DigitRegex {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\w+");
		Matcher m = p.matcher("1 a12 234b");
			while(m.find()) {
				System.out.print(" " + m.start() + " " +  m.group());
			}
	}
}
