package com.chris.oscjp.chapter6;
import java.util.regex.*;

public class RegexTest {
public static void main(String [] args) {
	Pattern p = Pattern.compile("aba"); // the expression
	Matcher m = p.matcher("ababaaba"); // the source
		while(m.find()) {
		System.out.print(m.start() + " ");
		}
	}
}

