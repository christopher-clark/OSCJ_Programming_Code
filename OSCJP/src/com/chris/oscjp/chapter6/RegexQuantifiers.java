package com.chris.oscjp.chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuantifiers {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".*?xx");
		Matcher m = p.matcher("yyxxxyxx");
			while(m.find()) {
				System.out.print(m.start() + " ");
			}

	}

}
